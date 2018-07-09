package serious_lunch.repository.lunches

import java.util.Date
import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object Lunches extends SeriousLunchTable[Lunches]("lunches")

case class Lunches(
    lunch_id: Long,
    account_id: Long,
    lunch_date: Date,
    comment: Option[String],
    created_at: ZonedDateTime,
    updated_at: ZonedDateTime,
)
