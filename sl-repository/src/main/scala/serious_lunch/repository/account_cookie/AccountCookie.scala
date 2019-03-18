package serious_lunch.repository.account_cookie

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountCookie extends SeriousLunchTable[AccountCookie]("account_cookies")

case class AccountCookie(
    accountId: Long,
    rememberDigest: String,
    createdAt: ZonedDateTime,
    updatedAt: ZonedDateTime,
)
