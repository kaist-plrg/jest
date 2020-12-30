package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait IterationStatement extends AST {
  val kind: String = "IterationStatement"
}
case class IterationStatement0(x1: Statement, x4: Expression, parserParams: List[Boolean]) extends IterationStatement {
  x1.parent = Some(this)
  x4.parent = Some(this)
  val name: String = "IterationStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 2)
    inc(x1.updateSpan(end))
    inc(end + 5)
    inc(end + 1)
    inc(x4.updateSpan(end))
    inc(end + 1)
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("do", x1, "while", "(", x4, ")", ";")
  }
  val k: Int = d(x4, d(x1, 0))
  val fullList: List[(String, Value)] = l("Expression", x4, l("Statement", x1, Nil)).reverse
  val info: ASTInfo = IterationStatement0
}
object IterationStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement0HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement0LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement0VarScopedDeclarations0.func
  )
}
case class IterationStatement1(x2: Expression, x4: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x2.parent = Some(this)
  x4.parent = Some(this)
  val name: String = "IterationStatement1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 1)
    inc(x4.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("while", "(", x2, ")", x4)
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("Statement", x4, l("Expression", x2, Nil)).reverse
  val info: ASTInfo = IterationStatement1
}
object IterationStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement1HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement1LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement1VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement1VarScopedDeclarations0.func
  )
}
case class IterationStatement2(x3: Option[Expression], x5: Option[Expression], x7: Option[Expression], x9: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x3.foreach((m) => m.parent = Some(this))
  x5.foreach((m) => m.parent = Some(this))
  x7.foreach((m) => m.parent = Some(this))
  x9.parent = Some(this)
  val name: String = "IterationStatement2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 1)
    x3.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    x5.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    x7.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    inc(x9.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "(", x3.getOrElse(""), ";", x5.getOrElse(""), ";", x7.getOrElse(""), ")", x9)
  }
  val k: Int = d(x9, d(x7, d(x5, d(x3, 0))))
  val fullList: List[(String, Value)] = l("Statement", x9, l("Option[Expression]2", x7, l("Option[Expression]1", x5, l("Option[Expression]0", x3, Nil)))).reverse
  val info: ASTInfo = IterationStatement2
}
object IterationStatement2 extends ASTInfo {
  val maxK: Int = 7
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition7" -> IterationStatement2HasCallInTailPosition7.func,
    "LabelledEvaluation7" -> IterationStatement2LabelledEvaluation7.func,
    "VarDeclaredNames7" -> IterationStatement2VarDeclaredNames7.func,
    "VarScopedDeclarations7" -> IterationStatement2VarScopedDeclarations7.func
  )
}
case class IterationStatement3(x3: VariableDeclarationList, x5: Option[Expression], x7: Option[Expression], x9: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x3.parent = Some(this)
  x5.foreach((m) => m.parent = Some(this))
  x7.foreach((m) => m.parent = Some(this))
  x9.parent = Some(this)
  val name: String = "IterationStatement3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 1)
    inc(end + 3)
    inc(x3.updateSpan(end))
    inc(end + 1)
    x5.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    x7.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    inc(x9.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "(", "var", x3, ";", x5.getOrElse(""), ";", x7.getOrElse(""), ")", x9)
  }
  val k: Int = d(x9, d(x7, d(x5, d(x3, 0))))
  val fullList: List[(String, Value)] = l("Statement", x9, l("Option[Expression]1", x7, l("Option[Expression]0", x5, l("VariableDeclarationList", x3, Nil)))).reverse
  val info: ASTInfo = IterationStatement3
}
object IterationStatement3 extends ASTInfo {
  val maxK: Int = 3
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition3" -> IterationStatement3HasCallInTailPosition3.func,
    "LabelledEvaluation3" -> IterationStatement3LabelledEvaluation3.func,
    "VarDeclaredNames3" -> IterationStatement3VarDeclaredNames3.func,
    "VarScopedDeclarations3" -> IterationStatement3VarScopedDeclarations3.func
  )
}
case class IterationStatement4(x2: LexicalDeclaration, x3: Option[Expression], x5: Option[Expression], x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x2.parent = Some(this)
  x3.foreach((m) => m.parent = Some(this))
  x5.foreach((m) => m.parent = Some(this))
  x7.parent = Some(this)
  val name: String = "IterationStatement4"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 1)
    inc(x2.updateSpan(end))
    x3.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    x5.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    inc(x7.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "(", x2, x3.getOrElse(""), ";", x5.getOrElse(""), ")", x7)
  }
  val k: Int = d(x7, d(x5, d(x3, d(x2, 0))))
  val fullList: List[(String, Value)] = l("Statement", x7, l("Option[Expression]1", x5, l("Option[Expression]0", x3, l("LexicalDeclaration", x2, Nil)))).reverse
  val info: ASTInfo = IterationStatement4
}
object IterationStatement4 extends ASTInfo {
  val maxK: Int = 3
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition3" -> IterationStatement4HasCallInTailPosition3.func,
    "LabelledEvaluation3" -> IterationStatement4LabelledEvaluation3.func,
    "VarDeclaredNames3" -> IterationStatement4VarDeclaredNames3.func,
    "VarScopedDeclarations3" -> IterationStatement4VarScopedDeclarations3.func
  )
}
case class IterationStatement5(x3: LeftHandSideExpression, x5: Expression, x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x3.parent = Some(this)
  x5.parent = Some(this)
  x7.parent = Some(this)
  val name: String = "IterationStatement5"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 1)
    inc(x3.updateSpan(end))
    inc(end + 2)
    inc(x5.updateSpan(end))
    inc(end + 1)
    inc(x7.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "(", x3, "in", x5, ")", x7)
  }
  val k: Int = d(x7, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("Statement", x7, l("Expression", x5, l("LeftHandSideExpression", x3, Nil))).reverse
  val info: ASTInfo = IterationStatement5
}
object IterationStatement5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement5HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement5LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement5VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement5VarScopedDeclarations0.func
  )
}
case class IterationStatement6(x3: ForBinding, x5: Expression, x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x3.parent = Some(this)
  x5.parent = Some(this)
  x7.parent = Some(this)
  val name: String = "IterationStatement6"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 1)
    inc(end + 3)
    inc(x3.updateSpan(end))
    inc(end + 2)
    inc(x5.updateSpan(end))
    inc(end + 1)
    inc(x7.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "(", "var", x3, "in", x5, ")", x7)
  }
  val k: Int = d(x7, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("Statement", x7, l("Expression", x5, l("ForBinding", x3, Nil))).reverse
  val info: ASTInfo = IterationStatement6
}
object IterationStatement6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement6HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement6LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement6VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement6VarScopedDeclarations0.func
  )
}
case class IterationStatement7(x2: ForDeclaration, x4: Expression, x6: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x2.parent = Some(this)
  x4.parent = Some(this)
  x6.parent = Some(this)
  val name: String = "IterationStatement7"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 2)
    inc(x4.updateSpan(end))
    inc(end + 1)
    inc(x6.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "(", x2, "in", x4, ")", x6)
  }
  val k: Int = d(x6, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("Statement", x6, l("Expression", x4, l("ForDeclaration", x2, Nil))).reverse
  val info: ASTInfo = IterationStatement7
}
object IterationStatement7 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement7HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement7LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement7VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement7VarScopedDeclarations0.func
  )
}
case class IterationStatement8(x3: LeftHandSideExpression, x5: AssignmentExpression, x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x3.parent = Some(this)
  x5.parent = Some(this)
  x7.parent = Some(this)
  val name: String = "IterationStatement8"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 1)
    inc(x3.updateSpan(end))
    inc(end + 2)
    inc(x5.updateSpan(end))
    inc(end + 1)
    inc(x7.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "(", x3, "of", x5, ")", x7)
  }
  val k: Int = d(x7, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("Statement", x7, l("AssignmentExpression", x5, l("LeftHandSideExpression", x3, Nil))).reverse
  val info: ASTInfo = IterationStatement8
}
object IterationStatement8 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement8HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement8LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement8VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement8VarScopedDeclarations0.func
  )
}
case class IterationStatement9(x3: ForBinding, x5: AssignmentExpression, x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x3.parent = Some(this)
  x5.parent = Some(this)
  x7.parent = Some(this)
  val name: String = "IterationStatement9"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 1)
    inc(end + 3)
    inc(x3.updateSpan(end))
    inc(end + 2)
    inc(x5.updateSpan(end))
    inc(end + 1)
    inc(x7.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "(", "var", x3, "of", x5, ")", x7)
  }
  val k: Int = d(x7, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("Statement", x7, l("AssignmentExpression", x5, l("ForBinding", x3, Nil))).reverse
  val info: ASTInfo = IterationStatement9
}
object IterationStatement9 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement9HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement9LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement9VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement9VarScopedDeclarations0.func
  )
}
case class IterationStatement10(x2: ForDeclaration, x4: AssignmentExpression, x6: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x2.parent = Some(this)
  x4.parent = Some(this)
  x6.parent = Some(this)
  val name: String = "IterationStatement10"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 2)
    inc(x4.updateSpan(end))
    inc(end + 1)
    inc(x6.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "(", x2, "of", x4, ")", x6)
  }
  val k: Int = d(x6, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("Statement", x6, l("AssignmentExpression", x4, l("ForDeclaration", x2, Nil))).reverse
  val info: ASTInfo = IterationStatement10
}
object IterationStatement10 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement10HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement10LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement10VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement10VarScopedDeclarations0.func
  )
}
case class IterationStatement11(x4: LeftHandSideExpression, x6: AssignmentExpression, x8: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x4.parent = Some(this)
  x6.parent = Some(this)
  x8.parent = Some(this)
  val name: String = "IterationStatement11"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 5)
    inc(end + 1)
    inc(x4.updateSpan(end))
    inc(end + 2)
    inc(x6.updateSpan(end))
    inc(end + 1)
    inc(x8.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "await", "(", x4, "of", x6, ")", x8)
  }
  val k: Int = d(x8, d(x6, d(x4, 0)))
  val fullList: List[(String, Value)] = l("Statement", x8, l("AssignmentExpression", x6, l("LeftHandSideExpression", x4, Nil))).reverse
  val info: ASTInfo = IterationStatement11
}
object IterationStatement11 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement11HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement11LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement11VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement11VarScopedDeclarations0.func
  )
}
case class IterationStatement12(x4: ForBinding, x6: AssignmentExpression, x8: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x4.parent = Some(this)
  x6.parent = Some(this)
  x8.parent = Some(this)
  val name: String = "IterationStatement12"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 5)
    inc(end + 1)
    inc(end + 3)
    inc(x4.updateSpan(end))
    inc(end + 2)
    inc(x6.updateSpan(end))
    inc(end + 1)
    inc(x8.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "await", "(", "var", x4, "of", x6, ")", x8)
  }
  val k: Int = d(x8, d(x6, d(x4, 0)))
  val fullList: List[(String, Value)] = l("Statement", x8, l("AssignmentExpression", x6, l("ForBinding", x4, Nil))).reverse
  val info: ASTInfo = IterationStatement12
}
object IterationStatement12 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement12HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement12LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement12VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement12VarScopedDeclarations0.func
  )
}
case class IterationStatement13(x3: ForDeclaration, x5: AssignmentExpression, x7: Statement, parserParams: List[Boolean]) extends IterationStatement {
  x3.parent = Some(this)
  x5.parent = Some(this)
  x7.parent = Some(this)
  val name: String = "IterationStatement13"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(end + 5)
    inc(end + 1)
    inc(x3.updateSpan(end))
    inc(end + 2)
    inc(x5.updateSpan(end))
    inc(end + 1)
    inc(x7.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("for", "await", "(", x3, "of", x5, ")", x7)
  }
  val k: Int = d(x7, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("Statement", x7, l("AssignmentExpression", x5, l("ForDeclaration", x3, Nil))).reverse
  val info: ASTInfo = IterationStatement13
}
object IterationStatement13 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> IterationStatement13HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> IterationStatement13LabelledEvaluation0.func,
    "VarDeclaredNames0" -> IterationStatement13VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IterationStatement13VarScopedDeclarations0.func
  )
}
