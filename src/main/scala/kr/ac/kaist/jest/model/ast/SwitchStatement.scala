package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait SwitchStatement extends AST {
  val kind: String = "SwitchStatement"
}
case class SwitchStatement0(x2: Expression, x4: CaseBlock, parserParams: List[Boolean]) extends SwitchStatement {
  x2.parent = Some(this)
  x4.parent = Some(this)
  val name: String = "SwitchStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 6)
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 1)
    inc(x4.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("switch", "(", x2, ")", x4)
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("CaseBlock", x4, l("Expression", x2, Nil)).reverse
  val info: ASTInfo = SwitchStatement0
}
object SwitchStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> SwitchStatement0Evaluation0.func,
    "HasCallInTailPosition0" -> SwitchStatement0HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> SwitchStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> SwitchStatement0VarScopedDeclarations0.func
  )
}
