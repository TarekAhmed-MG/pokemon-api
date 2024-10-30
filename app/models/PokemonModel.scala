package models

import play.api.libs.json.{Json, OFormat}

case class PokemonModel()

object PokemonModel{
  implicit val formats: OFormat[PokemonModel] = Json.format[PokemonModel]
}
