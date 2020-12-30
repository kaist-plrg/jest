package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ArrowFormalParameters extends AST {
  val kind: String = "ArrowFormalParameters"
}
case class ArrowFormalParameters0(x1: UniqueFormalParameters, parserParams: List[Boolean]) extends ArrowFormalParameters {
  x1.parent = Some(this)
  val name: String = "ArrowFormalParameters0"
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
    s("(", x1, ")")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UniqueFormalParameters", x1, Nil).reverse
  val info: ASTInfo = ArrowFormalParameters0
}
object ArrowFormalParameters0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
