package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CoverInitializedName extends AST {
  val kind: String = "CoverInitializedName"
}
case class CoverInitializedName0(x0: IdentifierReference, x1: Initializer, parserParams: List[Boolean]) extends CoverInitializedName {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "CoverInitializedName0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Initializer", x1, l("IdentifierReference", x0, Nil)).reverse
  val info: ASTInfo = CoverInitializedName0
}
object CoverInitializedName0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
