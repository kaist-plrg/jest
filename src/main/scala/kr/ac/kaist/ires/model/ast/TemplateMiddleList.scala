package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait TemplateMiddleList extends AST {
  val kind: String = "TemplateMiddleList"
}
case class TemplateMiddleList0(x0: Lexical, x1: Expression, parserParams: List[Boolean]) extends TemplateMiddleList {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "TemplateMiddleList0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k = x1.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Expression", x1, l("Lexical", x0, Nil)).reverse
  val info: ASTInfo = TemplateMiddleList0
}
object TemplateMiddleList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> TemplateMiddleList0Evaluation0.func,
    "SubstitutionEvaluation0" -> TemplateMiddleList0SubstitutionEvaluation0.func,
    "TemplateStrings0" -> TemplateMiddleList0TemplateStrings0.func
  )
}
case class TemplateMiddleList1(x0: TemplateMiddleList, x1: Lexical, x2: Expression, parserParams: List[Boolean]) extends TemplateMiddleList {
  x0.parent = Some(this)
  x1.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "TemplateMiddleList1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k = x1.updateSpan(k) + 1
    k = x2.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0 $x1 $x2"
  }
  val k: Int = d(x2, d(x1, d(x0, 0)))
  val fullList: List[(String, Value)] = l("Expression", x2, l("Lexical", x1, l("TemplateMiddleList", x0, Nil))).reverse
  val info: ASTInfo = TemplateMiddleList1
}
object TemplateMiddleList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> TemplateMiddleList1Evaluation0.func,
    "SubstitutionEvaluation0" -> TemplateMiddleList1SubstitutionEvaluation0.func,
    "TemplateStrings0" -> TemplateMiddleList1TemplateStrings0.func
  )
}
