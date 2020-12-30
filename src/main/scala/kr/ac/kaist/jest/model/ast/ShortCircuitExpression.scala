package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ShortCircuitExpression extends AST {
  val kind: String = "ShortCircuitExpression"
}
case class ShortCircuitExpression0(x0: LogicalORExpression, parserParams: List[Boolean]) extends ShortCircuitExpression {
  x0.parent = Some(this)
  val name: String = "ShortCircuitExpression0"
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
  val fullList: List[(String, Value)] = l("LogicalORExpression", x0, Nil).reverse
  val info: ASTInfo = ShortCircuitExpression0
}
object ShortCircuitExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ShortCircuitExpression1(x0: CoalesceExpression, parserParams: List[Boolean]) extends ShortCircuitExpression {
  x0.parent = Some(this)
  val name: String = "ShortCircuitExpression1"
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
  val fullList: List[(String, Value)] = l("CoalesceExpression", x0, Nil).reverse
  val info: ASTInfo = ShortCircuitExpression1
}
object ShortCircuitExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
