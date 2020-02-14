package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LabelledStatement extends AST {
  val kind: String = "LabelledStatement"
}
case class LabelledStatement0(x0: LabelIdentifier, x2: LabelledItem, parserParams: List[Boolean]) extends LabelledStatement {
  val name: String = "LabelledStatement0"
  override def toString: String = {
    s"$x0 : $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("LabelledItem", x2, l("LabelIdentifier", x0, Nil)).reverse
  val info: ASTInfo = LabelledStatement0
}
object LabelledStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> LabelledStatement0ContainsDuplicateLabels0.func,
    "ContainsUndefinedBreakTarget0" -> LabelledStatement0ContainsUndefinedBreakTarget0.func,
    "VarDeclaredNames0" -> LabelledStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> LabelledStatement0VarScopedDeclarations0.func,
    "Evaluation0" -> LabelledStatement0Evaluation0.func,
    "TopLevelVarScopedDeclarations0" -> LabelledStatement0TopLevelVarScopedDeclarations0.func,
    "TopLevelLexicallyScopedDeclarations0" -> LabelledStatement0TopLevelLexicallyScopedDeclarations0.func,
    "TopLevelLexicallyDeclaredNames0" -> LabelledStatement0TopLevelLexicallyDeclaredNames0.func,
    "ContainsUndefinedContinueTarget0" -> LabelledStatement0ContainsUndefinedContinueTarget0.func,
    "LabelledEvaluation0" -> LabelledStatement0LabelledEvaluation0.func,
    "LexicallyDeclaredNames0" -> LabelledStatement0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> LabelledStatement0LexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> LabelledStatement0TopLevelVarDeclaredNames0.func,
    "StatementRules0" -> LabelledStatement0StatementRules0.func
  )
}
