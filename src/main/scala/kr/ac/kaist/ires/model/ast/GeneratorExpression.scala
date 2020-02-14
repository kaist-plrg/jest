package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait GeneratorExpression extends AST {
  val kind: String = "GeneratorExpression"
}
case class GeneratorExpression0(x2: Option[BindingIdentifier], x4: FormalParameters, x7: GeneratorBody, parserParams: List[Boolean]) extends GeneratorExpression {
  val name: String = "GeneratorExpression0"
  override def toString: String = {
    s"function * ${x2.getOrElse("")} ( $x4 ) { $x7 }"
  }
  val k: Int = d(x7, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("GeneratorBody", x7, l("FormalParameters", x4, l("Option[BindingIdentifier]", x2, Nil))).reverse
  val info: ASTInfo = GeneratorExpression0
}
object GeneratorExpression0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "NamedEvaluation0" -> GeneratorExpression0NamedEvaluation0.func,
    "HasName1" -> GeneratorExpression0HasName1.func,
    "Evaluation0" -> GeneratorExpression0Evaluation0.func,
    "Evaluation1" -> GeneratorExpression0Evaluation1.func,
    "HasName0" -> GeneratorExpression0HasName0.func,
    "IsFunctionDefinition1" -> GeneratorExpression0IsFunctionDefinition1.func,
    "Contains1" -> GeneratorExpression0Contains1.func
  )
}
