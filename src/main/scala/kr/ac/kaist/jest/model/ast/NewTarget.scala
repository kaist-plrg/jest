package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait NewTarget extends AST {
  val kind: String = "NewTarget"
}
case class NewTarget0(parserParams: List[Boolean]) extends NewTarget {
  val name: String = "NewTarget0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 1)
    inc(end + 6)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("new", ".", "target")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = NewTarget0
}
object NewTarget0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> NewTarget0Evaluation0.func
  )
}
