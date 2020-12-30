package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait OptionalExpression extends AST {
  val kind: String = "OptionalExpression"
}
case class OptionalExpression0(x0: MemberExpression, x1: OptionalChain, parserParams: List[Boolean]) extends OptionalExpression {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "OptionalExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("OptionalChain", x1, l("MemberExpression", x0, Nil)).reverse
  val info: ASTInfo = OptionalExpression0
}
object OptionalExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> OptionalExpression0Evaluation0.func,
    "HasCallInTailPosition0" -> OptionalExpression0HasCallInTailPosition0.func
  )
}
case class OptionalExpression1(x0: CallExpression, x1: OptionalChain, parserParams: List[Boolean]) extends OptionalExpression {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "OptionalExpression1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("OptionalChain", x1, l("CallExpression", x0, Nil)).reverse
  val info: ASTInfo = OptionalExpression1
}
object OptionalExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> OptionalExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> OptionalExpression1HasCallInTailPosition0.func
  )
}
case class OptionalExpression2(x0: OptionalExpression, x1: OptionalChain, parserParams: List[Boolean]) extends OptionalExpression {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "OptionalExpression2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("OptionalChain", x1, l("OptionalExpression", x0, Nil)).reverse
  val info: ASTInfo = OptionalExpression2
}
object OptionalExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> OptionalExpression2Evaluation0.func,
    "HasCallInTailPosition0" -> OptionalExpression2HasCallInTailPosition0.func
  )
}
