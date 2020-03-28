package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CallExpression extends AST {
  val kind: String = "CallExpression"
}
case class CallExpression0(x0: CoverCallExpressionAndAsyncArrowHead, parserParams: List[Boolean]) extends CallExpression {
  val name: String = "CallExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("CoverCallExpressionAndAsyncArrowHead", x0, Nil).reverse
  val info: ASTInfo = CallExpression0
}
object CallExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> CallExpression0AssignmentTargetType0.func,
    "Evaluation0" -> CallExpression0Evaluation0.func,
    "ExpressionRules0" -> CallExpression0ExpressionRules0.func
  )
}
case class CallExpression1(x0: SuperCall, parserParams: List[Boolean]) extends CallExpression {
  val name: String = "CallExpression1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("SuperCall", x0, Nil).reverse
  val info: ASTInfo = CallExpression1
}
object CallExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> CallExpression1AssignmentTargetType0.func,
    "ExpressionRules0" -> CallExpression1ExpressionRules0.func
  )
}
case class CallExpression2(x0: ImportCall, parserParams: List[Boolean]) extends CallExpression {
  val name: String = "CallExpression2"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ImportCall", x0, Nil).reverse
  val info: ASTInfo = CallExpression2
}
object CallExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> CallExpression2AssignmentTargetType0.func
  )
}
case class CallExpression3(x0: CallExpression, x1: Arguments, parserParams: List[Boolean]) extends CallExpression {
  val name: String = "CallExpression3"
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Arguments", x1, l("CallExpression", x0, Nil)).reverse
  val info: ASTInfo = CallExpression3
}
object CallExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> CallExpression3AssignmentTargetType0.func,
    "Evaluation0" -> CallExpression3Evaluation0.func,
    "ExpressionRules0" -> CallExpression3ExpressionRules0.func
  )
}
case class CallExpression4(x0: CallExpression, x2: Expression, parserParams: List[Boolean]) extends CallExpression {
  val name: String = "CallExpression4"
  override def toString: String = {
    s"$x0 [ $x2 ]"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("Expression", x2, l("CallExpression", x0, Nil)).reverse
  val info: ASTInfo = CallExpression4
}
object CallExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> CallExpression4AssignmentTargetType0.func,
    "Evaluation0" -> CallExpression4Evaluation0.func,
    "ExpressionRules0" -> CallExpression4ExpressionRules0.func
  )
}
case class CallExpression5(x0: CallExpression, x2: Lexical, parserParams: List[Boolean]) extends CallExpression {
  val name: String = "CallExpression5"
  override def toString: String = {
    s"$x0 . $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("Lexical", x2, l("CallExpression", x0, Nil)).reverse
  val info: ASTInfo = CallExpression5
}
object CallExpression5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> CallExpression5AssignmentTargetType0.func,
    "Contains0" -> CallExpression5Contains0.func,
    "Evaluation0" -> CallExpression5Evaluation0.func,
    "ExpressionRules0" -> CallExpression5ExpressionRules0.func
  )
}
case class CallExpression6(x0: CallExpression, x1: TemplateLiteral, parserParams: List[Boolean]) extends CallExpression {
  val name: String = "CallExpression6"
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("TemplateLiteral", x1, l("CallExpression", x0, Nil)).reverse
  val info: ASTInfo = CallExpression6
}
object CallExpression6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> CallExpression6AssignmentTargetType0.func,
    "Evaluation0" -> CallExpression6Evaluation0.func,
    "ExpressionRules0" -> CallExpression6ExpressionRules0.func
  )
}
