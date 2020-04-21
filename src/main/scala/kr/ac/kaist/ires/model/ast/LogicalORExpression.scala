package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LogicalORExpression extends AST {
  val kind: String = "LogicalORExpression"
}
case class LogicalORExpression0(x0: LogicalANDExpression, parserParams: List[Boolean]) extends LogicalORExpression {
  x0.parent = Some(this)
  val name: String = "LogicalORExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("LogicalANDExpression", x0, Nil).reverse
  val info: ASTInfo = LogicalORExpression0
}
object LogicalORExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class LogicalORExpression1(x0: LogicalORExpression, x2: LogicalANDExpression, parserParams: List[Boolean]) extends LogicalORExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "LogicalORExpression1"
  override def toString: String = {
    s"$x0 || $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("LogicalANDExpression", x2, l("LogicalORExpression", x0, Nil)).reverse
  val info: ASTInfo = LogicalORExpression1
}
object LogicalORExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> LogicalORExpression1AssignmentTargetType0.func,
    "Evaluation0" -> LogicalORExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> LogicalORExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> LogicalORExpression1IsFunctionDefinition0.func
  )
}
