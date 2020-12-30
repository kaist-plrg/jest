package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncArrowHead extends AST {
  val kind: String = "AsyncArrowHead"
}
case class AsyncArrowHead0(x2: ArrowFormalParameters, parserParams: List[Boolean]) extends AsyncArrowHead {
  x2.parent = Some(this)
  val name: String = "AsyncArrowHead0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("async", x2)
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("ArrowFormalParameters", x2, Nil).reverse
  val info: ASTInfo = AsyncArrowHead0
}
object AsyncArrowHead0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
