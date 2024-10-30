package controllers

import models.{APIError, FileCreateModel, FileCreateModelDTO, FileDeleteModel, FileDeleteModelDTO, FileUpdateModelDTO, PokemonModel}
import play.api.libs.json.{JsError, JsSuccess, JsValue, Json}
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}
import services.RepositoryService

import java.nio.charset.StandardCharsets
import java.util.Base64
import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ApplicationController @Inject()(
                                       val controllerComponents: ControllerComponents,,
                                       val repositoryService: RepositoryService
                                     )(implicit val ec: ExecutionContext)
  extends BaseController{

}
