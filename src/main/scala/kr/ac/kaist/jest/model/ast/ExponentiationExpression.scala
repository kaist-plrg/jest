package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ExponentiationExpression extends AST {
  val kind: String = "ExponentiationExpression"
}
case class ExponentiationExpression0(x0: UnaryExpression, parserParams: List[Boolean]) extends ExponentiationExpression {
  x0.parent = Some(this)
  val name: String = "ExponentiationExpression0"
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
  val fullList: List[(String, Value)] = l("UnaryExpression", x0, Nil).reverse
  val info: ASTInfo = ExponentiationExpression0
}
object ExponentiationExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExponentiationExpression1(x0: UpdateExpression, x2: ExponentiationExpression, parserParams: List[Boolean]) extends ExponentiationExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ExponentiationExpression1"
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
    s(x0, "**", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ExponentiationExpression", x2, l("UpdateExpression", x0, Nil)).reverse
  val info: ASTInfo = ExponentiationExpression1
}
object ExponentiationExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ExponentiationExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> ExponentiationExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> ExponentiationExpression1IsFunctionDefinition0.func
  )
}
