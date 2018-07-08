package serious_lunch.repository.account_relationships

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountRelationsips
  extends SeriousLunchTable[AccountRelationsips]("account_relationships")

case class AccountRelationsips(
    account_relationship_id: Long,
    follower_account_id: Long,
    followed_account_id: Long,
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
