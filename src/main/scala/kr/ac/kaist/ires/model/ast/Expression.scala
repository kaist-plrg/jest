package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Expression extends AST {
  val kind: String = "Expression"
}
case class Expression0(x0: AssignmentExpression, parserParams: List[Boolean]) extends Expression {
  val name: String = "Expression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x0, Nil).reverse
  val info: ASTInfo = Expression0
}
object Expression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpressionRules0" -> Expression0ExpressionRules0.func
  )
}
case class Expression1(x0: Expression, x2: AssignmentExpression, parserParams: List[Boolean]) extends Expression {
  val name: String = "Expression1"
  override def toString: String = {
    s"$x0 , $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AssignmentExpression", x2, l("Expression", x0, Nil)).reverse
  val info: ASTInfo = Expression1
}
object Expression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpressionRules0" -> Expression1ExpressionRules0.func,
    "Evaluation0" -> Expression1Evaluation0.func,
    "IsFunctionDefinition0" -> Expression1IsFunctionDefinition0.func,
    "AssignmentTargetType0" -> Expression1AssignmentTargetType0.func
  )
}
