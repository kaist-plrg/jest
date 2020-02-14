package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait SwitchStatement extends AST {
  val kind: String = "SwitchStatement"
}
case class SwitchStatement0(x2: Expression, x4: CaseBlock, parserParams: List[Boolean]) extends SwitchStatement {
  val name: String = "SwitchStatement0"
  override def toString: String = {
    s"switch ( $x2 ) $x4"
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("CaseBlock", x4, l("Expression", x2, Nil)).reverse
  val info: ASTInfo = SwitchStatement0
}
object SwitchStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "StatementRules0" -> SwitchStatement0StatementRules0.func,
    "VarDeclaredNames0" -> SwitchStatement0VarDeclaredNames0.func,
    "ContainsUndefinedContinueTarget0" -> SwitchStatement0ContainsUndefinedContinueTarget0.func,
    "VarScopedDeclarations0" -> SwitchStatement0VarScopedDeclarations0.func,
    "ContainsDuplicateLabels0" -> SwitchStatement0ContainsDuplicateLabels0.func,
    "Evaluation0" -> SwitchStatement0Evaluation0.func,
    "ContainsUndefinedBreakTarget0" -> SwitchStatement0ContainsUndefinedBreakTarget0.func
  )
}
