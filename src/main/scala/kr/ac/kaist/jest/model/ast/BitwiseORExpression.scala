package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BitwiseORExpression extends AST {
  val kind: String = "BitwiseORExpression"
}
case class BitwiseORExpression0(x0: BitwiseXORExpression, parserParams: List[Boolean]) extends BitwiseORExpression {
  x0.parent = Some(this)
  val name: String = "BitwiseORExpression0"
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
  val fullList: List[(String, Value)] = l("BitwiseXORExpression", x0, Nil).reverse
  val info: ASTInfo = BitwiseORExpression0
}
object BitwiseORExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class BitwiseORExpression1(x0: BitwiseORExpression, x2: BitwiseXORExpression, parserParams: List[Boolean]) extends BitwiseORExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "BitwiseORExpression1"
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
    s(x0, "|", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("BitwiseXORExpression", x2, l("BitwiseORExpression", x0, Nil)).reverse
  val info: ASTInfo = BitwiseORExpression1
}
object BitwiseORExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> BitwiseORExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> BitwiseORExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> BitwiseORExpression1IsFunctionDefinition0.func
  )
}
