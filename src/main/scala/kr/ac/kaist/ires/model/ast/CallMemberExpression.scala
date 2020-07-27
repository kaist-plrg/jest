package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CallMemberExpression extends AST {
  val kind: String = "CallMemberExpression"
}
case class CallMemberExpression0(x0: MemberExpression, x1: Arguments, parserParams: List[Boolean]) extends CallMemberExpression {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "CallMemberExpression0"
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
  val fullList: List[(String, Value)] = l("Arguments", x1, l("MemberExpression", x0, Nil)).reverse
  val info: ASTInfo = CallMemberExpression0
}
object CallMemberExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
