package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class AccountRelationshipsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def create() = play.mvc.Results.TODO
  def destroy(account_relationship_id: Long) = play.mvc.Results.TODO
}
