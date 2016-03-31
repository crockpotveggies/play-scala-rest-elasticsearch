package controllers

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


class ElasticController @Inject()(cs: ClusterSetup, elasticFactory: PlayElasticFactory) extends
  Controller with ElasticDsl {

  private lazy val client = elasticFactory(cs)
  private val logger = Logger(getClass)

  def getStats = Action.async {
    try {
      client execute {
        get cluster stats
      } map (response => Ok(response.toString))
    } catch {
      case e: Exception =>
        logger.error("Error connecting to Elasticsearch", e)
        Future(InternalServerError("Error connecting to Elasticsearch. Is application.conf filled in properly?\n"))
    }
  }

  def createIndex = Action.async {
    client execute {
      create index "library" replicas 0
    } map { _ => Ok("Index created") }
  }
}
