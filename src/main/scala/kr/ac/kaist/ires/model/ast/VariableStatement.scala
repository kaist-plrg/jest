package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait VariableStatement extends AST {
  val kind: String = "VariableStatement"
}
case class VariableStatement0(x1: VariableDeclarationList, parserParams: List[Boolean]) extends VariableStatement {
  x1.parent = Some(this)
  val name: String = "VariableStatement0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 4
    k = x1.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"var $x1 ;"
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
