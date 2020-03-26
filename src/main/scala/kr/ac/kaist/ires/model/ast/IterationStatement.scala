package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait IterationStatement extends AST {
  val kind: String = "IterationStatement"
}
case class IterationStatement0(x1: Statement, x4: Expression, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement0"
  override def toString: String = {
    s"do $x1 while ( $x4 ) ;"
  }
  val k: Int = d(x4, d(x1, 0))
  val fullList: List[(String, Value)] = l("Expression", x4, l("Statement", x1, Nil)).reverse
  val info: ASTInfo = IterationStatement0
}
object IterationStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> IterationStatement0ContainsDuplicateLabels0.func,
    "ContainsUndefinedBreakTarget0" -> IterationStatement0ContainsUndefinedBreakTarget0.func,
    "StatementRules0" -> IterationStatement0StatementRules0.func,
    "VarScopedDeclarations0" -> IterationStatement0VarScopedDeclarations0.func,
    "VarDeclaredNames0" -> IterationStatement0VarDeclaredNames0.func,
    "LabelledEvaluation0" -> IterationStatement0LabelledEvaluation0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement0ContainsUndefinedContinueTarget0.func
  )
}
case class IterationStatement1(x2: Expression, x4: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement1"
  override def toString: String = {
    s"while ( $x2 ) $x4"
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("Statement", x4, l("Expression", x2, Nil)).reverse
  val info: ASTInfo = IterationStatement1
}
object IterationStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUndefinedBreakTarget0" -> IterationStatement1ContainsUndefinedBreakTarget0.func,
    "VarScopedDeclarations0" -> IterationStatement1VarScopedDeclarations0.func,
    "LabelledEvaluation0" -> IterationStatement1LabelledEvaluation0.func,
    "ContainsDuplicateLabels0" -> IterationStatement1ContainsDuplicateLabels0.func,
    "VarDeclaredNames0" -> IterationStatement1VarDeclaredNames0.func,
    "StatementRules0" -> IterationStatement1StatementRules0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement1ContainsUndefinedContinueTarget0.func
  )
}
case class IterationStatement2(x3: Option[Expression], x5: Option[Expression], x7: Option[Expression], x9: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement2"
  override def toString: String = {
    s"for ( ${x3.getOrElse("")} ; ${x5.getOrElse("")} ; ${x7.getOrElse("")} ) $x9"
  }
  val k: Int = d(x9, d(x7, d(x5, d(x3, 0))))
  val fullList: List[(String, Value)] = l("Statement", x9, l("Option[Expression]2", x7, l("Option[Expression]1", x5, l("Option[Expression]0", x3, Nil)))).reverse
  val info: ASTInfo = IterationStatement2
}
object IterationStatement2 extends ASTInfo {
  val maxK: Int = 7
  val semMap: Map[String, Func] = Map(
    "VarDeclaredNames7" -> IterationStatement2VarDeclaredNames7.func,
    "LabelledEvaluation7" -> IterationStatement2LabelledEvaluation7.func,
    "VarScopedDeclarations7" -> IterationStatement2VarScopedDeclarations7.func
  )
}
case class IterationStatement3(x3: VariableDeclarationList, x5: Option[Expression], x7: Option[Expression], x9: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement3"
  override def toString: String = {
    s"for ( var $x3 ; ${x5.getOrElse("")} ; ${x7.getOrElse("")} ) $x9"
  }
  val k: Int = d(x9, d(x7, d(x5, d(x3, 0))))
  val fullList: List[(String, Value)] = l("Statement", x9, l("Option[Expression]1", x7, l("Option[Expression]0", x5, l("VariableDeclarationList", x3, Nil)))).reverse
  val info: ASTInfo = IterationStatement3
}
object IterationStatement3 extends ASTInfo {
  val maxK: Int = 3
  val semMap: Map[String, Func] = Map(
    "LabelledEvaluation3" -> IterationStatement3LabelledEvaluation3.func,
    "VarScopedDeclarations3" -> IterationStatement3VarScopedDeclarations3.func,
    "VarDeclaredNames3" -> IterationStatement3VarDeclaredNames3.func
  )
}
case class IterationStatement4(x2: LexicalDeclaration, x3: Option[Expression], x5: Option[Expression], x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement4"
  override def toString: String = {
    s"for ( $x2 ${x3.getOrElse("")} ; ${x5.getOrElse("")} ) $x7"
  }
  val k: Int = d(x7, d(x5, d(x3, d(x2, 0))))
  val fullList: List[(String, Value)] = l("Statement", x7, l("Option[Expression]1", x5, l("Option[Expression]0", x3, l("LexicalDeclaration", x2, Nil)))).reverse
  val info: ASTInfo = IterationStatement4
}
object IterationStatement4 extends ASTInfo {
  val maxK: Int = 3
  val semMap: Map[String, Func] = Map(
    "VarScopedDeclarations3" -> IterationStatement4VarScopedDeclarations3.func,
    "VarDeclaredNames3" -> IterationStatement4VarDeclaredNames3.func,
    "LabelledEvaluation3" -> IterationStatement4LabelledEvaluation3.func
  )
}
case class IterationStatement5(x3: LeftHandSideExpression, x5: Expression, x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement5"
  override def toString: String = {
    s"for ( $x3 in $x5 ) $x7"
  }
  val k: Int = d(x7, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("Statement", x7, l("Expression", x5, l("LeftHandSideExpression", x3, Nil))).reverse
  val info: ASTInfo = IterationStatement5
}
object IterationStatement5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "LabelledEvaluation0" -> IterationStatement5LabelledEvaluation0.func,
    "StatementRules0" -> IterationStatement5StatementRules0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement5ContainsUndefinedContinueTarget0.func,
    "ContainsUndefinedBreakTarget0" -> IterationStatement5ContainsUndefinedBreakTarget0.func,
    "VarScopedDeclarations0" -> IterationStatement5VarScopedDeclarations0.func,
    "VarDeclaredNames0" -> IterationStatement5VarDeclaredNames0.func,
    "ContainsDuplicateLabels0" -> IterationStatement5ContainsDuplicateLabels0.func
  )
}
case class IterationStatement6(x3: ForBinding, x5: Expression, x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement6"
  override def toString: String = {
    s"for ( var $x3 in $x5 ) $x7"
  }
  val k: Int = d(x7, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("Statement", x7, l("Expression", x5, l("ForBinding", x3, Nil))).reverse
  val info: ASTInfo = IterationStatement6
}
object IterationStatement6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "VarDeclaredNames0" -> IterationStatement6VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement6VarScopedDeclarations0.func,
    "LabelledEvaluation0" -> IterationStatement6LabelledEvaluation0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement6ContainsUndefinedContinueTarget0.func,
    "ContainsDuplicateLabels0" -> IterationStatement6ContainsDuplicateLabels0.func,
    "ContainsUndefinedBreakTarget0" -> IterationStatement6ContainsUndefinedBreakTarget0.func,
    "StatementRules0" -> IterationStatement6StatementRules0.func
  )
}
case class IterationStatement7(x2: ForDeclaration, x4: Expression, x6: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement7"
  override def toString: String = {
    s"for ( $x2 in $x4 ) $x6"
  }
  val k: Int = d(x6, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("Statement", x6, l("Expression", x4, l("ForDeclaration", x2, Nil))).reverse
  val info: ASTInfo = IterationStatement7
}
object IterationStatement7 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "VarDeclaredNames0" -> IterationStatement7VarDeclaredNames0.func,
    "StatementRules0" -> IterationStatement7StatementRules0.func,
    "ContainsDuplicateLabels0" -> IterationStatement7ContainsDuplicateLabels0.func,
    "VarScopedDeclarations0" -> IterationStatement7VarScopedDeclarations0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement7ContainsUndefinedContinueTarget0.func,
    "LabelledEvaluation0" -> IterationStatement7LabelledEvaluation0.func,
    "ContainsUndefinedBreakTarget0" -> IterationStatement7ContainsUndefinedBreakTarget0.func
  )
}
case class IterationStatement8(x3: LeftHandSideExpression, x5: AssignmentExpression, x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement8"
  override def toString: String = {
    s"for ( $x3 of $x5 ) $x7"
  }
  val k: Int = d(x7, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("Statement", x7, l("AssignmentExpression", x5, l("LeftHandSideExpression", x3, Nil))).reverse
  val info: ASTInfo = IterationStatement8
}
object IterationStatement8 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "VarScopedDeclarations0" -> IterationStatement8VarScopedDeclarations0.func,
    "StatementRules0" -> IterationStatement8StatementRules0.func,
    "LabelledEvaluation0" -> IterationStatement8LabelledEvaluation0.func,
    "ContainsUndefinedBreakTarget0" -> IterationStatement8ContainsUndefinedBreakTarget0.func,
    "VarDeclaredNames0" -> IterationStatement8VarDeclaredNames0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement8ContainsUndefinedContinueTarget0.func,
    "ContainsDuplicateLabels0" -> IterationStatement8ContainsDuplicateLabels0.func
  )
}
case class IterationStatement9(x3: ForBinding, x5: AssignmentExpression, x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement9"
  override def toString: String = {
    s"for ( var $x3 of $x5 ) $x7"
  }
  val k: Int = d(x7, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("Statement", x7, l("AssignmentExpression", x5, l("ForBinding", x3, Nil))).reverse
  val info: ASTInfo = IterationStatement9
}
object IterationStatement9 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUndefinedBreakTarget0" -> IterationStatement9ContainsUndefinedBreakTarget0.func,
    "VarDeclaredNames0" -> IterationStatement9VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement9VarScopedDeclarations0.func,
    "LabelledEvaluation0" -> IterationStatement9LabelledEvaluation0.func,
    "ContainsDuplicateLabels0" -> IterationStatement9ContainsDuplicateLabels0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement9ContainsUndefinedContinueTarget0.func,
    "StatementRules0" -> IterationStatement9StatementRules0.func
  )
}
case class IterationStatement10(x2: ForDeclaration, x4: AssignmentExpression, x6: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement10"
  override def toString: String = {
    s"for ( $x2 of $x4 ) $x6"
  }
  val k: Int = d(x6, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("Statement", x6, l("AssignmentExpression", x4, l("ForDeclaration", x2, Nil))).reverse
  val info: ASTInfo = IterationStatement10
}
object IterationStatement10 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> IterationStatement10ContainsDuplicateLabels0.func,
    "ContainsUndefinedBreakTarget0" -> IterationStatement10ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement10ContainsUndefinedContinueTarget0.func,
    "StatementRules0" -> IterationStatement10StatementRules0.func,
    "VarScopedDeclarations0" -> IterationStatement10VarScopedDeclarations0.func,
    "LabelledEvaluation0" -> IterationStatement10LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement10VarDeclaredNames0.func
  )
}
case class IterationStatement11(x4: LeftHandSideExpression, x6: AssignmentExpression, x8: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement11"
  override def toString: String = {
    s"for await ( $x4 of $x6 ) $x8"
  }
  val k: Int = d(x8, d(x6, d(x4, 0)))
  val fullList: List[(String, Value)] = l("Statement", x8, l("AssignmentExpression", x6, l("LeftHandSideExpression", x4, Nil))).reverse
  val info: ASTInfo = IterationStatement11
}
object IterationStatement11 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "LabelledEvaluation0" -> IterationStatement11LabelledEvaluation0.func,
    "ContainsDuplicateLabels0" -> IterationStatement11ContainsDuplicateLabels0.func,
    "VarScopedDeclarations0" -> IterationStatement11VarScopedDeclarations0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement11ContainsUndefinedContinueTarget0.func,
    "ContainsUndefinedBreakTarget0" -> IterationStatement11ContainsUndefinedBreakTarget0.func,
    "VarDeclaredNames0" -> IterationStatement11VarDeclaredNames0.func
  )
}
case class IterationStatement12(x4: ForBinding, x6: AssignmentExpression, x8: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement12"
  override def toString: String = {
    s"for await ( var $x4 of $x6 ) $x8"
  }
  val k: Int = d(x8, d(x6, d(x4, 0)))
  val fullList: List[(String, Value)] = l("Statement", x8, l("AssignmentExpression", x6, l("ForBinding", x4, Nil))).reverse
  val info: ASTInfo = IterationStatement12
}
object IterationStatement12 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsDuplicateLabels0" -> IterationStatement12ContainsDuplicateLabels0.func,
    "VarDeclaredNames0" -> IterationStatement12VarDeclaredNames0.func,
    "LabelledEvaluation0" -> IterationStatement12LabelledEvaluation0.func,
    "ContainsUndefinedBreakTarget0" -> IterationStatement12ContainsUndefinedBreakTarget0.func,
    "VarScopedDeclarations0" -> IterationStatement12VarScopedDeclarations0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement12ContainsUndefinedContinueTarget0.func
  )
}
case class IterationStatement13(x3: ForDeclaration, x5: AssignmentExpression, x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  val name: String = "IterationStatement13"
  override def toString: String = {
    s"for await ( $x3 of $x5 ) $x7"
  }
  val k: Int = d(x7, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("Statement", x7, l("AssignmentExpression", x5, l("ForDeclaration", x3, Nil))).reverse
  val info: ASTInfo = IterationStatement13
}
object IterationStatement13 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "LabelledEvaluation0" -> IterationStatement13LabelledEvaluation0.func,
    "ContainsUndefinedContinueTarget0" -> IterationStatement13ContainsUndefinedContinueTarget0.func,
    "VarDeclaredNames0" -> IterationStatement13VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement13VarScopedDeclarations0.func,
    "ContainsUndefinedBreakTarget0" -> IterationStatement13ContainsUndefinedBreakTarget0.func,
    "ContainsDuplicateLabels0" -> IterationStatement13ContainsDuplicateLabels0.func
  )
}
