package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AdditiveExpression extends AST {
  val kind: String = "AdditiveExpression"
}
case class AdditiveExpression0(x0: MultiplicativeExpression, parserParams: List[Boolean]) extends AdditiveExpression {
  val name: String = "AdditiveExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("MultiplicativeExpression", x0, Nil).reverse
  val info: ASTInfo = AdditiveExpression0
}
object AdditiveExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class AdditiveExpression1(x0: AdditiveExpression, x2: MultiplicativeExpression, parserParams: List[Boolean]) extends AdditiveExpression {
  val name: String = "AdditiveExpression1"
  override def toString: String = {
    s"$x0 + $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("MultiplicativeExpression", x2, l("AdditiveExpression", x0, Nil)).reverse
  val info: ASTInfo = AdditiveExpression1
}
object AdditiveExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> AdditiveExpression1AssignmentTargetType0.func,
    "Evaluation0" -> AdditiveExpression1Evaluation0.func,
    "ExpressionRules0" -> AdditiveExpression1ExpressionRules0.func,
    "IsFunctionDefinition0" -> AdditiveExpression1IsFunctionDefinition0.func
  )
}
case class AdditiveExpression2(x0: AdditiveExpression, x2: MultiplicativeExpression, parserParams: List[Boolean]) extends AdditiveExpression {
  val name: String = "AdditiveExpression2"
  override def toString: String = {
    s"$x0 - $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("MultiplicativeExpression", x2, l("AdditiveExpression", x0, Nil)).reverse
  val info: ASTInfo = AdditiveExpression2
}
object AdditiveExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsFunctionDefinition0" -> AdditiveExpression2IsFunctionDefinition0.func,
    "AssignmentTargetType0" -> AdditiveExpression2AssignmentTargetType0.func,
    "Evaluation0" -> AdditiveExpression2Evaluation0.func,
    "ExpressionRules0" -> AdditiveExpression2ExpressionRules0.func
  )
}
