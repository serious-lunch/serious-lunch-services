package serious_lunch.model

import ai.x.play.json.Jsonx
import play.api.libs.json.Format

case class Account(
    accountId: Long,
    accountName: String,
    emailAddress: String,
)

object Account {
  implicit def accountFormat: Format[Account] = Jsonx.formatCaseClass[Account]
}
