package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LeftHandSideExpression extends AST {
  val kind: String = "LeftHandSideExpression"
}
case class LeftHandSideExpression0(x0: NewExpression, parserParams: List[Boolean]) extends LeftHandSideExpression {
  val name: String = "LeftHandSideExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("NewExpression", x0, Nil).reverse
  val info: ASTInfo = LeftHandSideExpression0
}
object LeftHandSideExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class LeftHandSideExpression1(x0: CallExpression, parserParams: List[Boolean]) extends LeftHandSideExpression {
  val name: String = "LeftHandSideExpression1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("CallExpression", x0, Nil).reverse
  val info: ASTInfo = LeftHandSideExpression1
}
object LeftHandSideExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsDestructuring0" -> LeftHandSideExpression1IsDestructuring0.func,
    "IsFunctionDefinition0" -> LeftHandSideExpression1IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> LeftHandSideExpression1IsIdentifierRef0.func
  )
}
