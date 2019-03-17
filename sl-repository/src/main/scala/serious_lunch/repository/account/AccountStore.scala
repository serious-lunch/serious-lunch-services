package serious_lunch.repository.account

import scalikejdbc.interpolation.Implicits._
import scalikejdbc.{DBSession, WrappedResultSet}

object AccountStore {

  def findById(accountId: Long)(implicit session: DBSession): Option[AccountRecord] = {

    sql"""
         SELECT ${a.result.*}
         FROM ${Account.as(a)}
         WHERE ${a.account_id} = ${accountId}
      """
      .map(*)
      .single
      .apply()
  }

  private val a = Account.syntax("a")

  private val * = (rs: WrappedResultSet) =>
    AccountRecord(
      account_id = rs.long(a.resultName.account_id),
      account_name = rs.string(a.resultName.account_name),
      email_address = rs.string(a.resultName.email_address),
      password_digest = rs.string(a.resultName.password_digest),
  )

}
