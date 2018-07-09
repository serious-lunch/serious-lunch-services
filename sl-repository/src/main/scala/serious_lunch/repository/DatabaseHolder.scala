package serious_lunch.repository

import scalikejdbc.NamedDB

object DatabaseHolder {

  def connectWithSeriousLunch: NamedDB = {
    NamedDB('serious_lunch)
  }

}
