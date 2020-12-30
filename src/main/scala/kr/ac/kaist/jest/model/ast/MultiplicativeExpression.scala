package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait MultiplicativeExpression extends AST {
  val kind: String = "MultiplicativeExpression"
}
case class MultiplicativeExpression0(x0: ExponentiationExpression, parserParams: List[Boolean]) extends MultiplicativeExpression {
  x0.parent = Some(this)
  val name: String = "MultiplicativeExpression0"
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
  val fullList: List[(String, Value)] = l("ExponentiationExpression", x0, Nil).reverse
  val info: ASTInfo = MultiplicativeExpression0
}
object MultiplicativeExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class MultiplicativeExpression1(x0: MultiplicativeExpression, x1: MultiplicativeOperator, x2: ExponentiationExpression, parserParams: List[Boolean]) extends MultiplicativeExpression {
  x0.parent = Some(this)
  x1.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "MultiplicativeExpression1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1, x2)
  }
  val k: Int = d(x2, d(x1, d(x0, 0)))
  val fullList: List[(String, Value)] = l("ExponentiationExpression", x2, l("MultiplicativeOperator", x1, l("MultiplicativeExpression", x0, Nil))).reverse
  val info: ASTInfo = MultiplicativeExpression1
}
object MultiplicativeExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> MultiplicativeExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> MultiplicativeExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> MultiplicativeExpression1IsFunctionDefinition0.func
  )
}
