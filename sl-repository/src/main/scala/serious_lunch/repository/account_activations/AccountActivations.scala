package serious_lunch.repository.account_activations

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountActivations extends SeriousLunchTable[AccountActivations]("account_activations")

case class AccountActivations(
)
