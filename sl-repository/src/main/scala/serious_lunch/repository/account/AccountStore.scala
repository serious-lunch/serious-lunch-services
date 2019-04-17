package serious_lunch.repository.account

import scalikejdbc.interpolation.Implicits._
import scalikejdbc.{DBSession, WrappedResultSet, select, withSQL}

object AccountStore {

  def findById(accountId: Long)(implicit session: DBSession): Option[AccountRecord] = {

    val a = Account.syntax("a")
    withSQL {
      select.from(Account as a).where.eq(a.accountId, accountId)
    }.map { rs: WrappedResultSet =>
        AccountRecord(
          accountId = rs.long(a.resultName.accountId),
          accountName = rs.string(a.resultName.accountName),
          emailAddress = rs.string(a.resultName.emailAddress),
          passwordDigest = rs.string(a.resultName.passwordDigest),
        )
      }
      .single
      .apply()
  }
}
