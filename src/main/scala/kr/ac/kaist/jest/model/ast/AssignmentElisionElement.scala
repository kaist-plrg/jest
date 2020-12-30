package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AssignmentElisionElement extends AST {
  val kind: String = "AssignmentElisionElement"
}
case class AssignmentElisionElement0(x0: Option[Elision], x1: AssignmentElement, parserParams: List[Boolean]) extends AssignmentElisionElement {
  x0.foreach((m) => m.parent = Some(this))
  x1.parent = Some(this)
  val name: String = "AssignmentElisionElement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    x0.map(x => inc(x.updateSpan(end)))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0.getOrElse(""), x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("AssignmentElement", x1, l("Option[Elision]", x0, Nil)).reverse
  val info: ASTInfo = AssignmentElisionElement0
}
object AssignmentElisionElement0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "IteratorDestructuringAssignmentEvaluation0" -> AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation0.func,
    "IteratorDestructuringAssignmentEvaluation1" -> AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation1.func
  )
}
