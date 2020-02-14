package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AssignmentProperty extends AST {
  val kind: String = "AssignmentProperty"
}
case class AssignmentProperty0(x0: IdentifierReference, x1: Option[Initializer], parserParams: List[Boolean]) extends AssignmentProperty {
  val name: String = "AssignmentProperty0"
  override def toString: String = {
    s"$x0 ${x1.getOrElse("")}"
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
  val name: String = "AssignmentProperty1"
  override def toString: String = {
    s"$x0 : $x2"
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
