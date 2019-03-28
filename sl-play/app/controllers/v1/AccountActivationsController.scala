package controllers.v1

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class AccountActivationsController @Inject()(cc: ControllerComponents)
  extends AbstractController(cc) {

  def update(activationToken: String) = Action { request: Request[AnyContent] =>
    Ok
  }
}
