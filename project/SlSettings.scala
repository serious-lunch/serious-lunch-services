import sbt._
import Keys._
import sbt.Def.SettingList

object SlSettings {
  lazy val commons = new SettingList(
    Seq(
      scalaVersion := "2.12.8",
      scalacOptions ++= Seq(
        "-deprecation",
        "-feature",
        "-unchecked",
        "-Xfuture",
      ),
      libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "3.0.4" % Test,
        "ch.qos.logback" % "logback-classic" % "1.2.3",
      ),
      (unmanagedResourceDirectories in Compile) += resources,
    ))

  lazy val resources: File = root.base.getAbsoluteFile / "resources"

  private lazy val root = project in file(".")
}
