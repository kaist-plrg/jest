package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ShiftExpression extends AST {
  val kind: String = "ShiftExpression"
}
case class ShiftExpression0(x0: AdditiveExpression, parserParams: List[Boolean]) extends ShiftExpression {
  val name: String = "ShiftExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AdditiveExpression", x0, Nil).reverse
  val info: ASTInfo = ShiftExpression0
}
object ShiftExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ShiftExpression1(x0: ShiftExpression, x2: AdditiveExpression, parserParams: List[Boolean]) extends ShiftExpression {
  val name: String = "ShiftExpression1"
  override def toString: String = {
    s"$x0 << $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AdditiveExpression", x2, l("ShiftExpression", x0, Nil)).reverse
  val info: ASTInfo = ShiftExpression1
}
object ShiftExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpressionRules0" -> ShiftExpression1ExpressionRules0.func,
    "IsFunctionDefinition0" -> ShiftExpression1IsFunctionDefinition0.func,
    "Evaluation0" -> ShiftExpression1Evaluation0.func,
    "AssignmentTargetType0" -> ShiftExpression1AssignmentTargetType0.func
  )
}
case class ShiftExpression2(x0: ShiftExpression, x2: AdditiveExpression, parserParams: List[Boolean]) extends ShiftExpression {
  val name: String = "ShiftExpression2"
  override def toString: String = {
    s"$x0 >> $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AdditiveExpression", x2, l("ShiftExpression", x0, Nil)).reverse
  val info: ASTInfo = ShiftExpression2
}
object ShiftExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> ShiftExpression2AssignmentTargetType0.func,
    "Evaluation0" -> ShiftExpression2Evaluation0.func,
    "IsFunctionDefinition0" -> ShiftExpression2IsFunctionDefinition0.func,
    "ExpressionRules0" -> ShiftExpression2ExpressionRules0.func
  )
}
case class ShiftExpression3(x0: ShiftExpression, x2: AdditiveExpression, parserParams: List[Boolean]) extends ShiftExpression {
  val name: String = "ShiftExpression3"
  override def toString: String = {
    s"$x0 >>> $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AdditiveExpression", x2, l("ShiftExpression", x0, Nil)).reverse
  val info: ASTInfo = ShiftExpression3
}
object ShiftExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsFunctionDefinition0" -> ShiftExpression3IsFunctionDefinition0.func,
    "ExpressionRules0" -> ShiftExpression3ExpressionRules0.func,
    "AssignmentTargetType0" -> ShiftExpression3AssignmentTargetType0.func,
    "Evaluation0" -> ShiftExpression3Evaluation0.func
  )
}
