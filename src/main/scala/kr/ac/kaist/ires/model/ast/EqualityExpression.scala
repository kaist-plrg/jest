package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait EqualityExpression extends AST {
  val kind: String = "EqualityExpression"
}
case class EqualityExpression0(x0: RelationalExpression, parserParams: List[Boolean]) extends EqualityExpression {
  x0.parent = Some(this)
  val name: String = "EqualityExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("RelationalExpression", x0, Nil).reverse
  val info: ASTInfo = EqualityExpression0
}
object EqualityExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class EqualityExpression1(x0: EqualityExpression, x2: RelationalExpression, parserParams: List[Boolean]) extends EqualityExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "EqualityExpression1"
  override def toString: String = {
    s"$x0 == $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("RelationalExpression", x2, l("EqualityExpression", x0, Nil)).reverse
  val info: ASTInfo = EqualityExpression1
}
object EqualityExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> EqualityExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> EqualityExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> EqualityExpression1IsFunctionDefinition0.func
  )
}
case class EqualityExpression2(x0: EqualityExpression, x2: RelationalExpression, parserParams: List[Boolean]) extends EqualityExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "EqualityExpression2"
  override def toString: String = {
    s"$x0 != $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("RelationalExpression", x2, l("EqualityExpression", x0, Nil)).reverse
  val info: ASTInfo = EqualityExpression2
}
object EqualityExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> EqualityExpression2Evaluation0.func,
    "HasCallInTailPosition0" -> EqualityExpression2HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> EqualityExpression2IsFunctionDefinition0.func
  )
}
case class EqualityExpression3(x0: EqualityExpression, x2: RelationalExpression, parserParams: List[Boolean]) extends EqualityExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "EqualityExpression3"
  override def toString: String = {
    s"$x0 === $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("RelationalExpression", x2, l("EqualityExpression", x0, Nil)).reverse
  val info: ASTInfo = EqualityExpression3
}
object EqualityExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> EqualityExpression3Evaluation0.func,
    "HasCallInTailPosition0" -> EqualityExpression3HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> EqualityExpression3IsFunctionDefinition0.func
  )
}
case class EqualityExpression4(x0: EqualityExpression, x2: RelationalExpression, parserParams: List[Boolean]) extends EqualityExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "EqualityExpression4"
  override def toString: String = {
    s"$x0 !== $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("RelationalExpression", x2, l("EqualityExpression", x0, Nil)).reverse
  val info: ASTInfo = EqualityExpression4
}
object EqualityExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> EqualityExpression4Evaluation0.func,
    "HasCallInTailPosition0" -> EqualityExpression4HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> EqualityExpression4IsFunctionDefinition0.func
  )
}
