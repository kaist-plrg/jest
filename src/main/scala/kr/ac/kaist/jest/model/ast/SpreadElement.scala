package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait SpreadElement extends AST {
  val kind: String = "SpreadElement"
}
case class SpreadElement0(x1: AssignmentExpression, parserParams: List[Boolean]) extends SpreadElement {
  x1.parent = Some(this)
  val name: String = "SpreadElement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("...", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x1, Nil).reverse
  val info: ASTInfo = SpreadElement0
}
object SpreadElement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArrayAccumulation0" -> SpreadElement0ArrayAccumulation0.func
  )
}
