import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object Settings {

  val name = """minimal-scalajs"""
  val version = "1.0.1"

  object versions {
    val scala = "2.11.8"
    val scalaJsDom = "0.9.0"
    val scalaJsJquery = "0.9.0"
    val scalatags = "0.6.0"

    val jquery = "2.1.4"
  }

  val jsDependencies = Def.setting(Seq(
    "org.webjars" % "jquery" % versions.jquery / "jquery.js" minified "jquery.min.js"
  ))

  val scalaJsDependencies = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-dom" % versions.scalaJsDom,
    "be.doeraene" %%% "scalajs-jquery" % versions.scalaJsJquery,
    "com.lihaoyi" %%% "scalatags" % versions.scalatags
  ))

}