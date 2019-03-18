package serious_lunch.repository.account_relationship

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object AccountRelationsip
  extends SeriousLunchTable[AccountRelationsip]("account_relationships")

case class AccountRelationsip(
    accountRelationshipId: Long,
    followerAccountId: Long,
    followedAccountId: Long,
    createdAt: ZonedDateTime,
    updatedAt: ZonedDateTime,
)
