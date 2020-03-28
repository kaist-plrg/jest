package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BreakableStatement extends AST {
  val kind: String = "BreakableStatement"
}
case class BreakableStatement0(x0: IterationStatement, parserParams: List[Boolean]) extends BreakableStatement {
  val name: String = "BreakableStatement0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("IterationStatement", x0, Nil).reverse
  val info: ASTInfo = BreakableStatement0
}
object BreakableStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUndefinedContinueTarget0" -> BreakableStatement0ContainsUndefinedContinueTarget0.func,
    "Evaluation0" -> BreakableStatement0Evaluation0.func,
    "LabelledEvaluation0" -> BreakableStatement0LabelledEvaluation0.func
  )
}
case class BreakableStatement1(x0: SwitchStatement, parserParams: List[Boolean]) extends BreakableStatement {
  val name: String = "BreakableStatement1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("SwitchStatement", x0, Nil).reverse
  val info: ASTInfo = BreakableStatement1
}
object BreakableStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> BreakableStatement1Evaluation0.func,
    "LabelledEvaluation0" -> BreakableStatement1LabelledEvaluation0.func
  )
}
