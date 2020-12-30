package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ComputedPropertyName extends AST {
  val kind: String = "ComputedPropertyName"
}
case class ComputedPropertyName0(x1: AssignmentExpression, parserParams: List[Boolean]) extends ComputedPropertyName {
  x1.parent = Some(this)
  val name: String = "ComputedPropertyName0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("[", x1, "]")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x1, Nil).reverse
  val info: ASTInfo = ComputedPropertyName0
}
object ComputedPropertyName0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ComputedPropertyName0Evaluation0.func,
    "PropName0" -> ComputedPropertyName0PropName0.func
  )
}
