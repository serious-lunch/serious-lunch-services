package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class AccountActivationsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def update(activation_token: String) = play.mvc.Results.TODO
}
