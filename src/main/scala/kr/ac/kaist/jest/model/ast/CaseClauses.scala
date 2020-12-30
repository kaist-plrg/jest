package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CaseClauses extends AST {
  val kind: String = "CaseClauses"
}
case class CaseClauses0(x0: CaseClause, parserParams: List[Boolean]) extends CaseClauses {
  x0.parent = Some(this)
  val name: String = "CaseClauses0"
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
  val fullList: List[(String, Value)] = l("CaseClause", x0, Nil).reverse
  val info: ASTInfo = CaseClauses0
}
object CaseClauses0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class CaseClauses1(x0: CaseClauses, x1: CaseClause, parserParams: List[Boolean]) extends CaseClauses {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "CaseClauses1"
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
  val fullList: List[(String, Value)] = l("CaseClause", x1, l("CaseClauses", x0, Nil)).reverse
  val info: ASTInfo = CaseClauses1
}
object CaseClauses1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> CaseClauses1HasCallInTailPosition0.func,
    "LexicallyDeclaredNames0" -> CaseClauses1LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> CaseClauses1LexicallyScopedDeclarations0.func,
    "VarDeclaredNames0" -> CaseClauses1VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> CaseClauses1VarScopedDeclarations0.func
  )
}
