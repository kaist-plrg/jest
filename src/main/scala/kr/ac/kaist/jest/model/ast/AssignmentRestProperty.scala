package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AssignmentRestProperty extends AST {
  val kind: String = "AssignmentRestProperty"
}
case class AssignmentRestProperty0(x1: DestructuringAssignmentTarget, parserParams: List[Boolean]) extends AssignmentRestProperty {
  x1.parent = Some(this)
  val name: String = "AssignmentRestProperty0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("...", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("DestructuringAssignmentTarget", x1, Nil).reverse
  val info: ASTInfo = AssignmentRestProperty0
}
object AssignmentRestProperty0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "RestDestructuringAssignmentEvaluation0" -> AssignmentRestProperty0RestDestructuringAssignmentEvaluation0.func
  )
}
