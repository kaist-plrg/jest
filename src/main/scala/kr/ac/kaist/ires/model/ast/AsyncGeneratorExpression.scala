package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncGeneratorExpression extends AST {
  val kind: String = "AsyncGeneratorExpression"
}
case class AsyncGeneratorExpression0(x4: Option[BindingIdentifier], x6: FormalParameters, x9: AsyncGeneratorBody, parserParams: List[Boolean]) extends AsyncGeneratorExpression {
  x4.foreach((m) => m.parent = Some(this))
  x6.parent = Some(this)
  x9.parent = Some(this)
  val name: String = "AsyncGeneratorExpression0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 6
    k += 9
    k += 2
    k = x4.fold(k)(_.updateSpan(k)) + 1
    k += 2
    k = x6.updateSpan(k) + 1
    k += 2
    k += 2
    k = x9.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"async function * ${x4.getOrElse("")} ( $x6 ) { $x9 }"
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
