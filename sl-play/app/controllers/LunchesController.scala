package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class LunchesController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def create() = play.mvc.Results.TODO
  def index() = play.mvc.Results.TODO
  def show(lunch_id: Long) = play.mvc.Results.TODO
  def update(lunch_id: Long) = play.mvc.Results.TODO
  def destroy(lunch_id: Long) = play.mvc.Results.TODO
}
