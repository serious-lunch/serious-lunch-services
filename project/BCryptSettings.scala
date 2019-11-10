import sbt.Def.SettingList
import sbt.Keys._
import sbt._

object BCryptSettings {
  lazy val commons = new SettingList(
    Seq(
      libraryDependencies ++= Seq(
        "org.springframework.security" % "spring-security-web" % "5.2.1.RELEASE",
      ),
    ))
}
