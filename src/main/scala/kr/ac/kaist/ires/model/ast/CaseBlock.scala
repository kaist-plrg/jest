package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CaseBlock extends AST {
  val kind: String = "CaseBlock"
}
case class CaseBlock0(x1: Option[CaseClauses], parserParams: List[Boolean]) extends CaseBlock {
  val name: String = "CaseBlock0"
  override def toString: String = {
    s"{ ${x1.getOrElse("")} }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Option[CaseClauses]", x1, Nil).reverse
  val info: ASTInfo = CaseBlock0
}
object CaseBlock0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "CaseBlockEvaluation0" -> CaseBlock0CaseBlockEvaluation0.func,
    "CaseBlockEvaluation1" -> CaseBlock0CaseBlockEvaluation1.func,
    "ContainsDuplicateLabels0" -> CaseBlock0ContainsDuplicateLabels0.func,
    "ContainsUndefinedBreakTarget0" -> CaseBlock0ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> CaseBlock0ContainsUndefinedContinueTarget0.func,
    "LexicallyDeclaredNames0" -> CaseBlock0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> CaseBlock0LexicallyScopedDeclarations0.func,
    "StatementRules0" -> CaseBlock0StatementRules0.func,
    "VarDeclaredNames0" -> CaseBlock0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> CaseBlock0VarScopedDeclarations0.func
  )
}
case class CaseBlock1(x1: Option[CaseClauses], x2: DefaultClause, x3: Option[CaseClauses], parserParams: List[Boolean]) extends CaseBlock {
  val name: String = "CaseBlock1"
  override def toString: String = {
    s"{ ${x1.getOrElse("")} $x2 ${x3.getOrElse("")} }"
  }
  val k: Int = d(x3, d(x2, d(x1, 0)))
  val fullList: List[(String, Value)] = l("Option[CaseClauses]1", x3, l("DefaultClause", x2, l("Option[CaseClauses]0", x1, Nil))).reverse
  val info: ASTInfo = CaseBlock1
}
object CaseBlock1 extends ASTInfo {
  val maxK: Int = 3
  val semMap: Map[String, Func] = Map(
    "CaseBlockEvaluation3" -> CaseBlock1CaseBlockEvaluation3.func,
    "ContainsDuplicateLabels3" -> CaseBlock1ContainsDuplicateLabels3.func,
    "ContainsUndefinedBreakTarget3" -> CaseBlock1ContainsUndefinedBreakTarget3.func,
    "ContainsUndefinedContinueTarget3" -> CaseBlock1ContainsUndefinedContinueTarget3.func,
    "LexicallyDeclaredNames3" -> CaseBlock1LexicallyDeclaredNames3.func,
    "LexicallyScopedDeclarations3" -> CaseBlock1LexicallyScopedDeclarations3.func,
    "StatementRules3" -> CaseBlock1StatementRules3.func,
    "VarDeclaredNames3" -> CaseBlock1VarDeclaredNames3.func,
    "VarScopedDeclarations3" -> CaseBlock1VarScopedDeclarations3.func
  )
}
