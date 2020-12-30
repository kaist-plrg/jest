package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingList extends AST {
  val kind: String = "BindingList"
}
case class BindingList0(x0: LexicalBinding, parserParams: List[Boolean]) extends BindingList {
  x0.parent = Some(this)
  val name: String = "BindingList0"
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
  val fullList: List[(String, Value)] = l("LexicalBinding", x0, Nil).reverse
  val info: ASTInfo = BindingList0
}
object BindingList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class BindingList1(x0: BindingList, x2: LexicalBinding, parserParams: List[Boolean]) extends BindingList {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "BindingList1"
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
  val fullList: List[(String, Value)] = l("LexicalBinding", x2, l("BindingList", x0, Nil)).reverse
  val info: ASTInfo = BindingList1
}
object BindingList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> BindingList1BoundNames0.func,
    "Evaluation0" -> BindingList1Evaluation0.func
  )
}
