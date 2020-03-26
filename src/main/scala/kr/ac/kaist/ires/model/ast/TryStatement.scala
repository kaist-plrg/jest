package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait TryStatement extends AST {
  val kind: String = "TryStatement"
}
case class TryStatement0(x1: Block, x2: Catch, parserParams: List[Boolean]) extends TryStatement {
  val name: String = "TryStatement0"
  override def toString: String = {
    s"try $x1 $x2"
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("Catch", x2, l("Block", x1, Nil)).reverse
  val info: ASTInfo = TryStatement0
}
object TryStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "StatementRules0" -> TryStatement0StatementRules0.func,
    "ContainsUndefinedBreakTarget0" -> TryStatement0ContainsUndefinedBreakTarget0.func,
    "ContainsDuplicateLabels0" -> TryStatement0ContainsDuplicateLabels0.func,
    "ContainsUndefinedContinueTarget0" -> TryStatement0ContainsUndefinedContinueTarget0.func,
    "VarDeclaredNames0" -> TryStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> TryStatement0VarScopedDeclarations0.func,
    "Evaluation0" -> TryStatement0Evaluation0.func
  )
}
case class TryStatement1(x1: Block, x2: Finally, parserParams: List[Boolean]) extends TryStatement {
  val name: String = "TryStatement1"
  override def toString: String = {
    s"try $x1 $x2"
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("Finally", x2, l("Block", x1, Nil)).reverse
  val info: ASTInfo = TryStatement1
}
object TryStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUndefinedContinueTarget0" -> TryStatement1ContainsUndefinedContinueTarget0.func,
    "VarDeclaredNames0" -> TryStatement1VarDeclaredNames0.func,
    "ContainsDuplicateLabels0" -> TryStatement1ContainsDuplicateLabels0.func,
    "VarScopedDeclarations0" -> TryStatement1VarScopedDeclarations0.func,
    "StatementRules0" -> TryStatement1StatementRules0.func,
    "Evaluation0" -> TryStatement1Evaluation0.func,
    "ContainsUndefinedBreakTarget0" -> TryStatement1ContainsUndefinedBreakTarget0.func
  )
}
case class TryStatement2(x1: Block, x2: Catch, x3: Finally, parserParams: List[Boolean]) extends TryStatement {
  val name: String = "TryStatement2"
  override def toString: String = {
    s"try $x1 $x2 $x3"
  }
  val k: Int = d(x3, d(x2, d(x1, 0)))
  val fullList: List[(String, Value)] = l("Finally", x3, l("Catch", x2, l("Block", x1, Nil))).reverse
  val info: ASTInfo = TryStatement2
}
object TryStatement2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "VarScopedDeclarations0" -> TryStatement2VarScopedDeclarations0.func,
    "ContainsUndefinedBreakTarget0" -> TryStatement2ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> TryStatement2ContainsUndefinedContinueTarget0.func,
    "StatementRules0" -> TryStatement2StatementRules0.func,
    "Evaluation0" -> TryStatement2Evaluation0.func,
    "VarDeclaredNames0" -> TryStatement2VarDeclaredNames0.func,
    "ContainsDuplicateLabels0" -> TryStatement2ContainsDuplicateLabels0.func
  )
}
