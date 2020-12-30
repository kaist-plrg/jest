package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait VariableStatement extends AST {
  val kind: String = "VariableStatement"
}
case class VariableStatement0(x1: VariableDeclarationList, parserParams: List[Boolean]) extends VariableStatement {
  x1.parent = Some(this)
  val name: String = "VariableStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("var", x1, ";")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("VariableDeclarationList", x1, Nil).reverse
  val info: ASTInfo = VariableStatement0
}
object VariableStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> VariableStatement0Evaluation0.func,
    "VarDeclaredNames0" -> VariableStatement0VarDeclaredNames0.func
  )
}
