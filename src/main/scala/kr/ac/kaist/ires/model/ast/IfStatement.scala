package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait IfStatement extends AST {
  val kind: String = "IfStatement"
}
case class IfStatement0(x2: Expression, x4: Statement, parserParams: List[Boolean]) extends IfStatement {
  val name: String = "IfStatement0"
  override def toString: String = {
    s"if ( $x2 ) $x4"
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("Statement", x4, l("Expression", x2, Nil)).reverse
  val info: ASTInfo = IfStatement0
}
object IfStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> IfStatement0ContainsDuplicateLabels0.func,
    "ContainsUndefinedBreakTarget0" -> IfStatement0ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> IfStatement0ContainsUndefinedContinueTarget0.func,
    "Evaluation0" -> IfStatement0Evaluation0.func,
    "StatementRules0" -> IfStatement0StatementRules0.func,
    "VarDeclaredNames0" -> IfStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IfStatement0VarScopedDeclarations0.func
  )
}
case class IfStatement1(x2: Expression, x4: Statement, x6: Statement, parserParams: List[Boolean]) extends IfStatement {
  val name: String = "IfStatement1"
  override def toString: String = {
    s"if ( $x2 ) $x4 else $x6"
  }
  val k: Int = d(x6, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("Statement1", x6, l("Statement0", x4, l("Expression", x2, Nil))).reverse
  val info: ASTInfo = IfStatement1
}
object IfStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> IfStatement1ContainsDuplicateLabels0.func,
    "ContainsUndefinedBreakTarget0" -> IfStatement1ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> IfStatement1ContainsUndefinedContinueTarget0.func,
    "Evaluation0" -> IfStatement1Evaluation0.func,
    "StatementRules0" -> IfStatement1StatementRules0.func,
    "VarDeclaredNames0" -> IfStatement1VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IfStatement1VarScopedDeclarations0.func
  )
}
