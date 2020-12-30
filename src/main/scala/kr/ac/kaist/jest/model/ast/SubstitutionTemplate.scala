package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait SubstitutionTemplate extends AST {
  val kind: String = "SubstitutionTemplate"
}
case class SubstitutionTemplate0(x0: Lexical, x1: Expression, x2: TemplateSpans, parserParams: List[Boolean]) extends SubstitutionTemplate {
  x0.parent = Some(this)
  x1.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "SubstitutionTemplate0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1, x2)
  }
  val k: Int = d(x2, d(x1, d(x0, 0)))
  val fullList: List[(String, Value)] = l("TemplateSpans", x2, l("Expression", x1, l("Lexical", x0, Nil))).reverse
  val info: ASTInfo = SubstitutionTemplate0
}
object SubstitutionTemplate0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArgumentListEvaluation0" -> SubstitutionTemplate0ArgumentListEvaluation0.func,
    "Evaluation0" -> SubstitutionTemplate0Evaluation0.func,
    "TemplateStrings0" -> SubstitutionTemplate0TemplateStrings0.func
  )
}
