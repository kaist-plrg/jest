package kr.ac.kaist.ires.coverage

import spray.json._

trait CoverageProtocol extends CaseProtocol {
  implicit val CoverageFormat = jsonFormat1(Coverage.apply)
}
