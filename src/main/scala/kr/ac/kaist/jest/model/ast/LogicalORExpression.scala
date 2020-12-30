package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LogicalORExpression extends AST {
  val kind: String = "LogicalORExpression"
}
case class LogicalORExpression0(x0: LogicalANDExpression, parserParams: List[Boolean]) extends LogicalORExpression {
  x0.parent = Some(this)
  val name: String = "LogicalORExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
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
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 2)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "||", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("LogicalANDExpression", x2, l("LogicalORExpression", x0, Nil)).reverse
  val info: ASTInfo = LogicalORExpression1
}
object LogicalORExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> LogicalORExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> LogicalORExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> LogicalORExpression1IsFunctionDefinition0.func
  )
}
