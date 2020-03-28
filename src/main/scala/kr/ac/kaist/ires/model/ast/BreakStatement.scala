package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BreakStatement extends AST {
  val kind: String = "BreakStatement"
}
case class BreakStatement0(parserParams: List[Boolean]) extends BreakStatement {
  val name: String = "BreakStatement0"
  override def toString: String = {
    s"break ;"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = BreakStatement0
}
object BreakStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUndefinedBreakTarget0" -> BreakStatement0ContainsUndefinedBreakTarget0.func,
    "Evaluation0" -> BreakStatement0Evaluation0.func
  )
}
case class BreakStatement1(x2: LabelIdentifier, parserParams: List[Boolean]) extends BreakStatement {
  val name: String = "BreakStatement1"
  override def toString: String = {
    s"break $x2 ;"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("LabelIdentifier", x2, Nil).reverse
  val info: ASTInfo = BreakStatement1
}
object BreakStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUndefinedBreakTarget0" -> BreakStatement1ContainsUndefinedBreakTarget0.func,
    "Evaluation0" -> BreakStatement1Evaluation0.func
  )
}
