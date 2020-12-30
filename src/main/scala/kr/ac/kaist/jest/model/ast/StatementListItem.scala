package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait StatementListItem extends AST {
  val kind: String = "StatementListItem"
}
case class StatementListItem0(x0: Statement, parserParams: List[Boolean]) extends StatementListItem {
  x0.parent = Some(this)
  val name: String = "StatementListItem0"
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
  val fullList: List[(String, Value)] = l("Statement", x0, Nil).reverse
  val info: ASTInfo = StatementListItem0
}
object StatementListItem0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "LexicallyDeclaredNames0" -> StatementListItem0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> StatementListItem0LexicallyScopedDeclarations0.func,
    "TopLevelLexicallyDeclaredNames0" -> StatementListItem0TopLevelLexicallyDeclaredNames0.func,
    "TopLevelLexicallyScopedDeclarations0" -> StatementListItem0TopLevelLexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> StatementListItem0TopLevelVarDeclaredNames0.func,
    "TopLevelVarScopedDeclarations0" -> StatementListItem0TopLevelVarScopedDeclarations0.func
  )
}
case class StatementListItem1(x0: Declaration, parserParams: List[Boolean]) extends StatementListItem {
  x0.parent = Some(this)
  val name: String = "StatementListItem1"
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
  val fullList: List[(String, Value)] = l("Declaration", x0, Nil).reverse
  val info: ASTInfo = StatementListItem1
}
object StatementListItem1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> StatementListItem1HasCallInTailPosition0.func,
    "LexicallyDeclaredNames0" -> StatementListItem1LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> StatementListItem1LexicallyScopedDeclarations0.func,
    "TopLevelLexicallyDeclaredNames0" -> StatementListItem1TopLevelLexicallyDeclaredNames0.func,
    "TopLevelLexicallyScopedDeclarations0" -> StatementListItem1TopLevelLexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> StatementListItem1TopLevelVarDeclaredNames0.func,
    "TopLevelVarScopedDeclarations0" -> StatementListItem1TopLevelVarScopedDeclarations0.func,
    "VarDeclaredNames0" -> StatementListItem1VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> StatementListItem1VarScopedDeclarations0.func
  )
}
