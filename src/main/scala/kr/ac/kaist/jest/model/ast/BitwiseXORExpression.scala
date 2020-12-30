package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BitwiseXORExpression extends AST {
  val kind: String = "BitwiseXORExpression"
}
case class BitwiseXORExpression0(x0: BitwiseANDExpression, parserParams: List[Boolean]) extends BitwiseXORExpression {
  x0.parent = Some(this)
  val name: String = "BitwiseXORExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
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
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "^", x2)
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
