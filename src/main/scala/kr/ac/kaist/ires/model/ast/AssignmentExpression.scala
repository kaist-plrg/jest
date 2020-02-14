package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AssignmentExpression extends AST {
  val kind: String = "AssignmentExpression"
}
case class AssignmentExpression0(x0: ConditionalExpression, parserParams: List[Boolean]) extends AssignmentExpression {
  val name: String = "AssignmentExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ConditionalExpression", x0, Nil).reverse
  val info: ASTInfo = AssignmentExpression0
}
object AssignmentExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class AssignmentExpression1(x0: YieldExpression, parserParams: List[Boolean]) extends AssignmentExpression {
  val name: String = "AssignmentExpression1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("YieldExpression", x0, Nil).reverse
  val info: ASTInfo = AssignmentExpression1
}
object AssignmentExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsFunctionDefinition0" -> AssignmentExpression1IsFunctionDefinition0.func,
    "ExpressionRules0" -> AssignmentExpression1ExpressionRules0.func,
    "AssignmentTargetType0" -> AssignmentExpression1AssignmentTargetType0.func
  )
}
case class AssignmentExpression2(x0: ArrowFunction, parserParams: List[Boolean]) extends AssignmentExpression {
  val name: String = "AssignmentExpression2"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ArrowFunction", x0, Nil).reverse
  val info: ASTInfo = AssignmentExpression2
}
object AssignmentExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> AssignmentExpression2AssignmentTargetType0.func,
    "ExpressionRules0" -> AssignmentExpression2ExpressionRules0.func,
    "IsFunctionDefinition0" -> AssignmentExpression2IsFunctionDefinition0.func
  )
}
case class AssignmentExpression3(x0: AsyncArrowFunction, parserParams: List[Boolean]) extends AssignmentExpression {
  val name: String = "AssignmentExpression3"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AsyncArrowFunction", x0, Nil).reverse
  val info: ASTInfo = AssignmentExpression3
}
object AssignmentExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsFunctionDefinition0" -> AssignmentExpression3IsFunctionDefinition0.func,
    "AssignmentTargetType0" -> AssignmentExpression3AssignmentTargetType0.func,
    "ExpressionRules0" -> AssignmentExpression3ExpressionRules0.func
  )
}
case class AssignmentExpression4(x0: LeftHandSideExpression, x2: AssignmentExpression, parserParams: List[Boolean]) extends AssignmentExpression {
  val name: String = "AssignmentExpression4"
  override def toString: String = {
    s"$x0 = $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AssignmentExpression", x2, l("LeftHandSideExpression", x0, Nil)).reverse
  val info: ASTInfo = AssignmentExpression4
}
object AssignmentExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> AssignmentExpression4Evaluation0.func,
    "IsFunctionDefinition0" -> AssignmentExpression4IsFunctionDefinition0.func,
    "ExpressionRules0" -> AssignmentExpression4ExpressionRules0.func,
    "AssignmentTargetType0" -> AssignmentExpression4AssignmentTargetType0.func
  )
}
case class AssignmentExpression5(x0: LeftHandSideExpression, x1: AssignmentOperator, x2: AssignmentExpression, parserParams: List[Boolean]) extends AssignmentExpression {
  val name: String = "AssignmentExpression5"
  override def toString: String = {
    s"$x0 $x1 $x2"
  }
  val k: Int = d(x2, d(x1, d(x0, 0)))
  val fullList: List[(String, Value)] = l("AssignmentExpression", x2, l("AssignmentOperator", x1, l("LeftHandSideExpression", x0, Nil))).reverse
  val info: ASTInfo = AssignmentExpression5
}
object AssignmentExpression5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpressionRules0" -> AssignmentExpression5ExpressionRules0.func,
    "AssignmentTargetType0" -> AssignmentExpression5AssignmentTargetType0.func,
    "Evaluation0" -> AssignmentExpression5Evaluation0.func,
    "IsFunctionDefinition0" -> AssignmentExpression5IsFunctionDefinition0.func
  )
}
