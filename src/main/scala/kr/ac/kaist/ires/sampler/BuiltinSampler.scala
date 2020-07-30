package kr.ac.kaist.ires.sampler

import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.RESOURCE_DIR
import kr.ac.kaist.ires.util.Useful._
import spray.json._

object BuiltinSampler extends Sampler with DefaultJsonProtocol {
  case class BuiltinInfo(name: String, param: Int, optional: Int, rest: Boolean, prototype: Boolean, callable: Boolean, supported: Boolean)
  implicit val BuiltinInfoFormat: JsonFormat[BuiltinInfo] = jsonFormat7(BuiltinInfo)

  def infoToScripts(i: BuiltinInfo): List[String] = i match {
    case BuiltinInfo(f, p, o, r, false, true, _) => {
      val max = if (r) p + 1 else p + o
      (0 to max).map(n => s"$f(${List.fill(n)("0").mkString(", ")})").toList
    }
    case BuiltinInfo(f, p, o, r, true, true, _) => {
      val max = if (r) p + 1 else p + o
      (0 to max).map(n => s"$f.call(1${if (n > 0) ", " else ""}${List.fill(n)("0").mkString(", ")})").toList
    }
    case BuiltinInfo(name, _, _, _, _, false, _) => {
      List("var x = " + name)
    }
  }

  val scripts: List[String] = {
    val infos = readJson[List[BuiltinInfo]](s"$RESOURCE_DIR/Builtins.json").filter(_.supported)
    infos.flatMap(infoToScripts)
  }

  def getSample: List[Script] = scripts.map(Parser.parse(Parser.Script(Nil), _).get)
}
