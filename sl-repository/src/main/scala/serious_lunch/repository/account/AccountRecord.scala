package serious_lunch.repository.account

case class AccountRecord(
    account_id: Long,
    account_name: String,
    email_address: String,
    password_digest: String,
)
