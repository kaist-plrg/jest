package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Expression extends AST {
  val kind: String = "Expression"
}
case class Expression0(x0: AssignmentExpression, parserParams: List[Boolean]) extends Expression {
  x0.parent = Some(this)
  val name: String = "Expression0"
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
  val fullList: List[(String, Value)] = l("AssignmentExpression", x0, Nil).reverse
  val info: ASTInfo = Expression0
}
object Expression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> Expression0HasCallInTailPosition0.func
  )
}
case class Expression1(x0: Expression, x2: AssignmentExpression, parserParams: List[Boolean]) extends Expression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "Expression1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ",", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AssignmentExpression", x2, l("Expression", x0, Nil)).reverse
  val info: ASTInfo = Expression1
}
object Expression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> Expression1Evaluation0.func,
    "HasCallInTailPosition0" -> Expression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> Expression1IsFunctionDefinition0.func
  )
}
