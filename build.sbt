lazy val `sl-play` = project
  .settings(SlSettings.commons)
  .settings(
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
    ),
      javaOptions in Test += {
      "-Dapplication.home=" + root.base.absolutePath
    },
  )
  .enablePlugins(PlayScala)
  .disablePlugins(PlayLogback)
  .dependsOn(`sl-domain`)

lazy val `sl-domain` = project
  .settings(version := "1.0-SNAPSHOT")
  .settings(SlSettings.commons)
  .dependsOn(`sl-repository`)
  .dependsOn(`sl-model`)

lazy val `sl-repository` = project
  .settings(version := "1.0-SNAPSHOT")
  .settings(SlSettings.commons)
  .settings(MySqlSettings.commons)
  .settings(ScalikeSettings.commons)
  .settings(BCryptSettings.commons)
  .dependsOn(`sl-model`)

lazy val `sl-model` = project
  .settings(version := "1.0-SNAPSHOT")
  .settings(ScalikeSettings.commons)
  .settings(
    libraryDependencies ++= Seq(
      "ai.x" %% "play-json-extensions" % "0.30.1",
    ))

lazy val `sl-tester` = project.aggregate(
  `sl-play`,
  `sl-domain`,
  `sl-repository`,
  `sl-model`,
)

lazy val root = Project("serious-lunch-root", file("."))
