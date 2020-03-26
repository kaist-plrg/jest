package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AssignmentElement extends AST {
  val kind: String = "AssignmentElement"
}
case class AssignmentElement0(x0: DestructuringAssignmentTarget, x1: Option[Initializer], parserParams: List[Boolean]) extends AssignmentElement {
  val name: String = "AssignmentElement0"
  override def toString: String = {
    s"$x0 ${x1.getOrElse("")}"
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
