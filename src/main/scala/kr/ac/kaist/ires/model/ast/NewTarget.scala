package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait NewTarget extends AST {
  val kind: String = "NewTarget"
}
case class NewTarget0(parserParams: List[Boolean]) extends NewTarget {
  val name: String = "NewTarget0"
  override def toString: String = {
    s"new . target"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = NewTarget0
}
object NewTarget0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> NewTarget0Evaluation0.func,
    "AssignmentTargetType0" -> NewTarget0AssignmentTargetType0.func
  )
}
