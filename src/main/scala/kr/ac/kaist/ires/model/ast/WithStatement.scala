package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait WithStatement extends AST {
  val kind: String = "WithStatement"
}
case class WithStatement0(x2: Expression, x4: Statement, parserParams: List[Boolean]) extends WithStatement {
  val name: String = "WithStatement0"
  override def toString: String = {
    s"with ( $x2 ) $x4"
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("Statement", x4, l("Expression", x2, Nil)).reverse
  val info: ASTInfo = WithStatement0
}
object WithStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> WithStatement0ContainsDuplicateLabels0.func,
    "ContainsUndefinedBreakTarget0" -> WithStatement0ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> WithStatement0ContainsUndefinedContinueTarget0.func,
    "Evaluation0" -> WithStatement0Evaluation0.func,
    "StatementRules0" -> WithStatement0StatementRules0.func,
    "VarDeclaredNames0" -> WithStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> WithStatement0VarScopedDeclarations0.func
  )
}
