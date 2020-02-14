package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait PrimaryExpression extends AST {
  val kind: String = "PrimaryExpression"
}
case class PrimaryExpression0(parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression0"
  override def toString: String = {
    s"this"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = PrimaryExpression0
}
object PrimaryExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> PrimaryExpression0Evaluation0.func,
    "IsFunctionDefinition0" -> PrimaryExpression0IsFunctionDefinition0.func,
    "AssignmentTargetType0" -> PrimaryExpression0AssignmentTargetType0.func,
    "IsIdentifierRef0" -> PrimaryExpression0IsIdentifierRef0.func,
    "ExpressionRules0" -> PrimaryExpression0ExpressionRules0.func
  )
}
case class PrimaryExpression1(x0: IdentifierReference, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("IdentifierReference", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression1
}
object PrimaryExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsIdentifierRef0" -> PrimaryExpression1IsIdentifierRef0.func,
    "IsFunctionDefinition0" -> PrimaryExpression1IsFunctionDefinition0.func,
    "ExpressionRules0" -> PrimaryExpression1ExpressionRules0.func
  )
}
case class PrimaryExpression2(x0: Literal, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression2"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Literal", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression2
}
object PrimaryExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpressionRules0" -> PrimaryExpression2ExpressionRules0.func,
    "IsIdentifierRef0" -> PrimaryExpression2IsIdentifierRef0.func,
    "IsFunctionDefinition0" -> PrimaryExpression2IsFunctionDefinition0.func,
    "AssignmentTargetType0" -> PrimaryExpression2AssignmentTargetType0.func
  )
}
case class PrimaryExpression3(x0: ArrayLiteral, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression3"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ArrayLiteral", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression3
}
object PrimaryExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> PrimaryExpression3AssignmentTargetType0.func,
    "ExpressionRules0" -> PrimaryExpression3ExpressionRules0.func,
    "IsIdentifierRef0" -> PrimaryExpression3IsIdentifierRef0.func,
    "IsFunctionDefinition0" -> PrimaryExpression3IsFunctionDefinition0.func
  )
}
case class PrimaryExpression4(x0: ObjectLiteral, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression4"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ObjectLiteral", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression4
}
object PrimaryExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> PrimaryExpression4AssignmentTargetType0.func,
    "IsFunctionDefinition0" -> PrimaryExpression4IsFunctionDefinition0.func,
    "IsIdentifierRef0" -> PrimaryExpression4IsIdentifierRef0.func,
    "ExpressionRules0" -> PrimaryExpression4ExpressionRules0.func
  )
}
case class PrimaryExpression5(x0: FunctionExpression, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression5"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FunctionExpression", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression5
}
object PrimaryExpression5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsIdentifierRef0" -> PrimaryExpression5IsIdentifierRef0.func,
    "ExpressionRules0" -> PrimaryExpression5ExpressionRules0.func,
    "AssignmentTargetType0" -> PrimaryExpression5AssignmentTargetType0.func
  )
}
case class PrimaryExpression6(x0: ClassExpression, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression6"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ClassExpression", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression6
}
object PrimaryExpression6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> PrimaryExpression6AssignmentTargetType0.func,
    "ExpressionRules0" -> PrimaryExpression6ExpressionRules0.func,
    "IsIdentifierRef0" -> PrimaryExpression6IsIdentifierRef0.func
  )
}
case class PrimaryExpression7(x0: GeneratorExpression, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression7"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("GeneratorExpression", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression7
}
object PrimaryExpression7 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpressionRules0" -> PrimaryExpression7ExpressionRules0.func,
    "IsIdentifierRef0" -> PrimaryExpression7IsIdentifierRef0.func,
    "AssignmentTargetType0" -> PrimaryExpression7AssignmentTargetType0.func
  )
}
case class PrimaryExpression8(x0: AsyncFunctionExpression, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression8"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AsyncFunctionExpression", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression8
}
object PrimaryExpression8 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpressionRules0" -> PrimaryExpression8ExpressionRules0.func,
    "IsIdentifierRef0" -> PrimaryExpression8IsIdentifierRef0.func,
    "AssignmentTargetType0" -> PrimaryExpression8AssignmentTargetType0.func
  )
}
case class PrimaryExpression9(x0: AsyncGeneratorExpression, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression9"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AsyncGeneratorExpression", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression9
}
object PrimaryExpression9 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpressionRules0" -> PrimaryExpression9ExpressionRules0.func,
    "IsIdentifierRef0" -> PrimaryExpression9IsIdentifierRef0.func,
    "AssignmentTargetType0" -> PrimaryExpression9AssignmentTargetType0.func
  )
}
case class PrimaryExpression10(x0: Lexical, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression10"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression10
}
object PrimaryExpression10 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> PrimaryExpression10AssignmentTargetType0.func,
    "IsFunctionDefinition0" -> PrimaryExpression10IsFunctionDefinition0.func,
    "ExpressionRules0" -> PrimaryExpression10ExpressionRules0.func,
    "Evaluation0" -> PrimaryExpression10Evaluation0.func,
    "IsIdentifierRef0" -> PrimaryExpression10IsIdentifierRef0.func
  )
}
case class PrimaryExpression11(x0: TemplateLiteral, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression11"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("TemplateLiteral", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression11
}
object PrimaryExpression11 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsFunctionDefinition0" -> PrimaryExpression11IsFunctionDefinition0.func,
    "ExpressionRules0" -> PrimaryExpression11ExpressionRules0.func,
    "AssignmentTargetType0" -> PrimaryExpression11AssignmentTargetType0.func,
    "IsIdentifierRef0" -> PrimaryExpression11IsIdentifierRef0.func
  )
}
case class PrimaryExpression12(x0: CoverParenthesizedExpressionAndArrowParameterList, parserParams: List[Boolean]) extends PrimaryExpression {
  val name: String = "PrimaryExpression12"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("CoverParenthesizedExpressionAndArrowParameterList", x0, Nil).reverse
  val info: ASTInfo = PrimaryExpression12
}
object PrimaryExpression12 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsIdentifierRef0" -> PrimaryExpression12IsIdentifierRef0.func,
    "ExpressionRules0" -> PrimaryExpression12ExpressionRules0.func,
    "AssignmentTargetType0" -> PrimaryExpression12AssignmentTargetType0.func,
    "Evaluation0" -> PrimaryExpression12Evaluation0.func,
    "NamedEvaluation0" -> PrimaryExpression12NamedEvaluation0.func,
    "HasName0" -> PrimaryExpression12HasName0.func,
    "IsFunctionDefinition0" -> PrimaryExpression12IsFunctionDefinition0.func
  )
}
