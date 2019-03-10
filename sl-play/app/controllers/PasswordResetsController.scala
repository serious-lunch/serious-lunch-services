package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class PasswordResetsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def create() = play.mvc.Results.TODO
  def update(reset_token: String) = play.mvc.Results.TODO
}
