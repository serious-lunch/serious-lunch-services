package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}
import serious_lunch.sl.domain.Greeting

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { request: Request[AnyContent] =>
    val message = Greeting messageFor "serious-lunch-services"
    Ok(message)
  }
}
