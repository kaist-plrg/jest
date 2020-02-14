package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait FunctionStatementList extends AST {
  val kind: String = "FunctionStatementList"
}
case class FunctionStatementList0(x0: Option[StatementList], parserParams: List[Boolean]) extends FunctionStatementList {
  val name: String = "FunctionStatementList0"
  override def toString: String = {
    s"${x0.getOrElse("")}"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Option[StatementList]", x0, Nil).reverse
  val info: ASTInfo = FunctionStatementList0
}
object FunctionStatementList0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "VarScopedDeclarations0" -> FunctionStatementList0VarScopedDeclarations0.func,
    "VarDeclaredNames0" -> FunctionStatementList0VarDeclaredNames0.func,
    "VarDeclaredNames1" -> FunctionStatementList0VarDeclaredNames1.func,
    "StatementRules0" -> FunctionStatementList0StatementRules0.func,
    "VarScopedDeclarations1" -> FunctionStatementList0VarScopedDeclarations1.func,
    "LexicallyDeclaredNames1" -> FunctionStatementList0LexicallyDeclaredNames1.func,
    "LexicallyScopedDeclarations0" -> FunctionStatementList0LexicallyScopedDeclarations0.func,
    "LexicallyScopedDeclarations1" -> FunctionStatementList0LexicallyScopedDeclarations1.func,
    "LexicallyDeclaredNames0" -> FunctionStatementList0LexicallyDeclaredNames0.func,
    "Evaluation0" -> FunctionStatementList0Evaluation0.func
  )
}
