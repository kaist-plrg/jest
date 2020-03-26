package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Block extends AST {
  val kind: String = "Block"
}
case class Block0(x1: Option[StatementList], parserParams: List[Boolean]) extends Block {
  val name: String = "Block0"
  override def toString: String = {
    s"{ ${x1.getOrElse("")} }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Option[StatementList]", x1, Nil).reverse
  val info: ASTInfo = Block0
}
object Block0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "TopLevelLexicallyScopedDeclarations0" -> Block0TopLevelLexicallyScopedDeclarations0.func,
    "TopLevelVarScopedDeclarations0" -> Block0TopLevelVarScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> Block0TopLevelVarDeclaredNames0.func,
    "ContainsDuplicateLabels0" -> Block0ContainsDuplicateLabels0.func,
    "ContainsUndefinedBreakTarget0" -> Block0ContainsUndefinedBreakTarget0.func,
    "StatementRules0" -> Block0StatementRules0.func,
    "VarDeclaredNames0" -> Block0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Block0VarScopedDeclarations0.func,
    "ContainsUndefinedContinueTarget0" -> Block0ContainsUndefinedContinueTarget0.func,
    "Evaluation0" -> Block0Evaluation0.func,
    "LexicallyDeclaredNames0" -> Block0LexicallyDeclaredNames0.func,
    "Evaluation1" -> Block0Evaluation1.func
  )
}
