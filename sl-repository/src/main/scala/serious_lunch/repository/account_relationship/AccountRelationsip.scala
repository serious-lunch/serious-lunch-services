package serious_lunch.repository.account_relationship

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountRelationsip
  extends SeriousLunchTable[AccountRelationsip]("account_relationships")

case class AccountRelationsip(
    account_relationship_id: Long,
    follower_account_id: Long,
    followed_account_id: Long,
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
