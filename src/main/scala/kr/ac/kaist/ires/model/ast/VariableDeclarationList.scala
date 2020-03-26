package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait VariableDeclarationList extends AST {
  val kind: String = "VariableDeclarationList"
}
case class VariableDeclarationList0(x0: VariableDeclaration, parserParams: List[Boolean]) extends VariableDeclarationList {
  val name: String = "VariableDeclarationList0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("VariableDeclaration", x0, Nil).reverse
  val info: ASTInfo = VariableDeclarationList0
}
object VariableDeclarationList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "VarScopedDeclarations0" -> VariableDeclarationList0VarScopedDeclarations0.func
  )
}
case class VariableDeclarationList1(x0: VariableDeclarationList, x2: VariableDeclaration, parserParams: List[Boolean]) extends VariableDeclarationList {
  val name: String = "VariableDeclarationList1"
  override def toString: String = {
    s"$x0 , $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("VariableDeclaration", x2, l("VariableDeclarationList", x0, Nil)).reverse
  val info: ASTInfo = VariableDeclarationList1
}
object VariableDeclarationList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> VariableDeclarationList1BoundNames0.func,
    "Evaluation0" -> VariableDeclarationList1Evaluation0.func,
    "VarScopedDeclarations0" -> VariableDeclarationList1VarScopedDeclarations0.func
  )
}
