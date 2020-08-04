package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.RESOURCE_DIR
import kr.ac.kaist.ires.util.Useful._
import spray.json._

object BuiltinSampler extends Sampler with DefaultJsonProtocol {
  case class BuiltinInfo(name: String, param: Int, optional: Int, rest: Boolean, prototype: Boolean, newable: Boolean, callable: Boolean, supported: Boolean)
  // implicit val BuiltinInfoFormat: JsonFormat[BuiltinInfo] = jsonFormat7(BuiltinInfo)
  implicit object BuiltinInfoFormat extends RootJsonFormat[BuiltinInfo] {
    def read(value: JsValue) = {
      value.asJsObject.getFields("name", "param", "optional", "rest", "prototype", "new", "callable", "supported") match {
        case Seq(JsString(n), JsNumber(p), JsNumber(o), JsBoolean(r), JsBoolean(pr), JsBoolean(newable), JsBoolean(c), JsBoolean(s)) =>
          BuiltinInfo(n, p.toInt, o.toInt, r, pr, newable, c, s)
      }
    }
    def write(b: BuiltinInfo) = ???
  }

  def infoToScripts(i: BuiltinInfo): List[String] = i match {
    case BuiltinInfo(f, p, o, r, false, newable, true, _) => {
      val max = if (r) p + 2 else p + o
      (p to max).toList.flatMap(n => {
        val expr = s"$f(${List.fill(n)("0").mkString(", ")})"
        val newExpr = s"new $expr"
        if (newable) List(expr, newExpr) else List(expr)
      })
    }
    case BuiltinInfo(f, p, o, r, true, _, true, _) => {
      val max = if (r) p + 1 else p + o
      (p to max).map(n => s"$f.call(null${if (n > 0) ", " else ""}${List.fill(n)("0").mkString(", ")})").toList
    }
    case BuiltinInfo(name, _, _, _, _, _, false, _) => {
      List("var x = " + name)
    }
  }

  val scripts: List[String] = {
    val infos = readJson[List[BuiltinInfo]](s"$RESOURCE_DIR/Builtins.json").filter(_.supported)
    infos.flatMap(infoToScripts)
  }

  def getSample: List[Script] =
    scripts.map(s => Parser.parse(Parser.Script(Nil), s).get)
}
