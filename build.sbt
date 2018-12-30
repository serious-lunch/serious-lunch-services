lazy val `sl-play` = project
  .settings(SlSettings.commons)
  .settings(
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
    ))
  .enablePlugins(PlayScala)
  .dependsOn(`sl-domain`)

lazy val `sl-domain` = project
  .settings(version := "1.0-SNAPSHOT")
  .settings(SlSettings.commons)

lazy val `sl-repository` = project
  .settings(version := "1.0-SNAPSHOT")
  .settings(SlSettings.commons)
  .settings(MySqlSettings.commons)
  .settings(ScalikeSettings.commons)
  .settings(BCryptSettings.commons)

lazy val `sl-tester` = project.aggregate(
  `sl-domain`,
  `sl-play`,
  `sl-repository`,
)

lazy val root = Project("serious-lunch-root", file("."))
