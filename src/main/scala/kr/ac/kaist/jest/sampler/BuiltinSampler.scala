package kr.ac.kaist.jest.sampler

import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.RESOURCE_DIR
import kr.ac.kaist.jest.util.Useful._
import spray.json._

object BuiltinSampler extends Sampler with DefaultJsonProtocol {
  case class BuiltinInfo(name: String, param: Int, optional: Int, rest: Boolean, prototype: Boolean, newable: Boolean, callable: Boolean, supported: Boolean)
  implicit object BuiltinInfoFormat extends RootJsonFormat[BuiltinInfo] {
    def read(value: JsValue) = {
      value.asJsObject.getFields("name", "param", "optional", "rest", "prototype", "new", "callable", "supported") match {
        case Seq(JsString(n), JsNumber(p), JsNumber(o), JsBoolean(r), JsBoolean(pr), JsBoolean(newable), JsBoolean(c), JsBoolean(s)) =>
          BuiltinInfo(n, p.toInt, o.toInt, r, pr, newable, c, s)
      }
    }
    def write(b: BuiltinInfo) = ???
  }

  def infoToScripts(infos: List[BuiltinInfo], i: BuiltinInfo): List[String] = i match {
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
      val constructor = f.split("\\.")(0)
      val BuiltinInfo(_, cparam, _, _, _, _, _, _) = infos.find(_.name == constructor).get
      val callees = List(s"new $constructor ( ${List.fill(cparam)("0").mkString(",")} )", "null")
      (p to max).toList.flatMap(n =>
        callees.map(c =>
          s"$f.call($c${if (n > 0) ", " else ""}${List.fill(n)("0").mkString(", ")})"))
    }
    case BuiltinInfo(name, _, _, _, _, _, false, _) => List(name)
  }

  val scripts: List[String] = {
    val infos = readJson[List[BuiltinInfo]](s"$RESOURCE_DIR/Builtins.json").filter(_.supported)
    infos.flatMap(infoToScripts(infos, _)).map(s => s"var x = $s")
  }

  def getSample: List[Script] =
    scripts.map(Parser.parse(Parser.Script(Nil), _).get)
}
