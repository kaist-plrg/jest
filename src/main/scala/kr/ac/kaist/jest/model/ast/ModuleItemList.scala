package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ModuleItemList extends AST {
  val kind: String = "ModuleItemList"
}
case class ModuleItemList0(x0: ModuleItem, parserParams: List[Boolean]) extends ModuleItemList {
  x0.parent = Some(this)
  val name: String = "ModuleItemList0"
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
  val fullList: List[(String, Value)] = l("ModuleItem", x0, Nil).reverse
  val info: ASTInfo = ModuleItemList0
}
object ModuleItemList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ModuleItemList1(x0: ModuleItemList, x1: ModuleItem, parserParams: List[Boolean]) extends ModuleItemList {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "ModuleItemList1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("ModuleItem", x1, l("ModuleItemList", x0, Nil)).reverse
  val info: ASTInfo = ModuleItemList1
}
object ModuleItemList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
