package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CatchParameter extends AST {
  val kind: String = "CatchParameter"
}
case class CatchParameter0(x0: BindingIdentifier, parserParams: List[Boolean]) extends CatchParameter {
  x0.parent = Some(this)
  val name: String = "CatchParameter0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BindingIdentifier", x0, Nil).reverse
  val info: ASTInfo = CatchParameter0
}
object CatchParameter0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class CatchParameter1(x0: BindingPattern, parserParams: List[Boolean]) extends CatchParameter {
  x0.parent = Some(this)
  val name: String = "CatchParameter1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BindingPattern", x0, Nil).reverse
  val info: ASTInfo = CatchParameter1
}
object CatchParameter1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
