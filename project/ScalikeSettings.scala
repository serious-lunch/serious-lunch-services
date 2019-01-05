import sbt.Def.SettingList
import sbt.Keys._
import sbt._

object ScalikeSettings {
  lazy val commons = new SettingList(
    Seq(
      libraryDependencies ++= Seq(
        "org.scalikejdbc" %% "scalikejdbc" % "3.3.2",
        "org.scalikejdbc" %% "scalikejdbc-config" % "3.3.2",
        "org.scalikejdbc" %% "scalikejdbc-test" % "3.3.2" % "test",
      ),
    ))
}
