package kr.ac.kaist.jest.coverage

import spray.json._

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

  // JSON format of Coverage
  implicit object CoverageFormat extends RootJsonFormat[Coverage] {
    override def read(json: JsValue): Coverage = json match {
      case JsArray(seq) => Coverage(seq.toVector.map(v => CaseFormat.read(v)))
      case _ => throw new DeserializationException("SearchRequest expected")
    }
    override def write(c: Coverage): JsValue =
      JsArray(c.cases.map(c => CaseFormat.write(c)))
  }
}
