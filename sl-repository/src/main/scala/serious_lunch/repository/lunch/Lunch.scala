package serious_lunch.repository.lunch

import java.util.Date
import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object Lunch extends SeriousLunchTable[Lunch]("lunches")

case class Lunch(
    lunchId: Long,
    accountId: Long,
    lunchDate: Date,
    comment: Option[String],
    createdAt: ZonedDateTime,
    updatedAt: ZonedDateTime,
)
