package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait SuperCall extends AST {
  val kind: String = "SuperCall"
}
case class SuperCall0(x1: Arguments, parserParams: List[Boolean]) extends SuperCall {
  x1.parent = Some(this)
  val name: String = "SuperCall0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("super", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Arguments", x1, Nil).reverse
  val info: ASTInfo = SuperCall0
}
object SuperCall0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> SuperCall0Evaluation0.func
  )
}
