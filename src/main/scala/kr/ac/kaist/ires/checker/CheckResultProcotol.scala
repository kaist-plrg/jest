package kr.ac.kaist.ires.checker
import spray.json._

object CheckResultProtocol extends DefaultJsonProtocol {
  implicit object CheckResultMapFormat extends RootJsonFormat[Map[CheckResult, Set[String]]] {
    override def read(json: JsValue): Map[CheckResult, Set[String]] = json match {
      case JsArray(seq) =>
        seq.map(entry => entry.asJsObject.getFields("result", "scripts") match {
          case Seq(res, JsArray(scripts)) => {
            val scriptsSet = scripts.map {
              case JsString(s) => s
              case _ => ???
            }.toSet
            (CheckResultFormat.read(res), scriptsSet)
          }
          case _ => ???
        }).toMap
      case _ => ???
    }
    override def write(m: Map[CheckResult, Set[String]]) = m.map {
      case (r, s) => JsObject(
        "result" -> CheckResultFormat.write(r),
        "scripts" -> s.toJson
      )
    }.toJson
  }
  implicit object CheckResultFormat extends RootJsonFormat[CheckResult] {
    override def read(json: JsValue): CheckResult = json.asJsObject.getFields("kind", "msg") match {
      case Seq(JsString(kind), JsString(msg)) => kind match {
        case "Pass" => Pass
        case "AssertionFail" => AssertionFail(msg)
        case "SyntaxError" => SyntaxError
        case "ReferenceError" => ReferenceError
        case "TypeError" => TypeError
        case "RangeError" => RangeError
        case "EvalError" => EvalError
        case "InternalError" => InternalError
        case "Throw" => Throw
        case _ => ???
      }
    }
    override def write(r: CheckResult): JsValue = {
      val kind = CheckResult.getKind(r)
      val msg = r match {
        case AssertionFail(msg) => msg
        case _ => ""
      }
      JsObject(
        "kind" -> JsString(kind),
        "msg" -> JsString(msg)
      )
    }
  }

}

