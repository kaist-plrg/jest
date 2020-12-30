package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait StatementList extends AST {
  val kind: String = "StatementList"
}
case class StatementList0(x0: StatementListItem, parserParams: List[Boolean]) extends StatementList {
  x0.parent = Some(this)
  val name: String = "StatementList0"
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
  val fullList: List[(String, Value)] = l("StatementListItem", x0, Nil).reverse
  val info: ASTInfo = StatementList0
}
object StatementList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class StatementList1(x0: StatementList, x1: StatementListItem, parserParams: List[Boolean]) extends StatementList {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "StatementList1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("StatementListItem", x1, l("StatementList", x0, Nil)).reverse
  val info: ASTInfo = StatementList1
}
object StatementList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> StatementList1Evaluation0.func,
    "HasCallInTailPosition0" -> StatementList1HasCallInTailPosition0.func,
    "LexicallyDeclaredNames0" -> StatementList1LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> StatementList1LexicallyScopedDeclarations0.func,
    "TopLevelLexicallyDeclaredNames0" -> StatementList1TopLevelLexicallyDeclaredNames0.func,
    "TopLevelLexicallyScopedDeclarations0" -> StatementList1TopLevelLexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> StatementList1TopLevelVarDeclaredNames0.func,
    "TopLevelVarScopedDeclarations0" -> StatementList1TopLevelVarScopedDeclarations0.func,
    "VarDeclaredNames0" -> StatementList1VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> StatementList1VarScopedDeclarations0.func
  )
}
