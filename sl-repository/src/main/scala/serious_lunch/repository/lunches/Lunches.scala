package serious_lunch.repository.lunches

import java.time.ZonedDateTime

import serious_lunch.repository.core.SeriousLunchTable

object Lunches extends SeriousLunchTable[Lunches]("lunches")

case class Lunches(
)
