package controllers.v1

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class SessionTokensController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def create() = Action { request: Request[AnyContent] =>
    Ok
  }

  def destroy(session_token_id: Long) = Action { request: Request[AnyContent] =>
    Ok
  }
}
