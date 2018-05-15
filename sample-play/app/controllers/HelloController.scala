package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}
import serious-lunch.sample.domain.Greeting

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { implicit request: Request[AnyContent] =>
    val message = Greeting messageFor "serious-lunch-services"
    Ok(message)
  }
}
