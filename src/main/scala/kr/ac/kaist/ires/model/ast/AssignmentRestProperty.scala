package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AssignmentRestProperty extends AST {
  val kind: String = "AssignmentRestProperty"
}
case class AssignmentRestProperty0(x1: DestructuringAssignmentTarget, parserParams: List[Boolean]) extends AssignmentRestProperty {
  x1.parent = Some(this)
  val name: String = "AssignmentRestProperty0"
  override def toString: String = {
    s"... $x1"
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
