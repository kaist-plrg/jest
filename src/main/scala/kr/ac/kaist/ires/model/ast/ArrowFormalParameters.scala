package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ArrowFormalParameters extends AST {
  val kind: String = "ArrowFormalParameters"
}
case class ArrowFormalParameters0(x1: UniqueFormalParameters, parserParams: List[Boolean]) extends ArrowFormalParameters {
  x1.parent = Some(this)
  val name: String = "ArrowFormalParameters0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k = x1.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"( $x1 )"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UniqueFormalParameters", x1, Nil).reverse
  val info: ASTInfo = ArrowFormalParameters0
}
object ArrowFormalParameters0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
