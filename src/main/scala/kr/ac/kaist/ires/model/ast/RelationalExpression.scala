package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait RelationalExpression extends AST {
  val kind: String = "RelationalExpression"
}
case class RelationalExpression0(x0: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  val name: String = "RelationalExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ShiftExpression", x0, Nil).reverse
  val info: ASTInfo = RelationalExpression0
}
object RelationalExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class RelationalExpression1(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  val name: String = "RelationalExpression1"
  override def toString: String = {
    s"$x0 < $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression1
}
object RelationalExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpressionRules0" -> RelationalExpression1ExpressionRules0.func,
    "IsFunctionDefinition0" -> RelationalExpression1IsFunctionDefinition0.func,
    "AssignmentTargetType0" -> RelationalExpression1AssignmentTargetType0.func,
    "Evaluation0" -> RelationalExpression1Evaluation0.func
  )
}
case class RelationalExpression2(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  val name: String = "RelationalExpression2"
  override def toString: String = {
    s"$x0 > $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression2
}
object RelationalExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpressionRules0" -> RelationalExpression2ExpressionRules0.func,
    "IsFunctionDefinition0" -> RelationalExpression2IsFunctionDefinition0.func,
    "Evaluation0" -> RelationalExpression2Evaluation0.func,
    "AssignmentTargetType0" -> RelationalExpression2AssignmentTargetType0.func
  )
}
case class RelationalExpression3(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  val name: String = "RelationalExpression3"
  override def toString: String = {
    s"$x0 <= $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression3
}
object RelationalExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> RelationalExpression3Evaluation0.func,
    "ExpressionRules0" -> RelationalExpression3ExpressionRules0.func,
    "AssignmentTargetType0" -> RelationalExpression3AssignmentTargetType0.func,
    "IsFunctionDefinition0" -> RelationalExpression3IsFunctionDefinition0.func
  )
}
case class RelationalExpression4(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  val name: String = "RelationalExpression4"
  override def toString: String = {
    s"$x0 >= $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression4
}
object RelationalExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> RelationalExpression4AssignmentTargetType0.func,
    "IsFunctionDefinition0" -> RelationalExpression4IsFunctionDefinition0.func,
    "Evaluation0" -> RelationalExpression4Evaluation0.func,
    "ExpressionRules0" -> RelationalExpression4ExpressionRules0.func
  )
}
case class RelationalExpression5(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  val name: String = "RelationalExpression5"
  override def toString: String = {
    s"$x0 instanceof $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression5
}
object RelationalExpression5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> RelationalExpression5AssignmentTargetType0.func,
    "Evaluation0" -> RelationalExpression5Evaluation0.func,
    "IsFunctionDefinition0" -> RelationalExpression5IsFunctionDefinition0.func,
    "ExpressionRules0" -> RelationalExpression5ExpressionRules0.func
  )
}
case class RelationalExpression6(x0: RelationalExpression, x2: ShiftExpression, parserParams: List[Boolean]) extends RelationalExpression {
  val name: String = "RelationalExpression6"
  override def toString: String = {
    s"$x0 in $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ShiftExpression", x2, l("RelationalExpression", x0, Nil)).reverse
  val info: ASTInfo = RelationalExpression6
}
object RelationalExpression6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> RelationalExpression6AssignmentTargetType0.func,
    "Evaluation0" -> RelationalExpression6Evaluation0.func,
    "ExpressionRules0" -> RelationalExpression6ExpressionRules0.func,
    "IsFunctionDefinition0" -> RelationalExpression6IsFunctionDefinition0.func
  )
}
