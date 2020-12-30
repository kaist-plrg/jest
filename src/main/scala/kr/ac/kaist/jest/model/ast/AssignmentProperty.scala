package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AssignmentProperty extends AST {
  val kind: String = "AssignmentProperty"
}
case class AssignmentProperty0(x0: IdentifierReference, x1: Option[Initializer], parserParams: List[Boolean]) extends AssignmentProperty {
  x0.parent = Some(this)
  x1.foreach((m) => m.parent = Some(this))
  val name: String = "AssignmentProperty0"
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
  val fullList: List[(String, Value)] = l("Option[Initializer]", x1, l("IdentifierReference", x0, Nil)).reverse
  val info: ASTInfo = AssignmentProperty0
}
object AssignmentProperty0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "PropertyDestructuringAssignmentEvaluation1" -> AssignmentProperty0PropertyDestructuringAssignmentEvaluation1.func
  )
}
case class AssignmentProperty1(x0: PropertyName, x2: AssignmentElement, parserParams: List[Boolean]) extends AssignmentProperty {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "AssignmentProperty1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ":", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AssignmentElement", x2, l("PropertyName", x0, Nil)).reverse
  val info: ASTInfo = AssignmentProperty1
}
object AssignmentProperty1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "PropertyDestructuringAssignmentEvaluation0" -> AssignmentProperty1PropertyDestructuringAssignmentEvaluation0.func
  )
}
