package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait VariableStatement extends AST {
  val kind: String = "VariableStatement"
}
case class VariableStatement0(x1: VariableDeclarationList, parserParams: List[Boolean]) extends VariableStatement {
  val name: String = "VariableStatement0"
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
    "VarDeclaredNames0" -> VariableStatement0VarDeclaredNames0.func,
    "Evaluation0" -> VariableStatement0Evaluation0.func
  )
}
