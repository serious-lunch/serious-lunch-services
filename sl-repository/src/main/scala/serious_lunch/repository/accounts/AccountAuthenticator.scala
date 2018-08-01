package serious_lunch.repository.accounts

class AccountAuthenticator(account: AccountRecord){

  def isActivationAuthenticated(password: String): Boolean = {
    true
  }

  private def isAuthenticate(password: String): Boolean = {
    true
  }
}
