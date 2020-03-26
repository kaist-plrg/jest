package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Catch extends AST {
  val kind: String = "Catch"
}
case class Catch0(x2: CatchParameter, x4: Block, parserParams: List[Boolean]) extends Catch {
  val name: String = "Catch0"
  override def toString: String = {
    s"catch ( $x2 ) $x4"
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("Block", x4, l("CatchParameter", x2, Nil)).reverse
  val info: ASTInfo = Catch0
}
object Catch0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUndefinedBreakTarget0" -> Catch0ContainsUndefinedBreakTarget0.func,
    "CatchClauseEvaluation0" -> Catch0CatchClauseEvaluation0.func,
    "VarDeclaredNames0" -> Catch0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Catch0VarScopedDeclarations0.func,
    "ContainsUndefinedContinueTarget0" -> Catch0ContainsUndefinedContinueTarget0.func,
    "ContainsDuplicateLabels0" -> Catch0ContainsDuplicateLabels0.func,
    "StatementRules0" -> Catch0StatementRules0.func
  )
}
case class Catch1(x1: Block, parserParams: List[Boolean]) extends Catch {
  val name: String = "Catch1"
  override def toString: String = {
    s"catch $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Block", x1, Nil).reverse
  val info: ASTInfo = Catch1
}
object Catch1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "CatchClauseEvaluation0" -> Catch1CatchClauseEvaluation0.func
  )
}
