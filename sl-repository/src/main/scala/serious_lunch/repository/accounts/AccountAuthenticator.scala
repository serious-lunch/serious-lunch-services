package serious_lunch.repository.accounts

class AccountAuthenticator(account: AccountRecord){
  val bcrypt = new BCryptPasswordEncoder()

  def isActivationAuthenticated(password: String): Boolean = {
    val token = password
    isAuthenticate(token)
  }

  def isRememberAuthenticated(token: String): Boolean = {
    isAuthenticate(token)
  }

  def isResetAuthenticated(token: String): Boolean = {
    isAuthenticate(token)
  }

  private def isAuthenticate(token: String): Boolean = {
    true
  }
}
