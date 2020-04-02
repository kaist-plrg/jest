package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CoalesceExpressionHead extends AST {
  val kind: String = "CoalesceExpressionHead"
}
case class CoalesceExpressionHead0(x0: CoalesceExpression, parserParams: List[Boolean]) extends CoalesceExpressionHead {
  val name: String = "CoalesceExpressionHead0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("CoalesceExpression", x0, Nil).reverse
  val info: ASTInfo = CoalesceExpressionHead0
}
object CoalesceExpressionHead0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class CoalesceExpressionHead1(x0: BitwiseORExpression, parserParams: List[Boolean]) extends CoalesceExpressionHead {
  val name: String = "CoalesceExpressionHead1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BitwiseORExpression", x0, Nil).reverse
  val info: ASTInfo = CoalesceExpressionHead1
}
object CoalesceExpressionHead1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
