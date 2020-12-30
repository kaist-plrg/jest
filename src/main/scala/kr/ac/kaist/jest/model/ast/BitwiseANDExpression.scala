package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BitwiseANDExpression extends AST {
  val kind: String = "BitwiseANDExpression"
}
case class BitwiseANDExpression0(x0: EqualityExpression, parserParams: List[Boolean]) extends BitwiseANDExpression {
  x0.parent = Some(this)
  val name: String = "BitwiseANDExpression0"
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
  val fullList: List[(String, Value)] = l("EqualityExpression", x0, Nil).reverse
  val info: ASTInfo = BitwiseANDExpression0
}
object BitwiseANDExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class BitwiseANDExpression1(x0: BitwiseANDExpression, x2: EqualityExpression, parserParams: List[Boolean]) extends BitwiseANDExpression {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "BitwiseANDExpression1"
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
    s(x0, "&", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("EqualityExpression", x2, l("BitwiseANDExpression", x0, Nil)).reverse
  val info: ASTInfo = BitwiseANDExpression1
}
object BitwiseANDExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> BitwiseANDExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> BitwiseANDExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> BitwiseANDExpression1IsFunctionDefinition0.func
  )
}
