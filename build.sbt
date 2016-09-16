import sbt.Keys._

lazy val root: Project = (project in file("."))
  .settings(
    name := """scala-js-template""",
    version := "1.0",
    scalaVersion := "2.11.8",
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0",
    libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0",
    libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.0",
    skip in packageJSDependencies := false,
    jsDependencies += "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
  )
  .enablePlugins(ScalaJSPlugin)

