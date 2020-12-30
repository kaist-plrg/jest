package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ShiftExpression extends AST {
  val kind: String = "ShiftExpression"
}
case class ShiftExpression0(x0: AdditiveExpression, parserParams: List[Boolean]) extends ShiftExpression {
  x0.parent = Some(this)
  val name: String = "ShiftExpression0"
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
  val fullList: List[(String, Value)] = l("AdditiveExpression", x0, Nil).reverse
  val info: ASTInfo = ShiftExpression0
}
object ShiftExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ShiftExpression1(x0: ShiftExpression, x2: AdditiveExpression, parserParams: List[Boolean]) extends ShiftExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ShiftExpression1"
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
    s(x0, "<<", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AdditiveExpression", x2, l("ShiftExpression", x0, Nil)).reverse
  val info: ASTInfo = ShiftExpression1
}
object ShiftExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ShiftExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> ShiftExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> ShiftExpression1IsFunctionDefinition0.func
  )
}
case class ShiftExpression2(x0: ShiftExpression, x2: AdditiveExpression, parserParams: List[Boolean]) extends ShiftExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ShiftExpression2"
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
    s(x0, ">>", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AdditiveExpression", x2, l("ShiftExpression", x0, Nil)).reverse
  val info: ASTInfo = ShiftExpression2
}
object ShiftExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ShiftExpression2Evaluation0.func,
    "HasCallInTailPosition0" -> ShiftExpression2HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> ShiftExpression2IsFunctionDefinition0.func
  )
}
case class ShiftExpression3(x0: ShiftExpression, x2: AdditiveExpression, parserParams: List[Boolean]) extends ShiftExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ShiftExpression3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 3)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ">>>", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AdditiveExpression", x2, l("ShiftExpression", x0, Nil)).reverse
  val info: ASTInfo = ShiftExpression3
}
object ShiftExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ShiftExpression3Evaluation0.func,
    "HasCallInTailPosition0" -> ShiftExpression3HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> ShiftExpression3IsFunctionDefinition0.func
  )
}
