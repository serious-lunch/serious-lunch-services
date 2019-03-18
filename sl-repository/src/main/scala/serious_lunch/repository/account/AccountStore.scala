package serious_lunch.repository.account

import scalikejdbc.{DBSession, select, withSQL}

object AccountStore {

  def findById(accountId: Long)(implicit session: DBSession): Option[AccountRecord] = {
    val a = Account.syntax("a")

    withSQL {
      select
        .from(Account as a)
        .where
        .eq(a.accountId, accountId)
    }.map { rs =>
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
