import sbt.Def.SettingList
import sbt.Keys._
import sbt._

object ScalikeSettings {
  lazy val commons = new SettingList(
    Seq(
      libraryDependencies ++= Seq(
        "org.scalikejdbc" %% "scalikejdbc" % "3.2.3",
        "org.scalikejdbc" %% "scalikejdbc-config" % "3.2.3",
        "org.scalikejdbc" %% "scalikejdbc-test" % "3.2.3" % "test",
      ),
    ))
}
