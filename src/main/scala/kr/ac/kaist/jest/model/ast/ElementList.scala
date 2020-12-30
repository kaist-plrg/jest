package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ElementList extends AST {
  val kind: String = "ElementList"
}
case class ElementList0(x0: Option[Elision], x1: AssignmentExpression, parserParams: List[Boolean]) extends ElementList {
  x0.foreach((m) => m.parent = Some(this))
  x1.parent = Some(this)
  val name: String = "ElementList0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    x0.map(x => inc(x.updateSpan(end)))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0.getOrElse(""), x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("AssignmentExpression", x1, l("Option[Elision]", x0, Nil)).reverse
  val info: ASTInfo = ElementList0
}
object ElementList0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "ArrayAccumulation1" -> ElementList0ArrayAccumulation1.func
  )
}
case class ElementList1(x0: Option[Elision], x1: SpreadElement, parserParams: List[Boolean]) extends ElementList {
  x0.foreach((m) => m.parent = Some(this))
  x1.parent = Some(this)
  val name: String = "ElementList1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    x0.map(x => inc(x.updateSpan(end)))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0.getOrElse(""), x1)
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("SpreadElement", x1, l("Option[Elision]", x0, Nil)).reverse
  val info: ASTInfo = ElementList1
}
object ElementList1 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "ArrayAccumulation1" -> ElementList1ArrayAccumulation1.func
  )
}
case class ElementList2(x0: ElementList, x2: Option[Elision], x3: AssignmentExpression, parserParams: List[Boolean]) extends ElementList {
  x0.parent = Some(this)
  x2.foreach((m) => m.parent = Some(this))
  x3.parent = Some(this)
  val name: String = "ElementList2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    x2.map(x => inc(x.updateSpan(end)))
    inc(x3.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ",", x2.getOrElse(""), x3)
  }
  val k: Int = d(x3, d(x2, d(x0, 0)))
  val fullList: List[(String, Value)] = l("AssignmentExpression", x3, l("Option[Elision]", x2, l("ElementList", x0, Nil))).reverse
  val info: ASTInfo = ElementList2
}
object ElementList2 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "ArrayAccumulation1" -> ElementList2ArrayAccumulation1.func
  )
}
case class ElementList3(x0: ElementList, x2: Option[Elision], x3: SpreadElement, parserParams: List[Boolean]) extends ElementList {
  x0.parent = Some(this)
  x2.foreach((m) => m.parent = Some(this))
  x3.parent = Some(this)
  val name: String = "ElementList3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    x2.map(x => inc(x.updateSpan(end)))
    inc(x3.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ",", x2.getOrElse(""), x3)
  }
  val k: Int = d(x3, d(x2, d(x0, 0)))
  val fullList: List[(String, Value)] = l("SpreadElement", x3, l("Option[Elision]", x2, l("ElementList", x0, Nil))).reverse
  val info: ASTInfo = ElementList3
}
object ElementList3 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "ArrayAccumulation1" -> ElementList3ArrayAccumulation1.func
  )
}
