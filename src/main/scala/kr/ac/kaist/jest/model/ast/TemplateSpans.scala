package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait TemplateSpans extends AST {
  val kind: String = "TemplateSpans"
}
case class TemplateSpans0(x0: Lexical, parserParams: List[Boolean]) extends TemplateSpans {
  x0.parent = Some(this)
  val name: String = "TemplateSpans0"
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
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = TemplateSpans0
}
object TemplateSpans0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> TemplateSpans0Evaluation0.func,
    "SubstitutionEvaluation0" -> TemplateSpans0SubstitutionEvaluation0.func,
    "TemplateStrings0" -> TemplateSpans0TemplateStrings0.func
  )
}
case class TemplateSpans1(x0: TemplateMiddleList, x1: Lexical, parserParams: List[Boolean]) extends TemplateSpans {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "TemplateSpans1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Lexical", x1, l("TemplateMiddleList", x0, Nil)).reverse
  val info: ASTInfo = TemplateSpans1
}
object TemplateSpans1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> TemplateSpans1Evaluation0.func,
    "SubstitutionEvaluation0" -> TemplateSpans1SubstitutionEvaluation0.func,
    "TemplateStrings0" -> TemplateSpans1TemplateStrings0.func
  )
}
