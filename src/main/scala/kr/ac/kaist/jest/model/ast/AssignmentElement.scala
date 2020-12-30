package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AssignmentElement extends AST {
  val kind: String = "AssignmentElement"
}
case class AssignmentElement0(x0: DestructuringAssignmentTarget, x1: Option[Initializer], parserParams: List[Boolean]) extends AssignmentElement {
  x0.parent = Some(this)
  x1.foreach((m) => m.parent = Some(this))
  val name: String = "AssignmentElement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    x1.map(x => inc(x.updateSpan(end)))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1.getOrElse(""))
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Option[Initializer]", x1, l("DestructuringAssignmentTarget", x0, Nil)).reverse
  val info: ASTInfo = AssignmentElement0
}
object AssignmentElement0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "IteratorDestructuringAssignmentEvaluation1" -> AssignmentElement0IteratorDestructuringAssignmentEvaluation1.func,
    "KeyedDestructuringAssignmentEvaluation1" -> AssignmentElement0KeyedDestructuringAssignmentEvaluation1.func
  )
}
