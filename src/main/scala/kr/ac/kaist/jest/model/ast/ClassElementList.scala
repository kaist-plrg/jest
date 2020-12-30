package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ClassElementList extends AST {
  val kind: String = "ClassElementList"
}
case class ClassElementList0(x0: ClassElement, parserParams: List[Boolean]) extends ClassElementList {
  x0.parent = Some(this)
  val name: String = "ClassElementList0"
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
  val fullList: List[(String, Value)] = l("ClassElement", x0, Nil).reverse
  val info: ASTInfo = ClassElementList0
}
object ClassElementList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ConstructorMethod0" -> ClassElementList0ConstructorMethod0.func,
    "NonConstructorMethodDefinitions0" -> ClassElementList0NonConstructorMethodDefinitions0.func,
    "PrototypePropertyNameList0" -> ClassElementList0PrototypePropertyNameList0.func
  )
}
case class ClassElementList1(x0: ClassElementList, x1: ClassElement, parserParams: List[Boolean]) extends ClassElementList {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "ClassElementList1"
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
  val fullList: List[(String, Value)] = l("ClassElement", x1, l("ClassElementList", x0, Nil)).reverse
  val info: ASTInfo = ClassElementList1
}
object ClassElementList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> ClassElementList1ComputedPropertyContains0.func,
    "ConstructorMethod0" -> ClassElementList1ConstructorMethod0.func,
    "NonConstructorMethodDefinitions0" -> ClassElementList1NonConstructorMethodDefinitions0.func,
    "PrototypePropertyNameList0" -> ClassElementList1PrototypePropertyNameList0.func
  )
}
