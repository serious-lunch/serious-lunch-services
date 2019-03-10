package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class AccountsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def create() = play.mvc.Results.TODO
  def index() = play.mvc.Results.TODO
  def show(account_id: Long) = play.mvc.Results.TODO
  def update(account_id: Long) = play.mvc.Results.TODO
}
