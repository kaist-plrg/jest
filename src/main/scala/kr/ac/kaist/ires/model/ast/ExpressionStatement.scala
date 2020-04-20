package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ExpressionStatement extends AST {
  val kind: String = "ExpressionStatement"
}
case class ExpressionStatement0(x1: Expression, parserParams: List[Boolean]) extends ExpressionStatement {
  x1.parent = Some(this)
  val name: String = "ExpressionStatement0"
  override def toString: String = {
    s"$x1 ;"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Expression", x1, Nil).reverse
  val info: ASTInfo = ExpressionStatement0
}
object ExpressionStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ExpressionStatement0Evaluation0.func
  )
}
