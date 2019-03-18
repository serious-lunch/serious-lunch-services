package serious_lunch.repository.account

import scalikejdbc.interpolation.Implicits._
import scalikejdbc.{DBSession, WrappedResultSet}

object AccountStore {

  def findById(accountId: Long)(implicit session: DBSession): Option[AccountRecord] = {

    sql"""
         SELECT ${a.result.*}
         FROM ${Account.as(a)}
         WHERE ${a.accountId} = ${accountId}
      """
      .map(*)
      .single
      .apply()
  }

  private val a = Account.syntax("a")

  private val * = (rs: WrappedResultSet) =>
    AccountRecord(
      accountId = rs.long(a.resultName.accountId),
      accountName = rs.string(a.resultName.accountName),
      emailAddress = rs.string(a.resultName.emailAddress),
      passwordDigest = rs.string(a.resultName.passwordDigest),
  )

}
