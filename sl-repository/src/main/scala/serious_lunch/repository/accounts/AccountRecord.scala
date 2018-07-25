package serious_lunch.repository.accounts

case class AccountRecord(
    account_id: Long,
    account_name: String,
    email_address: String,
    password_digest: String,
)
