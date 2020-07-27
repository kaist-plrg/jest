package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CoverInitializedName extends AST {
  val kind: String = "CoverInitializedName"
}
case class CoverInitializedName0(x0: IdentifierReference, x1: Initializer, parserParams: List[Boolean]) extends CoverInitializedName {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "CoverInitializedName0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k = x1.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Initializer", x1, l("IdentifierReference", x0, Nil)).reverse
  val info: ASTInfo = CoverInitializedName0
}
object CoverInitializedName0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
