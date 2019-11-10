import sbt.Def.SettingList
import sbt.Keys._
import sbt._

object MySqlSettings {
  lazy val commons = new SettingList(
    Seq(
      libraryDependencies ++= Seq(
        "mysql" % "mysql-connector-java" % "8.0.18",
      ),
    ))
}
