package hello

import java.util.Date

import scala.beans.BeanProperty

case class Message(@BeanProperty hostname: String, @BeanProperty time: Date, @BeanProperty language: String = "Scala")
