package controllers.v1

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class LunchesController @Inject()(cc: ControllerComponents)
  extends AbstractController(cc) {

  def create() = Action { request: Request[AnyContent] =>
    Ok
  }

  def index() = Action { request: Request[AnyContent] =>
    Ok
  }

  def show(lunchId: Long) = Action { request: Request[AnyContent] =>
    Ok
  }

  def update(lunchId: Long) = Action { request: Request[AnyContent] =>
    Ok
  }

  def destroy(lunchId: Long) = Action { request: Request[AnyContent] =>
    Ok
  }
}
