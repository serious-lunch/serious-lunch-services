lazy val `sl-play` = project
  .settings(SlSettings.commons)
  .settings(
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
    ))
  .enablePlugins(PlayScala)
  .dependsOn(`sl-domain`)

lazy val `sl-domain` = project.settings(SlSettings.commons)

lazy val `sl-linter` = project.aggregate(
  `sl-play`,
)

lazy val root = Project("serious-lunch-root", file("."))
