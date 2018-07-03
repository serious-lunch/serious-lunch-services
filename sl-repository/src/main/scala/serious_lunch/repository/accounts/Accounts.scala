package serious_lunch.repository.accounts

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object Accounts extends SeriousLunchTable[Accounts]("accounts")

case class Accounts(
)
