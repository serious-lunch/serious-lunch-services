package serious_lunch.repository.account

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object Account extends SeriousLunchTable[Account]("accounts")

case class Account(
    account_id: Long,
    account_name: String,
    email_address: String,
    password_digest: String,
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
