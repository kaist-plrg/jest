package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CaseBlock extends AST {
  val kind: String = "CaseBlock"
}
case class CaseBlock0(x1: Option[CaseClauses], parserParams: List[Boolean]) extends CaseBlock {
  x1.foreach((m) => m.parent = Some(this))
  val name: String = "CaseBlock0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k = x1.fold(k)(_.updateSpan(k)) + 1
    k += 2
    this.end = k - 1
    this.end
  }
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
    "HasCallInTailPosition0" -> CaseBlock0HasCallInTailPosition0.func,
    "LexicallyDeclaredNames0" -> CaseBlock0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> CaseBlock0LexicallyScopedDeclarations0.func,
    "VarDeclaredNames0" -> CaseBlock0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> CaseBlock0VarScopedDeclarations0.func
  )
}
case class CaseBlock1(x1: Option[CaseClauses], x2: DefaultClause, x3: Option[CaseClauses], parserParams: List[Boolean]) extends CaseBlock {
  x1.foreach((m) => m.parent = Some(this))
  x2.parent = Some(this)
  x3.foreach((m) => m.parent = Some(this))
  val name: String = "CaseBlock1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k = x1.fold(k)(_.updateSpan(k)) + 1
    k = x2.updateSpan(k) + 1
    k = x3.fold(k)(_.updateSpan(k)) + 1
    k += 2
    this.end = k - 1
    this.end
  }
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
    "HasCallInTailPosition3" -> CaseBlock1HasCallInTailPosition3.func,
    "LexicallyDeclaredNames3" -> CaseBlock1LexicallyDeclaredNames3.func,
    "LexicallyScopedDeclarations3" -> CaseBlock1LexicallyScopedDeclarations3.func,
    "VarDeclaredNames3" -> CaseBlock1VarDeclaredNames3.func,
    "VarScopedDeclarations3" -> CaseBlock1VarScopedDeclarations3.func
  )
}
