package serious_lunch.repository.lunch

import java.util.Date
import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object Lunch extends SeriousLunchTable[Lunch]("lunches")

case class Lunch(
    lunch_id: Long,
    account_id: Long,
    lunch_date: Date,
    comment: Option[String],
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
