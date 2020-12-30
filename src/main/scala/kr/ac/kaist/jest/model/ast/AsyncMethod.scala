package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncMethod extends AST {
  val kind: String = "AsyncMethod"
}
case class AsyncMethod0(x2: PropertyName, x4: UniqueFormalParameters, x7: AsyncFunctionBody, parserParams: List[Boolean]) extends AsyncMethod {
  x2.parent = Some(this)
  x4.parent = Some(this)
  x7.parent = Some(this)
  val name: String = "AsyncMethod0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(x2.updateSpan(end))
    inc(end + 1)
    inc(x4.updateSpan(end))
    inc(end + 1)
    inc(end + 1)
    inc(x7.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("async", x2, "(", x4, ")", "{", x7, "}")
  }
  val k: Int = d(x7, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("AsyncFunctionBody", x7, l("UniqueFormalParameters", x4, l("PropertyName", x2, Nil))).reverse
  val info: ASTInfo = AsyncMethod0
}
object AsyncMethod0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> AsyncMethod0ComputedPropertyContains0.func,
    "PropName0" -> AsyncMethod0PropName0.func,
    "PropertyDefinitionEvaluation0" -> AsyncMethod0PropertyDefinitionEvaluation0.func
  )
}
