package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ClassElement extends AST {
  val kind: String = "ClassElement"
}
case class ClassElement0(x0: MethodDefinition, parserParams: List[Boolean]) extends ClassElement {
  val name: String = "ClassElement0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("MethodDefinition", x0, Nil).reverse
  val info: ASTInfo = ClassElement0
}
object ClassElement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> ClassElement0ComputedPropertyContains0.func,
    "IsStatic0" -> ClassElement0IsStatic0.func
  )
}
case class ClassElement1(x1: MethodDefinition, parserParams: List[Boolean]) extends ClassElement {
  val name: String = "ClassElement1"
  override def toString: String = {
    s"static $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("MethodDefinition", x1, Nil).reverse
  val info: ASTInfo = ClassElement1
}
object ClassElement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsStatic0" -> ClassElement1IsStatic0.func,
    "ComputedPropertyContains0" -> ClassElement1ComputedPropertyContains0.func
  )
}
case class ClassElement2(parserParams: List[Boolean]) extends ClassElement {
  val name: String = "ClassElement2"
  override def toString: String = {
    s";"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ClassElement2
}
object ClassElement2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsStatic0" -> ClassElement2IsStatic0.func,
    "ComputedPropertyContains0" -> ClassElement2ComputedPropertyContains0.func,
    "PropName0" -> ClassElement2PropName0.func
  )
}
