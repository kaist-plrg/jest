package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Statement extends AST {
  val kind: String = "Statement"
}
case class Statement0(x0: BlockStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BlockStatement", x0, Nil).reverse
  val info: ASTInfo = Statement0
}
object Statement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement1(x0: VariableStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("VariableStatement", x0, Nil).reverse
  val info: ASTInfo = Statement1
}
object Statement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> Statement1ContainsDuplicateLabels0.func,
    "StatementRules0" -> Statement1StatementRules0.func,
    "ContainsUndefinedBreakTarget0" -> Statement1ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> Statement1ContainsUndefinedContinueTarget0.func
  )
}
case class Statement2(x0: EmptyStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement2"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("EmptyStatement", x0, Nil).reverse
  val info: ASTInfo = Statement2
}
object Statement2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> Statement2ContainsDuplicateLabels0.func,
    "VarScopedDeclarations0" -> Statement2VarScopedDeclarations0.func,
    "StatementRules0" -> Statement2StatementRules0.func,
    "VarDeclaredNames0" -> Statement2VarDeclaredNames0.func,
    "ContainsUndefinedBreakTarget0" -> Statement2ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> Statement2ContainsUndefinedContinueTarget0.func
  )
}
case class Statement3(x0: ExpressionStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement3"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ExpressionStatement", x0, Nil).reverse
  val info: ASTInfo = Statement3
}
object Statement3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> Statement3ContainsDuplicateLabels0.func,
    "ContainsUndefinedBreakTarget0" -> Statement3ContainsUndefinedBreakTarget0.func,
    "VarScopedDeclarations0" -> Statement3VarScopedDeclarations0.func,
    "StatementRules0" -> Statement3StatementRules0.func,
    "VarDeclaredNames0" -> Statement3VarDeclaredNames0.func,
    "ContainsUndefinedContinueTarget0" -> Statement3ContainsUndefinedContinueTarget0.func
  )
}
case class Statement4(x0: IfStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement4"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("IfStatement", x0, Nil).reverse
  val info: ASTInfo = Statement4
}
object Statement4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement5(x0: BreakableStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement5"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BreakableStatement", x0, Nil).reverse
  val info: ASTInfo = Statement5
}
object Statement5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement6(x0: ContinueStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement6"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ContinueStatement", x0, Nil).reverse
  val info: ASTInfo = Statement6
}
object Statement6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> Statement6ContainsDuplicateLabels0.func,
    "VarScopedDeclarations0" -> Statement6VarScopedDeclarations0.func,
    "VarDeclaredNames0" -> Statement6VarDeclaredNames0.func,
    "ContainsUndefinedBreakTarget0" -> Statement6ContainsUndefinedBreakTarget0.func,
    "StatementRules0" -> Statement6StatementRules0.func
  )
}
case class Statement7(x0: BreakStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement7"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BreakStatement", x0, Nil).reverse
  val info: ASTInfo = Statement7
}
object Statement7 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "VarDeclaredNames0" -> Statement7VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Statement7VarScopedDeclarations0.func,
    "ContainsDuplicateLabels0" -> Statement7ContainsDuplicateLabels0.func,
    "StatementRules0" -> Statement7StatementRules0.func,
    "ContainsUndefinedContinueTarget0" -> Statement7ContainsUndefinedContinueTarget0.func
  )
}
case class Statement8(x0: ReturnStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement8"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ReturnStatement", x0, Nil).reverse
  val info: ASTInfo = Statement8
}
object Statement8 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "VarScopedDeclarations0" -> Statement8VarScopedDeclarations0.func,
    "VarDeclaredNames0" -> Statement8VarDeclaredNames0.func,
    "ContainsUndefinedContinueTarget0" -> Statement8ContainsUndefinedContinueTarget0.func,
    "ContainsUndefinedBreakTarget0" -> Statement8ContainsUndefinedBreakTarget0.func,
    "ContainsDuplicateLabels0" -> Statement8ContainsDuplicateLabels0.func
  )
}
case class Statement9(x0: WithStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement9"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("WithStatement", x0, Nil).reverse
  val info: ASTInfo = Statement9
}
object Statement9 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement10(x0: LabelledStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement10"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("LabelledStatement", x0, Nil).reverse
  val info: ASTInfo = Statement10
}
object Statement10 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement11(x0: ThrowStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement11"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ThrowStatement", x0, Nil).reverse
  val info: ASTInfo = Statement11
}
object Statement11 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> Statement11ContainsDuplicateLabels0.func,
    "VarScopedDeclarations0" -> Statement11VarScopedDeclarations0.func,
    "VarDeclaredNames0" -> Statement11VarDeclaredNames0.func,
    "StatementRules0" -> Statement11StatementRules0.func,
    "ContainsUndefinedContinueTarget0" -> Statement11ContainsUndefinedContinueTarget0.func,
    "ContainsUndefinedBreakTarget0" -> Statement11ContainsUndefinedBreakTarget0.func
  )
}
case class Statement12(x0: TryStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement12"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("TryStatement", x0, Nil).reverse
  val info: ASTInfo = Statement12
}
object Statement12 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Statement13(x0: DebuggerStatement, parserParams: List[Boolean]) extends Statement {
  val name: String = "Statement13"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("DebuggerStatement", x0, Nil).reverse
  val info: ASTInfo = Statement13
}
object Statement13 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "StatementRules0" -> Statement13StatementRules0.func,
    "VarScopedDeclarations0" -> Statement13VarScopedDeclarations0.func,
    "ContainsDuplicateLabels0" -> Statement13ContainsDuplicateLabels0.func,
    "VarDeclaredNames0" -> Statement13VarDeclaredNames0.func,
    "ContainsUndefinedBreakTarget0" -> Statement13ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> Statement13ContainsUndefinedContinueTarget0.func
  )
}
