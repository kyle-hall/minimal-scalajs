package com.example

import org.scalajs.dom

import scalatags.JsDom.all._

import scala.scalajs.js.annotation.JSExport

@JSExport
object Hello {
  @JSExport
  def main(root: dom.html.Div): Unit = {
    val content = h2("Hello, World.").render

    root.appendChild(content)
  }
}
