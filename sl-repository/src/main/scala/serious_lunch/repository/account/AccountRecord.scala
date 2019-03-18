package serious_lunch.repository.account

case class AccountRecord(
    accountId: Long,
    accountName: String,
    emailAddress: String,
    passwordDigest: String,
)
