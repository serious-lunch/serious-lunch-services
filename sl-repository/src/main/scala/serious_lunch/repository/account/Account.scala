package serious_lunch.repository.account

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object Account extends SeriousLunchTable[Account]("accounts")

case class Account(
    accountId: Long,
    accountName: String,
    emailAddress: String,
    passwordDigest: String,
    createdAt: ZonedDateTime,
    updatedAt: ZonedDateTime,
)
