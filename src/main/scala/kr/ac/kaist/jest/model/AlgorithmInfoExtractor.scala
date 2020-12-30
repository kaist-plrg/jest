package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir.{ UnitWalker => IRUnitWalker, _ }
import scala.collection.immutable.{ Set => ScalaSet }

object AlgorithmInfoExtractor extends IRUnitWalker {
  def apply(algo: Algorithm): AlgorithmInfo = { init(algo); walk(algo.func); info }

  var info: AlgorithmInfo = new AlgorithmInfo
  private def init(algo: Algorithm): Unit = { info = new AlgorithmInfo { name = algo.name } }
  private val propAccessorFunc: ScalaSet[String] =
    ScalaSet("HasProperty", "GetMethod", "Get", "OrdinaryGetOwnProperty")
  private val symbolPattern = "^SYMBOL_[\\w]+$".r

  override def walk(inst: Inst): Unit = inst match {
    // check if IApp instruction touch property accessor function
    case IApp(_, ERef(RefId(Id(fname))), args) if propAccessorFunc.contains(fname) => {
      // OrdinaryToPrimitive
      if (info.name == "OrdinaryToPrimitive") {
        info ++= ScalaSet("\"valueOf\"", "\"toString\"");
      } else args match {
        // string
        case List(_, EStr(prop)) => info += s""""${prop}""""
        // symbol
        case List(_, ERef(RefId(Id(symProp)))) if symbolPattern.matches(symProp) => {
          val prop = ("SYMBOL_".r).replaceFirstIn(symProp, "Symbol.")
          info += prop
        }
        // ignore other case
        case _ =>
      }
    }
    case _ => super.walk(inst)
  }
}
