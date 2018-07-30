package serious_lunch.repository.accounts

class AccountAuthenticator(account: AccountRecord){

  def authenticate(password: String): Boolean = {
    true
  }

  private def passwordEqualTo(password: String) = {
  }
}
