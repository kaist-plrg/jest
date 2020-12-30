package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AdditiveExpression extends AST {
  val kind: String = "AdditiveExpression"
}
case class AdditiveExpression0(x0: MultiplicativeExpression, parserParams: List[Boolean]) extends AdditiveExpression {
  x0.parent = Some(this)
  val name: String = "AdditiveExpression0"
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
  val fullList: List[(String, Value)] = l("MultiplicativeExpression", x0, Nil).reverse
  val info: ASTInfo = AdditiveExpression0
}
object AdditiveExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class AdditiveExpression1(x0: AdditiveExpression, x2: MultiplicativeExpression, parserParams: List[Boolean]) extends AdditiveExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "AdditiveExpression1"
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
    s(x0, "+", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("MultiplicativeExpression", x2, l("AdditiveExpression", x0, Nil)).reverse
  val info: ASTInfo = AdditiveExpression1
}
object AdditiveExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> AdditiveExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> AdditiveExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> AdditiveExpression1IsFunctionDefinition0.func
  )
}
case class AdditiveExpression2(x0: AdditiveExpression, x2: MultiplicativeExpression, parserParams: List[Boolean]) extends AdditiveExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "AdditiveExpression2"
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
    s(x0, "-", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("MultiplicativeExpression", x2, l("AdditiveExpression", x0, Nil)).reverse
  val info: ASTInfo = AdditiveExpression2
}
object AdditiveExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> AdditiveExpression2Evaluation0.func,
    "HasCallInTailPosition0" -> AdditiveExpression2HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> AdditiveExpression2IsFunctionDefinition0.func
  )
}
