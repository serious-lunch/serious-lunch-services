import sbt._
import Keys._
import sbt.Def.SettingList

object SlSettings {
  lazy val commons = new SettingList(
    Seq(
      scalaVersion := "2.13.0",
      scalacOptions ++= Seq(
        "-deprecation",
        "-feature",
        "-unchecked",
        "-Xfuture",
      ),
      libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "3.0.8" % Test,
        "ch.qos.logback" % "logback-classic" % "1.2.3",
        "ch.qos.logback.contrib" % "logback-json-core" % "0.1.5",
        "ch.qos.logback.contrib" % "logback-json-classic" % "0.1.5",
        "ch.qos.logback.contrib" % "logback-jackson" % "0.1.5",
      ),
      (unmanagedResourceDirectories in Compile) += resources,
    ))

  lazy val resources: File = root.base.getAbsoluteFile / "resources"

  private lazy val root = project in file(".")
}
