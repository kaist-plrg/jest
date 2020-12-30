package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ClassElement extends AST {
  val kind: String = "ClassElement"
}
case class ClassElement0(x0: MethodDefinition, parserParams: List[Boolean]) extends ClassElement {
  x0.parent = Some(this)
  val name: String = "ClassElement0"
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
  val fullList: List[(String, Value)] = l("MethodDefinition", x0, Nil).reverse
  val info: ASTInfo = ClassElement0
}
object ClassElement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsStatic0" -> ClassElement0IsStatic0.func
  )
}
case class ClassElement1(x1: MethodDefinition, parserParams: List[Boolean]) extends ClassElement {
  x1.parent = Some(this)
  val name: String = "ClassElement1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 6)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("static", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("MethodDefinition", x1, Nil).reverse
  val info: ASTInfo = ClassElement1
}
object ClassElement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsStatic0" -> ClassElement1IsStatic0.func
  )
}
case class ClassElement2(parserParams: List[Boolean]) extends ClassElement {
  val name: String = "ClassElement2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(";")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ClassElement2
}
object ClassElement2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> ClassElement2ComputedPropertyContains0.func,
    "IsStatic0" -> ClassElement2IsStatic0.func,
    "PropName0" -> ClassElement2PropName0.func
  )
}
