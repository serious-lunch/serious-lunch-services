package serious_lunch.repository.account_activation

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountActivation
  extends SeriousLunchTable[AccountActivation]("account_activations")

case class AccountActivation(
    accountId: Long,
    activationDigest: String,
    activated: Boolean,
    createdAt: ZonedDateTime,
    updatedAt: ZonedDateTime,
)
