package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait FunctionStatementList extends AST {
  val kind: String = "FunctionStatementList"
}
case class FunctionStatementList0(x0: Option[StatementList], parserParams: List[Boolean]) extends FunctionStatementList {
  x0.foreach((m) => m.parent = Some(this))
  val name: String = "FunctionStatementList0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    x0.map(x => inc(x.updateSpan(end)))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0.getOrElse(""))
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Option[StatementList]", x0, Nil).reverse
  val info: ASTInfo = FunctionStatementList0
}
object FunctionStatementList0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> FunctionStatementList0Evaluation0.func,
    "HasCallInTailPosition0" -> FunctionStatementList0HasCallInTailPosition0.func,
    "LexicallyDeclaredNames0" -> FunctionStatementList0LexicallyDeclaredNames0.func,
    "LexicallyDeclaredNames1" -> FunctionStatementList0LexicallyDeclaredNames1.func,
    "LexicallyScopedDeclarations0" -> FunctionStatementList0LexicallyScopedDeclarations0.func,
    "LexicallyScopedDeclarations1" -> FunctionStatementList0LexicallyScopedDeclarations1.func,
    "VarDeclaredNames0" -> FunctionStatementList0VarDeclaredNames0.func,
    "VarDeclaredNames1" -> FunctionStatementList0VarDeclaredNames1.func,
    "VarScopedDeclarations0" -> FunctionStatementList0VarScopedDeclarations0.func,
    "VarScopedDeclarations1" -> FunctionStatementList0VarScopedDeclarations1.func
  )
}
