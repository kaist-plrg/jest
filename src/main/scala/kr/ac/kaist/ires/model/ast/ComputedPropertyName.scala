package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ComputedPropertyName extends AST {
  val kind: String = "ComputedPropertyName"
}
case class ComputedPropertyName0(x1: AssignmentExpression, parserParams: List[Boolean]) extends ComputedPropertyName {
  x1.parent = Some(this)
  val name: String = "ComputedPropertyName0"
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
    s"[ $x1 ]"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x1, Nil).reverse
  val info: ASTInfo = ComputedPropertyName0
}
object ComputedPropertyName0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ComputedPropertyName0Evaluation0.func,
    "PropName0" -> ComputedPropertyName0PropName0.func
  )
}
