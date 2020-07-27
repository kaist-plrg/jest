package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LogicalANDExpression extends AST {
  val kind: String = "LogicalANDExpression"
}
case class LogicalANDExpression0(x0: BitwiseORExpression, parserParams: List[Boolean]) extends LogicalANDExpression {
  x0.parent = Some(this)
  val name: String = "LogicalANDExpression0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
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
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "LogicalANDExpression1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k += 3
    k = x2.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
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
    "Evaluation0" -> LogicalANDExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> LogicalANDExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> LogicalANDExpression1IsFunctionDefinition0.func
  )
}
