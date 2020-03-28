package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingElementList extends AST {
  val kind: String = "BindingElementList"
}
case class BindingElementList0(x0: BindingElisionElement, parserParams: List[Boolean]) extends BindingElementList {
  val name: String = "BindingElementList0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BindingElisionElement", x0, Nil).reverse
  val info: ASTInfo = BindingElementList0
}
object BindingElementList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IteratorBindingInitialization0" -> BindingElementList0IteratorBindingInitialization0.func
  )
}
case class BindingElementList1(x0: BindingElementList, x2: BindingElisionElement, parserParams: List[Boolean]) extends BindingElementList {
  val name: String = "BindingElementList1"
  override def toString: String = {
    s"$x0 , $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("BindingElisionElement", x2, l("BindingElementList", x0, Nil)).reverse
  val info: ASTInfo = BindingElementList1
}
object BindingElementList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> BindingElementList1BoundNames0.func,
    "ContainsExpression0" -> BindingElementList1ContainsExpression0.func,
    "IteratorBindingInitialization0" -> BindingElementList1IteratorBindingInitialization0.func
  )
}
