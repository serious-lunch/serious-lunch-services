package serious_lunch.repository.account_resets

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountResets extends SeriousLunchTable[AccountResets]("account_resets")

case class AccountResets(
    account_id: Long,
    reset_digest: String,
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
