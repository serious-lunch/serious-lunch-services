package controllers.v1

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class PasswordResetsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def create() = Action { request: Request[AnyContent] =>
    Ok
  }

  def update(reset_token: String) = Action { request: Request[AnyContent] =>
    Ok
  }
}
