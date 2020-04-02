package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait OptionalChain extends AST {
  val kind: String = "OptionalChain"
}
case class OptionalChain0(x1: Arguments, parserParams: List[Boolean]) extends OptionalChain {
  val name: String = "OptionalChain0"
  override def toString: String = {
    s"?. $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Arguments", x1, Nil).reverse
  val info: ASTInfo = OptionalChain0
}
object OptionalChain0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ChainEvaluation0" -> OptionalChain0ChainEvaluation0.func,
    "ExpressionRules0" -> OptionalChain0ExpressionRules0.func
  )
}
case class OptionalChain1(x2: Expression, parserParams: List[Boolean]) extends OptionalChain {
  val name: String = "OptionalChain1"
  override def toString: String = {
    s"?. [ $x2 ]"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("Expression", x2, Nil).reverse
  val info: ASTInfo = OptionalChain1
}
object OptionalChain1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ChainEvaluation0" -> OptionalChain1ChainEvaluation0.func,
    "ExpressionRules0" -> OptionalChain1ExpressionRules0.func
  )
}
case class OptionalChain2(x1: Lexical, parserParams: List[Boolean]) extends OptionalChain {
  val name: String = "OptionalChain2"
  override def toString: String = {
    s"?. $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Lexical", x1, Nil).reverse
  val info: ASTInfo = OptionalChain2
}
object OptionalChain2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ChainEvaluation0" -> OptionalChain2ChainEvaluation0.func,
    "Contains0" -> OptionalChain2Contains0.func,
    "ExpressionRules0" -> OptionalChain2ExpressionRules0.func
  )
}
case class OptionalChain3(x1: TemplateLiteral, parserParams: List[Boolean]) extends OptionalChain {
  val name: String = "OptionalChain3"
  override def toString: String = {
    s"?. $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("TemplateLiteral", x1, Nil).reverse
  val info: ASTInfo = OptionalChain3
}
object OptionalChain3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class OptionalChain4(x0: OptionalChain, x1: Arguments, parserParams: List[Boolean]) extends OptionalChain {
  val name: String = "OptionalChain4"
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Arguments", x1, l("OptionalChain", x0, Nil)).reverse
  val info: ASTInfo = OptionalChain4
}
object OptionalChain4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ChainEvaluation0" -> OptionalChain4ChainEvaluation0.func,
    "ExpressionRules0" -> OptionalChain4ExpressionRules0.func
  )
}
case class OptionalChain5(x0: OptionalChain, x2: Expression, parserParams: List[Boolean]) extends OptionalChain {
  val name: String = "OptionalChain5"
  override def toString: String = {
    s"$x0 [ $x2 ]"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("Expression", x2, l("OptionalChain", x0, Nil)).reverse
  val info: ASTInfo = OptionalChain5
}
object OptionalChain5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ChainEvaluation0" -> OptionalChain5ChainEvaluation0.func,
    "ExpressionRules0" -> OptionalChain5ExpressionRules0.func
  )
}
case class OptionalChain6(x0: OptionalChain, x2: Lexical, parserParams: List[Boolean]) extends OptionalChain {
  val name: String = "OptionalChain6"
  override def toString: String = {
    s"$x0 . $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("Lexical", x2, l("OptionalChain", x0, Nil)).reverse
  val info: ASTInfo = OptionalChain6
}
object OptionalChain6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ChainEvaluation0" -> OptionalChain6ChainEvaluation0.func,
    "Contains0" -> OptionalChain6Contains0.func,
    "ExpressionRules0" -> OptionalChain6ExpressionRules0.func
  )
}
case class OptionalChain7(x0: OptionalChain, x1: TemplateLiteral, parserParams: List[Boolean]) extends OptionalChain {
  val name: String = "OptionalChain7"
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("TemplateLiteral", x1, l("OptionalChain", x0, Nil)).reverse
  val info: ASTInfo = OptionalChain7
}
object OptionalChain7 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
