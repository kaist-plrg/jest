package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.RESOURCE_DIR
import kr.ac.kaist.ires.util.Useful._
import spray.json._

case class RHSElem(rhsName: String, k: Int)

object RHSElem extends DefaultJsonProtocol {
  implicit object RHSElemFormat extends RootJsonFormat[RHSElem] {
    def write(r: RHSElem) = JsObject(
      "rhsName" -> JsString(r.rhsName),
      "k" -> JsNumber(r.k)
    )
    def read(value: JsValue) = value.asJsObject.getFields("rhsName", "k") match {
      case Seq(JsString(rhsName), JsNumber(k)) =>
        RHSElem(rhsName, k.toInt)
      case _ => throw new DeserializationException("RhsElem read fail")
    }
  }
  implicit def ordering[E <: RHSElem]: Ordering[E] = new Ordering[E] {
    override def compare(x: E, y: E): Int = x.toString.compareTo(y.toString)
  }
  lazy val total: Set[RHSElem] =
    readJson[Set[RHSElem]](s"$RESOURCE_DIR/TargetRHS.json")
}
