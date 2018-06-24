package serious_lunch.repository.core

import scalikejdbc.SQLSyntaxSupport

class SeriousLunchTable[A](table: String) extends SQLSyntaxSupport[A] {
  override val connectionPoolName = 'serious_lunch
  override val tableName = table
}
