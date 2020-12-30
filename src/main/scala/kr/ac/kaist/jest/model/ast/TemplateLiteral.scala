package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait TemplateLiteral extends AST {
  val kind: String = "TemplateLiteral"
}
case class TemplateLiteral0(x0: Lexical, parserParams: List[Boolean]) extends TemplateLiteral {
  x0.parent = Some(this)
  val name: String = "TemplateLiteral0"
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
  val info: ASTInfo = TemplateLiteral0
}
object TemplateLiteral0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArgumentListEvaluation0" -> TemplateLiteral0ArgumentListEvaluation0.func,
    "Evaluation0" -> TemplateLiteral0Evaluation0.func,
    "TemplateStrings0" -> TemplateLiteral0TemplateStrings0.func
  )
}
case class TemplateLiteral1(x0: SubstitutionTemplate, parserParams: List[Boolean]) extends TemplateLiteral {
  x0.parent = Some(this)
  val name: String = "TemplateLiteral1"
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
  val fullList: List[(String, Value)] = l("SubstitutionTemplate", x0, Nil).reverse
  val info: ASTInfo = TemplateLiteral1
}
object TemplateLiteral1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
