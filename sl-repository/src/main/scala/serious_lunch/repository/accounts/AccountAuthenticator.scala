package serious_lunch.repository.accounts

class AccountAuthenticator(account: AccountRecord){

  def isActivationAuthenticated(password: String): Boolean = {
    isAuthenticate(password)
  }

  private def isAuthenticate(token: String): Boolean = {
    true
  }
}
