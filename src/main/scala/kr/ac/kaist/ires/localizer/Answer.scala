package kr.ac.kaist.ires.localizer

import spray.json._

case class Answer(id: String, algo: String)
object AnswerProtocol extends DefaultJsonProtocol {
  implicit val AnswerFormat = jsonFormat2(Answer)
}