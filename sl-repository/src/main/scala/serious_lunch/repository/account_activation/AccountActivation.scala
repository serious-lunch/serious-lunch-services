package serious_lunch.repository.account_activation

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountActivation
  extends SeriousLunchTable[AccountActivation]("account_activations")

case class AccountActivation(
    account_id: Long,
    activation_digest: String,
    activated: Boolean,
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
