package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait GeneratorMethod extends AST {
  val kind: String = "GeneratorMethod"
}
case class GeneratorMethod0(x1: PropertyName, x3: UniqueFormalParameters, x6: GeneratorBody, parserParams: List[Boolean]) extends GeneratorMethod {
  x1.parent = Some(this)
  x3.parent = Some(this)
  x6.parent = Some(this)
  val name: String = "GeneratorMethod0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    inc(end + 1)
    inc(x3.updateSpan(end))
    inc(end + 1)
    inc(end + 1)
    inc(x6.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("*", x1, "(", x3, ")", "{", x6, "}")
  }
  val k: Int = d(x6, d(x3, d(x1, 0)))
  val fullList: List[(String, Value)] = l("GeneratorBody", x6, l("UniqueFormalParameters", x3, l("PropertyName", x1, Nil))).reverse
  val info: ASTInfo = GeneratorMethod0
}
object GeneratorMethod0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> GeneratorMethod0ComputedPropertyContains0.func,
    "PropName0" -> GeneratorMethod0PropName0.func,
    "PropertyDefinitionEvaluation0" -> GeneratorMethod0PropertyDefinitionEvaluation0.func
  )
}
