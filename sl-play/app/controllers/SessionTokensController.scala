package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class SessionTokensController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def create() = play.mvc.Results.TODO
  def destroy(session_token_id: Long) = play.mvc.Results.TODO
}
