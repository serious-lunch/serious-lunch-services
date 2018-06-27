package serious_lunch.repository.account_cookies

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountCookies extends SeriousLunchTable[AccountCookies]("account_cookies")

case class AccountCookies(
    account_id: Long,
    remember_digest: String,
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
