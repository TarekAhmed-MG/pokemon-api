package repositories

import com.google.inject.ImplementedBy
import models.{APIError, PokemonModel}
import org.mongodb.scala.bson.conversions.Bson
import org.mongodb.scala.model.Updates.set
import org.mongodb.scala.model.{Filters, IndexModel, Indexes}
import org.mongodb.scala.result.{DeleteResult, InsertOneResult, UpdateResult}
import uk.gov.hmrc.mongo.MongoComponent
import uk.gov.hmrc.mongo.play.json.PlayMongoRepository
import org.mongodb.scala.model.Filters.empty

import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}


@ImplementedBy(classOf[DataRepository])
trait dataRepositoryTrait {
  // add method declaration here:

  // index ??
//  def create(user: UserModel): Future[Either[APIError.BadAPIResponse, InsertOneResult]]
//  def read(id: String): Future[Either[APIError.BadAPIResponse, Some[UserModel]]]
//  def update(id: String,fieldName:String, user:UserModel): Future[Either[APIError.BadAPIResponse, UpdateResult]]
//  def delete(id: String): Future[Either[APIError.BadAPIResponse, DeleteResult]]
//  def deleteAll(): Future[Unit]
}

class DataRepository @Inject()(mongoComponent: MongoComponent)(implicit ec: ExecutionContext) extends PlayMongoRepository[PokemonModel](
  collectionName = "dataModels", // "dataModels" is the name of the collection (you can set this to whatever you like).
  mongoComponent = mongoComponent,
  domainFormat = PokemonModel.formats, // UserModel.formats uses the implicit val formats we created earlier. It tells the driver how to read and write between a UserModel and JSON (the format that data is stored in Mongo)
  indexes = Seq(IndexModel( //indexes is shows the structure of the data stored in Mongo, notice we can ensure the bookId to be unique
    Indexes.ascending("login")
  )),
  replaceIndexes = false
) with dataRepositoryTrait {

}
