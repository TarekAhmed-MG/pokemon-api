name := """pokemon-api"""
organization := "com.example"

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

// Specify the Java target version for both Scala and Java compilation
ThisBuild / javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
ThisBuild / scalacOptions ++= Seq("-target:jvm-1.8")


lazy val root = (project in file("."))
  .settings(
    name := "pokemon-api"
  )
  .enablePlugins(PlayScala)

resolvers += "HMRC-open-artefacts-maven2" at "https://open.artefacts.tax.service.gov.uk/maven2"
libraryDependencies ++= Seq(
  "uk.gov.hmrc.mongo"      %% "hmrc-mongo-play-28"   % "0.63.0",
  guice,
  "org.scalatest"          %% "scalatest"               % "3.2.15"             % Test,
  "org.scalamock"          %% "scalamock"               % "5.2.0"             % Test,
  "org.scalatestplus.play" %% "scalatestplus-play"   % "5.1.0"          % Test,
  ws,
  "com.github.tomakehurst" % "wiremock-jre8" % "2.33.2" % Test,
  "org.typelevel"                %% "cats-core"                 % "2.3.0"
)



dependencyOverrides +="com.fasterxml.jackson.core" % "jackson-databind" % "2.11.0"

//----------------------------------
// default orgs changed it to the ones i used in the play template
//  "org.scalatest"          %% "scalatest"               % "3.2.5"             % Test,
//  "org.scalamock"          %% "scalamock"               % "5.1.0"             % Test,
//  "org.scalatestplus.play" %% "scalatestplus-play"   % "5.0.0"          % Test,

// ----------------------------------------------------

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
