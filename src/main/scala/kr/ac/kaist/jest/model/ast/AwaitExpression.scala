package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AwaitExpression extends AST {
  val kind: String = "AwaitExpression"
}
case class AwaitExpression0(x1: UnaryExpression, parserParams: List[Boolean]) extends AwaitExpression {
  x1.parent = Some(this)
  val name: String = "AwaitExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("await", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = AwaitExpression0
}
object AwaitExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> AwaitExpression0Evaluation0.func
  )
}
