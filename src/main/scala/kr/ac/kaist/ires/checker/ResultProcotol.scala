package kr.ac.kaist.ires.checker
import spray.json._

object ResultProtocol extends DefaultJsonProtocol {
  // JSON format of Case
  // implicit object CaseFormat extends RootJsonFormat[Case] {
  //   override def read(json: JsValue): Case = {
  //     if (json.asJsObject.fields.contains("cond")) CondFormat.read(json)
  //     else BaseFormat.read(json)
  //   }
  //   override def write(c: Case): JsValue = c match {
  //     case (x: Base) => BaseFormat.write(x)
  //     case (x: Cond) => CondFormat.write(x)
  //   }
  // }
  // implicit val BaseFormat = jsonFormat3(Base)
  // implicit val CondFormat = jsonFormat6(Cond)

  // // JSON format of Coverage
  // implicit object CoverageFormat extends RootJsonFormat[Coverage] {
  //   override def read(json: JsValue): Coverage = json match {
  //     case JsArray(seq) => Coverage(seq.toVector.map(v => CaseFormat.read(v)))
  //     case _ => throw new DeserializationException("SearchRequest expected")
  //   }
  //   override def write(c: Coverage): JsValue =
  //     JsArray(c.cases.map(c => CaseFormat.write(c)))
  // }
  implicit object ResultMapFormat extends RootJsonFormat[Map[Result, Set[String]]] {
    override def read(json: JsValue): Map[Result, Set[String]] = ???
    override def write(m: Map[Result, Set[String]]) = {
      JsArray(m.map {
        case (r, s) => JsObject(
          "result" -> ResultFormat.write(r),
          "scripts" -> s.toJson
        )
      }.toJson)
    }
  }
  implicit object ResultFormat extends RootJsonFormat[Result] {
    override def read(json: JsValue): Result = ???
    // {
    //   json.asObject.fields("kind") match {
    //     case "Pass" j
    //   }
    // }
    override def write(r: Result): JsValue = {
      val kind = Result.getKind(r)
      r match {
        case AssertionFail(msg) => JsObject(
          "kind" -> JsString(kind),
          "msg" -> JsString(msg)
        )
        case _ => JsObject("kind" -> JsString(kind))
      }
    }
  }

}

