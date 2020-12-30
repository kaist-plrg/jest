package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CaseClause extends AST {
  val kind: String = "CaseClause"
}
case class CaseClause0(x1: Expression, x3: Option[StatementList], parserParams: List[Boolean]) extends CaseClause {
  x1.parent = Some(this)
  x3.foreach((m) => m.parent = Some(this))
  val name: String = "CaseClause0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 4)
    inc(x1.updateSpan(end))
    inc(end + 1)
    x3.map(x => inc(x.updateSpan(end)))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("case", x1, ":", x3.getOrElse(""))
  }
  val k: Int = d(x3, d(x1, 0))
  val fullList: List[(String, Value)] = l("Option[StatementList]", x3, l("Expression", x1, Nil)).reverse
  val info: ASTInfo = CaseClause0
}
object CaseClause0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> CaseClause0Evaluation0.func,
    "Evaluation1" -> CaseClause0Evaluation1.func,
    "HasCallInTailPosition1" -> CaseClause0HasCallInTailPosition1.func,
    "LexicallyDeclaredNames1" -> CaseClause0LexicallyDeclaredNames1.func,
    "LexicallyScopedDeclarations1" -> CaseClause0LexicallyScopedDeclarations1.func,
    "VarDeclaredNames1" -> CaseClause0VarDeclaredNames1.func,
    "VarScopedDeclarations1" -> CaseClause0VarScopedDeclarations1.func
  )
}
