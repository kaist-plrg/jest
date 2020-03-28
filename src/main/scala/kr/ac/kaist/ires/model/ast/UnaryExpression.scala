package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait UnaryExpression extends AST {
  val kind: String = "UnaryExpression"
}
case class UnaryExpression0(x0: UpdateExpression, parserParams: List[Boolean]) extends UnaryExpression {
  val name: String = "UnaryExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("UpdateExpression", x0, Nil).reverse
  val info: ASTInfo = UnaryExpression0
}
object UnaryExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class UnaryExpression1(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  val name: String = "UnaryExpression1"
  override def toString: String = {
    s"delete $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression1
}
object UnaryExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> UnaryExpression1AssignmentTargetType0.func,
    "Evaluation0" -> UnaryExpression1Evaluation0.func,
    "ExpressionRules0" -> UnaryExpression1ExpressionRules0.func,
    "IsFunctionDefinition0" -> UnaryExpression1IsFunctionDefinition0.func
  )
}
case class UnaryExpression2(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  val name: String = "UnaryExpression2"
  override def toString: String = {
    s"void $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression2
}
object UnaryExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> UnaryExpression2AssignmentTargetType0.func,
    "Evaluation0" -> UnaryExpression2Evaluation0.func,
    "ExpressionRules0" -> UnaryExpression2ExpressionRules0.func,
    "IsFunctionDefinition0" -> UnaryExpression2IsFunctionDefinition0.func
  )
}
case class UnaryExpression3(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  val name: String = "UnaryExpression3"
  override def toString: String = {
    s"typeof $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression3
}
object UnaryExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> UnaryExpression3AssignmentTargetType0.func,
    "Evaluation0" -> UnaryExpression3Evaluation0.func,
    "ExpressionRules0" -> UnaryExpression3ExpressionRules0.func,
    "IsFunctionDefinition0" -> UnaryExpression3IsFunctionDefinition0.func
  )
}
case class UnaryExpression4(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  val name: String = "UnaryExpression4"
  override def toString: String = {
    s"+ $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression4
}
object UnaryExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> UnaryExpression4AssignmentTargetType0.func,
    "Evaluation0" -> UnaryExpression4Evaluation0.func,
    "ExpressionRules0" -> UnaryExpression4ExpressionRules0.func,
    "IsFunctionDefinition0" -> UnaryExpression4IsFunctionDefinition0.func
  )
}
case class UnaryExpression5(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  val name: String = "UnaryExpression5"
  override def toString: String = {
    s"- $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression5
}
object UnaryExpression5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> UnaryExpression5AssignmentTargetType0.func,
    "Evaluation0" -> UnaryExpression5Evaluation0.func,
    "ExpressionRules0" -> UnaryExpression5ExpressionRules0.func,
    "IsFunctionDefinition0" -> UnaryExpression5IsFunctionDefinition0.func
  )
}
case class UnaryExpression6(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  val name: String = "UnaryExpression6"
  override def toString: String = {
    s"~ $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression6
}
object UnaryExpression6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> UnaryExpression6AssignmentTargetType0.func,
    "Evaluation0" -> UnaryExpression6Evaluation0.func,
    "ExpressionRules0" -> UnaryExpression6ExpressionRules0.func,
    "IsFunctionDefinition0" -> UnaryExpression6IsFunctionDefinition0.func
  )
}
case class UnaryExpression7(x1: UnaryExpression, parserParams: List[Boolean]) extends UnaryExpression {
  val name: String = "UnaryExpression7"
  override def toString: String = {
    s"! $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = UnaryExpression7
}
object UnaryExpression7 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> UnaryExpression7AssignmentTargetType0.func,
    "Evaluation0" -> UnaryExpression7Evaluation0.func,
    "ExpressionRules0" -> UnaryExpression7ExpressionRules0.func,
    "IsFunctionDefinition0" -> UnaryExpression7IsFunctionDefinition0.func
  )
}
case class UnaryExpression8(x0: AwaitExpression, parserParams: List[Boolean]) extends UnaryExpression {
  val name: String = "UnaryExpression8"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AwaitExpression", x0, Nil).reverse
  val info: ASTInfo = UnaryExpression8
}
object UnaryExpression8 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> UnaryExpression8AssignmentTargetType0.func,
    "ExpressionRules0" -> UnaryExpression8ExpressionRules0.func,
    "IsFunctionDefinition0" -> UnaryExpression8IsFunctionDefinition0.func
  )
}
