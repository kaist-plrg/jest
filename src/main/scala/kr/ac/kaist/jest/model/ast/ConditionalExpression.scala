package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ConditionalExpression extends AST {
  val kind: String = "ConditionalExpression"
}
case class ConditionalExpression0(x0: ShortCircuitExpression, parserParams: List[Boolean]) extends ConditionalExpression {
  x0.parent = Some(this)
  val name: String = "ConditionalExpression0"
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
  val fullList: List[(String, Value)] = l("ShortCircuitExpression", x0, Nil).reverse
  val info: ASTInfo = ConditionalExpression0
}
object ConditionalExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ConditionalExpression1(x0: ShortCircuitExpression, x2: AssignmentExpression, x4: AssignmentExpression, parserParams: List[Boolean]) extends ConditionalExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  x4.parent = Some(this)
  val name: String = "ConditionalExpression1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 1)
    inc(x4.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "?", x2, ":", x4)
  }
  val k: Int = d(x4, d(x2, d(x0, 0)))
  val fullList: List[(String, Value)] = l("AssignmentExpression1", x4, l("AssignmentExpression0", x2, l("ShortCircuitExpression", x0, Nil))).reverse
  val info: ASTInfo = ConditionalExpression1
}
object ConditionalExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ConditionalExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> ConditionalExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> ConditionalExpression1IsFunctionDefinition0.func
  )
}
