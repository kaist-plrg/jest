package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait PropertyName extends AST {
  val kind: String = "PropertyName"
}
case class PropertyName0(x0: LiteralPropertyName, parserParams: List[Boolean]) extends PropertyName {
  val name: String = "PropertyName0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("LiteralPropertyName", x0, Nil).reverse
  val info: ASTInfo = PropertyName0
}
object PropertyName0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> PropertyName0ComputedPropertyContains0.func,
    "IsComputedPropertyKey0" -> PropertyName0IsComputedPropertyKey0.func
  )
}
case class PropertyName1(x0: ComputedPropertyName, parserParams: List[Boolean]) extends PropertyName {
  val name: String = "PropertyName1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ComputedPropertyName", x0, Nil).reverse
  val info: ASTInfo = PropertyName1
}
object PropertyName1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> PropertyName1ComputedPropertyContains0.func,
    "IsComputedPropertyKey0" -> PropertyName1IsComputedPropertyKey0.func
  )
}
