package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncGeneratorMethod extends AST {
  val kind: String = "AsyncGeneratorMethod"
}
case class AsyncGeneratorMethod0(x3: PropertyName, x5: UniqueFormalParameters, x8: AsyncGeneratorBody, parserParams: List[Boolean]) extends AsyncGeneratorMethod {
  x3.parent = Some(this)
  x5.parent = Some(this)
  x8.parent = Some(this)
  val name: String = "AsyncGeneratorMethod0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(end + 1)
    inc(x3.updateSpan(end))
    inc(end + 1)
    inc(x5.updateSpan(end))
    inc(end + 1)
    inc(end + 1)
    inc(x8.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("async", "*", x3, "(", x5, ")", "{", x8, "}")
  }
  val k: Int = d(x8, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("AsyncGeneratorBody", x8, l("UniqueFormalParameters", x5, l("PropertyName", x3, Nil))).reverse
  val info: ASTInfo = AsyncGeneratorMethod0
}
object AsyncGeneratorMethod0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> AsyncGeneratorMethod0ComputedPropertyContains0.func,
    "PropName0" -> AsyncGeneratorMethod0PropName0.func,
    "PropertyDefinitionEvaluation0" -> AsyncGeneratorMethod0PropertyDefinitionEvaluation0.func
  )
}
