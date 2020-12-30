package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ContinueStatement extends AST {
  val kind: String = "ContinueStatement"
}
case class ContinueStatement0(parserParams: List[Boolean]) extends ContinueStatement {
  val name: String = "ContinueStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 8)
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("continue", ";")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ContinueStatement0
}
object ContinueStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ContinueStatement0Evaluation0.func
  )
}
case class ContinueStatement1(x2: LabelIdentifier, parserParams: List[Boolean]) extends ContinueStatement {
  x2.parent = Some(this)
  val name: String = "ContinueStatement1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 8)
    inc(x2.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("continue", x2, ";")
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("LabelIdentifier", x2, Nil).reverse
  val info: ASTInfo = ContinueStatement1
}
object ContinueStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ContinueStatement1Evaluation0.func
  )
}
