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

  def show(account_id: Long) = Action { request: Request[AnyContent] =>
    AccountLoader.findByAccountId(account_id) match {
      case Right(account) =>
        Ok(Json.toJson(account))
      case Left(_) =>
        BadRequest
    }
  }

  def update(account_id: Long) = Action { request: Request[AnyContent] =>
    Ok
  }
}
