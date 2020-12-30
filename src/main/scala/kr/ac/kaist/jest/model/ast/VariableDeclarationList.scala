package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait VariableDeclarationList extends AST {
  val kind: String = "VariableDeclarationList"
}
case class VariableDeclarationList0(x0: VariableDeclaration, parserParams: List[Boolean]) extends VariableDeclarationList {
  x0.parent = Some(this)
  val name: String = "VariableDeclarationList0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
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
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "VariableDeclarationList1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ",", x2)
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
