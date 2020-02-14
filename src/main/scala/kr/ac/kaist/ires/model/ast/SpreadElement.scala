package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait SpreadElement extends AST {
  val kind: String = "SpreadElement"
}
case class SpreadElement0(x1: AssignmentExpression, parserParams: List[Boolean]) extends SpreadElement {
  val name: String = "SpreadElement0"
  override def toString: String = {
    s"... $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x1, Nil).reverse
  val info: ASTInfo = SpreadElement0
}
object SpreadElement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArrayAccumulation0" -> SpreadElement0ArrayAccumulation0.func
  )
}
