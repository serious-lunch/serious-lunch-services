package serious_lunch.domain.account

import serious_lunch.model.Account

object AccountLoader {

  def findByAccountId(accountId: Long): Either[AccountLoaderError, Account] = {
    try {
      Account(
        accountId = accountId,
      )
    } catch {
      case e: Exception => Left(UnexpectedError(e))
    }
  }
}
