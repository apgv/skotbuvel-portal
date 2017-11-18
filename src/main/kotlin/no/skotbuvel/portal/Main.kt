package no.skotbuvel.portal

import com.auth0.jwt.interfaces.DecodedJWT
import com.google.gson.Gson
import com.squareup.moshi.Moshi
import no.skotbuvel.portal.auth.JwtUtil
import no.skotbuvel.portal.auth.Role
import no.skotbuvel.portal.auth.userFromJWT
import no.skotbuvel.portal.config.Auth0Config
import no.skotbuvel.portal.person.Person
import no.skotbuvel.portal.person.PersonRepository
import org.flywaydb.core.Flyway
import spark.Request
import spark.Spark.*
import java.util.*

object Application {
    const val SERVER_PORT = "server.port"
    const val PROFILE = "profile"
}

fun main(args: Array<String>) {
    val argsMap = mapAndCheckArguments(args)
    val properties = properties(argsMap[Application.PROFILE] as String)

    port(argsMap[Application.SERVER_PORT]!!.toInt())
    staticFiles.location("/frontend")

    val flyway = Flyway()
    flyway.dataSource = DbUtil.datasource
    flyway.migrate()

    val personRepository = PersonRepository()

    path("api", {
        get("/persons", { request, response ->
            verifyTokenAndCheckRole(request)

            val persons = personRepository.findAll()

            response.type("application/json")
            Gson().toJson(persons)
        })

        post("/persons", { request, response ->
            val decodedJWT = verifyTokenAndCheckRole(request)

            val moshi = Moshi.Builder().build()
            val jsonAdapter = moshi.adapter(Person::class.java)
            val person = jsonAdapter.fromJson(request.body())

            if (person != null) {
                val id = personRepository.save(person, JwtUtil.email(decodedJWT))

                response.status(201)
                moshi.adapter(Int::class.java).toJson(id)
            } else {
                response.status(400)
            }
        })

        get("/auth0/config", { _, response ->
            response.type("application/json")
            Gson().toJson(auth0Config(properties))
        })
    })

}

private fun verifyTokenAndCheckRole(request: Request): DecodedJWT {
    val decodedJWT = JwtUtil.verifyAndDecode(request)
    val user = userFromJWT(decodedJWT)
    if (!user.hasRole(Role.BOARD_MEMBER)) {
        val exceptionMessage = String.format(
                "User %s (%s) is missing role %s, has roles %s",
                user.email,
                user.subject,
                Role.BOARD_MEMBER,
                user.roles
        )
        throw IllegalAccessException(exceptionMessage)
    }

    return decodedJWT
}

private fun mapAndCheckArguments(args: Array<String>): Map<String, String> {
    val argsMap = args.associate { s ->
        val split = s.split("=")
        Pair(split[0], split[1])
    }

    listOf(Application.SERVER_PORT, Application.PROFILE).forEach { arg ->
        if (!argsMap.containsKey(arg)) {
            throw IllegalArgumentException("Missing required argument '$arg'")
        }
    }

    return argsMap
}

private fun properties(profile: String) = Properties().apply {
    val fileName = "application-$profile.properties"
    Application.javaClass.classLoader.getResource(fileName).openStream().use { fis ->
        load(fis)
    }
}

private fun auth0Config(props: Properties) =
        Auth0Config(
                domain = props.getProperty(Auth0Config.DOMAIN),
                clientID = props.getProperty(Auth0Config.CLIENT_ID),
                redirectUri = props.getProperty(Auth0Config.REDIRECT_URI),
                audience = props.getProperty(Auth0Config.AUDIENCE),
                responseType = props.getProperty(Auth0Config.RESPONSE_TYPE),
                scope = props.getProperty(Auth0Config.SCOPE)
        )