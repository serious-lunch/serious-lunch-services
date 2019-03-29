package controllers.v1

import javax.inject.{Inject, Singleton}
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}
import serious_lunch.domain.account.AccountLoader

@Singleton
class AccountsController @Inject()(cc: ControllerComponents)
  extends AbstractController(cc) {

  def create() = Action { request: Request[AnyContent] =>
    Ok
  }

  def index() = Action { request: Request[AnyContent] =>
    Ok
  }

  def show(accountId: Long) = Action { request: Request[AnyContent] =>
    AccountLoader.findById(accountId) match {
      case Right(account) =>
        Ok(Json.toJson(account))
      case Left(_) =>
        BadRequest
    }
  }

  def update(accountId: Long) = Action { request: Request[AnyContent] =>
    Ok
  }
}
