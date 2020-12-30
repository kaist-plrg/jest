package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncGeneratorExpression extends AST {
  val kind: String = "AsyncGeneratorExpression"
}
case class AsyncGeneratorExpression0(x4: Option[BindingIdentifier], x6: FormalParameters, x9: AsyncGeneratorBody, parserParams: List[Boolean]) extends AsyncGeneratorExpression {
  x4.foreach((m) => m.parent = Some(this))
  x6.parent = Some(this)
  x9.parent = Some(this)
  val name: String = "AsyncGeneratorExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(end + 8)
    inc(end + 1)
    x4.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    inc(x6.updateSpan(end))
    inc(end + 1)
    inc(end + 1)
    inc(x9.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("async", "function", "*", x4.getOrElse(""), "(", x6, ")", "{", x9, "}")
  }
  val k: Int = d(x9, d(x6, d(x4, 0)))
  val fullList: List[(String, Value)] = l("AsyncGeneratorBody", x9, l("FormalParameters", x6, l("Option[BindingIdentifier]", x4, Nil))).reverse
  val info: ASTInfo = AsyncGeneratorExpression0
}
object AsyncGeneratorExpression0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Contains1" -> AsyncGeneratorExpression0Contains1.func,
    "Evaluation0" -> AsyncGeneratorExpression0Evaluation0.func,
    "Evaluation1" -> AsyncGeneratorExpression0Evaluation1.func,
    "HasName0" -> AsyncGeneratorExpression0HasName0.func,
    "HasName1" -> AsyncGeneratorExpression0HasName1.func,
    "IsFunctionDefinition1" -> AsyncGeneratorExpression0IsFunctionDefinition1.func,
    "NamedEvaluation0" -> AsyncGeneratorExpression0NamedEvaluation0.func
  )
}
