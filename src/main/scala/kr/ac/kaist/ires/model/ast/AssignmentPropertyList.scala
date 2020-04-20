package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AssignmentPropertyList extends AST {
  val kind: String = "AssignmentPropertyList"
}
case class AssignmentPropertyList0(x0: AssignmentProperty, parserParams: List[Boolean]) extends AssignmentPropertyList {
  x0.parent = Some(this)
  val name: String = "AssignmentPropertyList0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AssignmentProperty", x0, Nil).reverse
  val info: ASTInfo = AssignmentPropertyList0
}
object AssignmentPropertyList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class AssignmentPropertyList1(x0: AssignmentPropertyList, x2: AssignmentProperty, parserParams: List[Boolean]) extends AssignmentPropertyList {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "AssignmentPropertyList1"
  override def toString: String = {
    s"$x0 , $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AssignmentProperty", x2, l("AssignmentPropertyList", x0, Nil)).reverse
  val info: ASTInfo = AssignmentPropertyList1
}
object AssignmentPropertyList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "PropertyDestructuringAssignmentEvaluation0" -> AssignmentPropertyList1PropertyDestructuringAssignmentEvaluation0.func
  )
}
