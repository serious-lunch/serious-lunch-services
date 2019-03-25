package serious_lunch.repository.account

import scalikejdbc.{DBSession, WrappedResultSet}
import scalikejdbc.interpolation.Implicits._

object AccountStore {

  def findById(accountId: Long)(implicit session: DBSession): Option[AccountRecord] = {

    sql"select * from accounts where account_id = ${accountId}"
      .map { rs: WrappedResultSet =>
        AccountRecord(
          accountId = rs.long("account_id"),
          accountName = rs.string("account_name"),
          emailAddress = rs.string("email_address"),
          passwordDigest = rs.string("password_digest"),
        )
      }
      .single
      .apply()
  }
}
