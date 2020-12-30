package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait WithStatement extends AST {
  val kind: String = "WithStatement"
}
case class WithStatement0(x2: Expression, x4: Statement, parserParams: List[Boolean]) extends WithStatement {
  x2.parent = Some(this)
  x4.parent = Some(this)
  val name: String = "WithStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 4)
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 1)
    inc(x4.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("with", "(", x2, ")", x4)
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("Statement", x4, l("Expression", x2, Nil)).reverse
  val info: ASTInfo = WithStatement0
}
object WithStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> WithStatement0Evaluation0.func,
    "HasCallInTailPosition0" -> WithStatement0HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> WithStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> WithStatement0VarScopedDeclarations0.func
  )
}
