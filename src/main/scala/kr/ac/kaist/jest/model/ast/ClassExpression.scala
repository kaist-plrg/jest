package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ClassExpression extends AST {
  val kind: String = "ClassExpression"
}
case class ClassExpression0(x1: Option[BindingIdentifier], x2: ClassTail, parserParams: List[Boolean]) extends ClassExpression {
  x1.foreach((m) => m.parent = Some(this))
  x2.parent = Some(this)
  val name: String = "ClassExpression0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    x1.map(x => inc(x.updateSpan(end)))
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("class", x1.getOrElse(""), x2)
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("ClassTail", x2, l("Option[BindingIdentifier]", x1, Nil)).reverse
  val info: ASTInfo = ClassExpression0
}
object ClassExpression0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Evaluation1" -> ClassExpression0Evaluation1.func,
    "HasName0" -> ClassExpression0HasName0.func,
    "HasName1" -> ClassExpression0HasName1.func,
    "IsFunctionDefinition1" -> ClassExpression0IsFunctionDefinition1.func,
    "NamedEvaluation0" -> ClassExpression0NamedEvaluation0.func
  )
}
