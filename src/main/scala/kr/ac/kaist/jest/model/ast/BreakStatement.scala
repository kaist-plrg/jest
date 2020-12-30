package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BreakStatement extends AST {
  val kind: String = "BreakStatement"
}
case class BreakStatement0(parserParams: List[Boolean]) extends BreakStatement {
  val name: String = "BreakStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("break", ";")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = BreakStatement0
}
object BreakStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> BreakStatement0Evaluation0.func
  )
}
case class BreakStatement1(x2: LabelIdentifier, parserParams: List[Boolean]) extends BreakStatement {
  x2.parent = Some(this)
  val name: String = "BreakStatement1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(x2.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("break", x2, ";")
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("LabelIdentifier", x2, Nil).reverse
  val info: ASTInfo = BreakStatement1
}
object BreakStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> BreakStatement1Evaluation0.func
  )
}
