package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LogicalANDExpression extends AST {
  val kind: String = "LogicalANDExpression"
}
case class LogicalANDExpression0(x0: BitwiseORExpression, parserParams: List[Boolean]) extends LogicalANDExpression {
  val name: String = "LogicalANDExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BitwiseORExpression", x0, Nil).reverse
  val info: ASTInfo = LogicalANDExpression0
}
object LogicalANDExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class LogicalANDExpression1(x0: LogicalANDExpression, x2: BitwiseORExpression, parserParams: List[Boolean]) extends LogicalANDExpression {
  val name: String = "LogicalANDExpression1"
  override def toString: String = {
    s"$x0 && $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("BitwiseORExpression", x2, l("LogicalANDExpression", x0, Nil)).reverse
  val info: ASTInfo = LogicalANDExpression1
}
object LogicalANDExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> LogicalANDExpression1AssignmentTargetType0.func,
    "Evaluation0" -> LogicalANDExpression1Evaluation0.func,
    "ExpressionRules0" -> LogicalANDExpression1ExpressionRules0.func,
    "IsFunctionDefinition0" -> LogicalANDExpression1IsFunctionDefinition0.func
  )
}
