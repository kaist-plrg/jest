package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Module extends AST {
  val kind: String = "Module"
}
case class Module0(x0: Option[ModuleBody], parserParams: List[Boolean]) extends Module {
  val name: String = "Module0"
  override def toString: String = {
    s"${x0.getOrElse("")}"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Option[ModuleBody]", x0, Nil).reverse
  val info: ASTInfo = Module0
}
object Module0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map()
}
