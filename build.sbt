lazy val `sample-play` = project.
  settings(SampleSettings.commons).
  settings(libraryDependencies ++= Seq(
    guice,
    "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
  )).
  enablePlugins(PlayScala).
  dependsOn(`sample-domain`)

lazy val `sample-domain` = project.
  settings(SampleSettings.commons)

lazy val root = Project("sample-root", file("."))
