package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait GeneratorExpression extends AST {
  val kind: String = "GeneratorExpression"
}
case class GeneratorExpression0(x2: Option[BindingIdentifier], x4: FormalParameters, x7: GeneratorBody, parserParams: List[Boolean]) extends GeneratorExpression {
  x2.foreach((m) => m.parent = Some(this))
  x4.parent = Some(this)
  x7.parent = Some(this)
  val name: String = "GeneratorExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 8)
    inc(end + 1)
    x2.map(x => inc(x.updateSpan(end)))
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
    s("function", "*", x2.getOrElse(""), "(", x4, ")", "{", x7, "}")
  }
  val k: Int = d(x7, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("GeneratorBody", x7, l("FormalParameters", x4, l("Option[BindingIdentifier]", x2, Nil))).reverse
  val info: ASTInfo = GeneratorExpression0
}
object GeneratorExpression0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Contains1" -> GeneratorExpression0Contains1.func,
    "Evaluation0" -> GeneratorExpression0Evaluation0.func,
    "Evaluation1" -> GeneratorExpression0Evaluation1.func,
    "HasName0" -> GeneratorExpression0HasName0.func,
    "HasName1" -> GeneratorExpression0HasName1.func,
    "IsFunctionDefinition1" -> GeneratorExpression0IsFunctionDefinition1.func,
    "NamedEvaluation0" -> GeneratorExpression0NamedEvaluation0.func
  )
}
