package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait IfStatement extends AST {
  val kind: String = "IfStatement"
}
case class IfStatement0(x2: Expression, x4: Statement, x6: Statement, parserParams: List[Boolean]) extends IfStatement {
  x2.parent = Some(this)
  x4.parent = Some(this)
  x6.parent = Some(this)
  val name: String = "IfStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 2)
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 1)
    inc(x4.updateSpan(end))
    inc(end + 4)
    inc(x6.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("if", "(", x2, ")", x4, "else", x6)
  }
  val k: Int = d(x6, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("Statement1", x6, l("Statement0", x4, l("Expression", x2, Nil))).reverse
  val info: ASTInfo = IfStatement0
}
object IfStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> IfStatement0Evaluation0.func,
    "HasCallInTailPosition0" -> IfStatement0HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> IfStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IfStatement0VarScopedDeclarations0.func
  )
}
case class IfStatement1(x2: Expression, x4: Statement, parserParams: List[Boolean]) extends IfStatement {
  x2.parent = Some(this)
  x4.parent = Some(this)
  val name: String = "IfStatement1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 2)
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 1)
    inc(x4.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("if", "(", x2, ")", x4)
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("Statement", x4, l("Expression", x2, Nil)).reverse
  val info: ASTInfo = IfStatement1
}
object IfStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> IfStatement1Evaluation0.func,
    "HasCallInTailPosition0" -> IfStatement1HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> IfStatement1VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IfStatement1VarScopedDeclarations0.func
  )
}
