package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class LunchesController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def create() = Action { request: Request[AnyContent] =>
    Ok
  }

  def index() = Action { request: Request[AnyContent] =>
    Ok
  }

  def show(lunch_id: Long) = Action { request: Request[AnyContent] =>
    Ok
  }

  def update(lunch_id: Long) = Action { request: Request[AnyContent] =>
    Ok
  }

  def destroy(lunch_id: Long) = Action { request: Request[AnyContent] =>
    Ok
  }
}
