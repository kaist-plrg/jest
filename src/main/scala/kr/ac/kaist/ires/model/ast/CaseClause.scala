package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CaseClause extends AST {
  val kind: String = "CaseClause"
}
case class CaseClause0(x1: Expression, x3: Option[StatementList], parserParams: List[Boolean]) extends CaseClause {
  val name: String = "CaseClause0"
  override def toString: String = {
    s"case $x1 : ${x3.getOrElse("")}"
  }
  val k: Int = d(x3, d(x1, 0))
  val fullList: List[(String, Value)] = l("Option[StatementList]", x3, l("Expression", x1, Nil)).reverse
  val info: ASTInfo = CaseClause0
}
object CaseClause0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "VarDeclaredNames1" -> CaseClause0VarDeclaredNames1.func,
    "Evaluation1" -> CaseClause0Evaluation1.func,
    "ContainsDuplicateLabels1" -> CaseClause0ContainsDuplicateLabels1.func,
    "Evaluation0" -> CaseClause0Evaluation0.func,
    "ContainsUndefinedContinueTarget1" -> CaseClause0ContainsUndefinedContinueTarget1.func,
    "ContainsUndefinedBreakTarget1" -> CaseClause0ContainsUndefinedBreakTarget1.func,
    "VarScopedDeclarations1" -> CaseClause0VarScopedDeclarations1.func,
    "StatementRules1" -> CaseClause0StatementRules1.func,
    "LexicallyScopedDeclarations1" -> CaseClause0LexicallyScopedDeclarations1.func,
    "LexicallyDeclaredNames1" -> CaseClause0LexicallyDeclaredNames1.func
  )
}
