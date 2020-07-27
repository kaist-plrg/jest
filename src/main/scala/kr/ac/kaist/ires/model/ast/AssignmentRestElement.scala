package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AssignmentRestElement extends AST {
  val kind: String = "AssignmentRestElement"
}
case class AssignmentRestElement0(x1: DestructuringAssignmentTarget, parserParams: List[Boolean]) extends AssignmentRestElement {
  x1.parent = Some(this)
  val name: String = "AssignmentRestElement0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 4
    k = x1.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"... $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("DestructuringAssignmentTarget", x1, Nil).reverse
  val info: ASTInfo = AssignmentRestElement0
}
object AssignmentRestElement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IteratorDestructuringAssignmentEvaluation0" -> AssignmentRestElement0IteratorDestructuringAssignmentEvaluation0.func
  )
}
