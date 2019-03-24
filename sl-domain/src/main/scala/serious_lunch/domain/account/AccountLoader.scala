package serious_lunch.domain.account

import scalikejdbc.DBSession
import serious_lunch.model.Account
import serious_lunch.repository.DatabaseHolder
import serious_lunch.repository.account.{AccountRecord, AccountStore}

object AccountLoader {

  def findById(accountId: Long): Either[AccountLoaderError, Account] = {
    try {
      DatabaseHolder.connectWithSeriousLunch.localTx { implicit session =>
        for {
          account <- findAccount(accountId)
        } yield {
          Account(
            accountId = account.accountId,
            accountName = account.accountName,
            emailAddress = account.emailAddress,
          )
        }
      }
    } catch {
      case e: Exception => Left(UnexpectedError(e))
    }
  }

  private def findAccount(accountId: Long)(
      implicit session: DBSession): Either[AccountNotFound, AccountRecord] = {
    AccountStore
      .findById(accountId)
      .toRight(AccountNotFound(s"Not found account id : ${accountId}"))
  }
}
