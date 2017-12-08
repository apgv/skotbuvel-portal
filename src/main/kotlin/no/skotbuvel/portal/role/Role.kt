package no.skotbuvel.portal.role

import java.time.ZonedDateTime

data class Role(
        val id: Int,
        val name: String,
        val description: String,
        val active: Boolean,
        val createdBy: String,
        val createdDate: ZonedDateTime
)