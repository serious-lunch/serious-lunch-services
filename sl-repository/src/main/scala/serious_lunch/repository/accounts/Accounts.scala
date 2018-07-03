package serious_lunch.repository.accounts

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object Accounts extends SeriousLunchTable[Accounts]("accounts")

case class Accounts(
    account_id: Long,
    account_name: String,
    email_address: String,
    password_digest: String,
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
