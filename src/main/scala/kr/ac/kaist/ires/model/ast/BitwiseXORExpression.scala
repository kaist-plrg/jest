package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BitwiseXORExpression extends AST {
  val kind: String = "BitwiseXORExpression"
}
case class BitwiseXORExpression0(x0: BitwiseANDExpression, parserParams: List[Boolean]) extends BitwiseXORExpression {
  x0.parent = Some(this)
  val name: String = "BitwiseXORExpression0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BitwiseANDExpression", x0, Nil).reverse
  val info: ASTInfo = BitwiseXORExpression0
}
object BitwiseXORExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class BitwiseXORExpression1(x0: BitwiseXORExpression, x2: BitwiseANDExpression, parserParams: List[Boolean]) extends BitwiseXORExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "BitwiseXORExpression1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k += 2
    k = x2.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0 ^ $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("BitwiseANDExpression", x2, l("BitwiseXORExpression", x0, Nil)).reverse
  val info: ASTInfo = BitwiseXORExpression1
}
object BitwiseXORExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> BitwiseXORExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> BitwiseXORExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> BitwiseXORExpression1IsFunctionDefinition0.func
  )
}
