package serious_lunch.repository.account_reset

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountReset extends SeriousLunchTable[AccountReset]("account_resets")

case class AccountReset(
    account_id: Long,
    reset_digest: String,
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
