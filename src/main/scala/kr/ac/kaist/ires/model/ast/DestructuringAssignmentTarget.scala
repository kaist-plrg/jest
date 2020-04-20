package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait DestructuringAssignmentTarget extends AST {
  val kind: String = "DestructuringAssignmentTarget"
}
case class DestructuringAssignmentTarget0(x0: LeftHandSideExpression, parserParams: List[Boolean]) extends DestructuringAssignmentTarget {
  x0.parent = Some(this)
  val name: String = "DestructuringAssignmentTarget0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("LeftHandSideExpression", x0, Nil).reverse
  val info: ASTInfo = DestructuringAssignmentTarget0
}
object DestructuringAssignmentTarget0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
