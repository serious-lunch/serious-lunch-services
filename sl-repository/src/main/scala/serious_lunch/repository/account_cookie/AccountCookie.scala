package serious_lunch.repository.account_cookie

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountCookie extends SeriousLunchTable[AccountCookie]("account_cookies")

case class AccountCookie(
    account_id: Long,
    remember_digest: String,
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
