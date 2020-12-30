package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ExpressionStatement extends AST {
  val kind: String = "ExpressionStatement"
}
case class ExpressionStatement0(x1: Expression, parserParams: List[Boolean]) extends ExpressionStatement {
  x1.parent = Some(this)
  val name: String = "ExpressionStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x1.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x1, ";")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Expression", x1, Nil).reverse
  val info: ASTInfo = ExpressionStatement0
}
object ExpressionStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ExpressionStatement0Evaluation0.func
  )
}
