package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ModuleItem extends AST {
  val kind: String = "ModuleItem"
}
case class ModuleItem0(x0: ImportDeclaration, parserParams: List[Boolean]) extends ModuleItem {
  x0.parent = Some(this)
  val name: String = "ModuleItem0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ImportDeclaration", x0, Nil).reverse
  val info: ASTInfo = ModuleItem0
}
object ModuleItem0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ModuleItem1(x0: ExportDeclaration, parserParams: List[Boolean]) extends ModuleItem {
  x0.parent = Some(this)
  val name: String = "ModuleItem1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ExportDeclaration", x0, Nil).reverse
  val info: ASTInfo = ModuleItem1
}
object ModuleItem1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ModuleItem2(x0: StatementListItem, parserParams: List[Boolean]) extends ModuleItem {
  x0.parent = Some(this)
  val name: String = "ModuleItem2"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("StatementListItem", x0, Nil).reverse
  val info: ASTInfo = ModuleItem2
}
object ModuleItem2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
