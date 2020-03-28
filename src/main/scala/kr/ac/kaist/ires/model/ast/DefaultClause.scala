package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait DefaultClause extends AST {
  val kind: String = "DefaultClause"
}
case class DefaultClause0(x2: Option[StatementList], parserParams: List[Boolean]) extends DefaultClause {
  val name: String = "DefaultClause0"
  override def toString: String = {
    s"default : ${x2.getOrElse("")}"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("Option[StatementList]", x2, Nil).reverse
  val info: ASTInfo = DefaultClause0
}
object DefaultClause0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels1" -> DefaultClause0ContainsDuplicateLabels1.func,
    "ContainsUndefinedBreakTarget1" -> DefaultClause0ContainsUndefinedBreakTarget1.func,
    "ContainsUndefinedContinueTarget1" -> DefaultClause0ContainsUndefinedContinueTarget1.func,
    "Evaluation0" -> DefaultClause0Evaluation0.func,
    "Evaluation1" -> DefaultClause0Evaluation1.func,
    "LexicallyDeclaredNames1" -> DefaultClause0LexicallyDeclaredNames1.func,
    "LexicallyScopedDeclarations1" -> DefaultClause0LexicallyScopedDeclarations1.func,
    "StatementRules1" -> DefaultClause0StatementRules1.func,
    "VarDeclaredNames1" -> DefaultClause0VarDeclaredNames1.func,
    "VarScopedDeclarations1" -> DefaultClause0VarScopedDeclarations1.func
  )
}
