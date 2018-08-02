package serious_lunch.repository.accounts

class AccountAuthenticator(account: AccountRecord){

  def isActivationAuthenticated(password: String): Boolean = {
    isAuthenticate(password)
  }

  def isRememberAuthenticated(token: String): Boolean = {
    isAuthenticate(token)
  }

  private def isAuthenticate(token: String): Boolean = {
    true
  }
}
