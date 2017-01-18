import sbt.Keys._

lazy val root: Project = (project in file("."))
  .settings(
    name := Settings.name,
    version := Settings.version,
    scalaVersion := Settings.versions.scala,
    libraryDependencies ++= Settings.scalaJsDependencies.value,
    skip in packageJSDependencies := false,
    jsDependencies ++= Settings.jsDependencies.value
  )
  .enablePlugins(ScalaJSPlugin, WorkbenchPlugin)

