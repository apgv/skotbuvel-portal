package no.skotbuvel.portal.role

import no.skotbuvel.portal.helper.DbHelper
import no.skotbuvel.portal.jooq.Sequences.ROLE_ID_SEQ
import no.skotbuvel.portal.jooq.tables.Role.ROLE
import no.skotbuvel.portal.subject.Role
import no.skotbuvel.portal.util.JavaTimeUtil
import org.jooq.Record
import org.jooq.TransactionalRunnable

class RoleRepository(private val dbHelper: DbHelper) {

    fun findAll(): List<Role> {
        return dbHelper.dslContext()
                .select(
                        ROLE.ID,
                        ROLE.NAME,
                        ROLE.ACTIVE,
                        ROLE.CREATED_BY,
                        ROLE.CREATED_DATE
                )
                .from(ROLE)
                .fetch()
                .map { mapRole(it) }
    }

    private fun mapRole(record: Record) =
            Role(
                    id = record[ROLE.ID],
                    name = record[ROLE.NAME],
                    active = record[ROLE.ACTIVE],
                    createdBy = record[ROLE.CREATED_BY],
                    createdDate = record[ROLE.CREATED_DATE].toZonedDateTime()
            )

    fun save(roleRegistration: RoleRegistration, createdBy: String) {
        val dslContext = dbHelper.dslContext()

        dslContext.transaction(TransactionalRunnable {
            dslContext.insertInto(ROLE,
                    ROLE.ID,
                    ROLE.ORIGINAL_ID,
                    ROLE.ACTIVE,
                    ROLE.NAME,
                    ROLE.CREATED_BY,
                    ROLE.CREATED_DATE
            ).values(
                    dslContext.nextval(ROLE_ID_SEQ).toInt(),
                    dslContext.currval(ROLE_ID_SEQ).toInt(),
                    true,
                    roleRegistration.name,
                    createdBy,
                    JavaTimeUtil.nowEuropeOslo()
            )
                    .execute()
        })
    }
}