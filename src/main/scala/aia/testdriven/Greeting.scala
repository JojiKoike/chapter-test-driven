package aia.testdriven

import aia.testdriven.Greeter.Greeting
import akka.actor.{Actor, ActorLogging}

object Greeter {
  case class Greeting(message: String)
}

class Greeter extends Actor with ActorLogging {
  override def receive: Receive = {
    case Greeting(message) => log.info("Hello {}!", message)
  }
}
