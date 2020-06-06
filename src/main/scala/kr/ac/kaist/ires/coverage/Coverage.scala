package kr.ac.kaist.ires.coverage

import spray.json._

case class Coverage(cases: List[Case])
trait CoverageProtocol extends DefaultJsonProtocol {
  // JSON format of Case
  implicit object CaseFormat extends RootJsonFormat[Case] {
    override def read(json: JsValue): Case = {
      if (json.asJsObject.fields.contains("cond")) CondFormat.read(json)
      else BaseFormat.read(json)
    }
    override def write(c: Case): JsValue = c match {
      case (x: Base) => BaseFormat.write(x)
      case (x: Cond) => CondFormat.write(x)
    }
  }
  implicit val BaseFormat = jsonFormat3(Base)
  implicit val CondFormat = jsonFormat6(Cond)
  implicit val CoverageFormat = jsonFormat1(Coverage)
}

// Case of each instruction
trait Case {
  val algo: String
  val inst: String
  val covered: Boolean
}
case class Base(
    algo: String,
    inst: String,
    covered: Boolean
) extends Case
case class Cond(
    algo: String,
    inst: String,
    covered: Boolean,
    cond: String,
    thenCovered: Boolean,
    elseCovered: Boolean
) extends Case
