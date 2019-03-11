package controllers.v1

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class AccountsController @Inject()(cc: ControllerComponents)
  extends AbstractController(cc) {

  def create() = Action { request: Request[AnyContent] =>
    Ok
  }

  def index() = Action { request: Request[AnyContent] =>
    Ok
  }

  def show(account_id: Long) = Action { request: Request[AnyContent] =>
    Ok
  }

  def update(account_id: Long) = Action { request: Request[AnyContent] =>
    Ok
  }
}
