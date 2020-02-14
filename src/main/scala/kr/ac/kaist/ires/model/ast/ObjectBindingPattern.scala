package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ObjectBindingPattern extends AST {
  val kind: String = "ObjectBindingPattern"
}
case class ObjectBindingPattern0(parserParams: List[Boolean]) extends ObjectBindingPattern {
  val name: String = "ObjectBindingPattern0"
  override def toString: String = {
    s"{ }"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ObjectBindingPattern0
}
object ObjectBindingPattern0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsExpression0" -> ObjectBindingPattern0ContainsExpression0.func,
    "BoundNames0" -> ObjectBindingPattern0BoundNames0.func,
    "BindingInitialization0" -> ObjectBindingPattern0BindingInitialization0.func
  )
}
case class ObjectBindingPattern1(x1: BindingRestProperty, parserParams: List[Boolean]) extends ObjectBindingPattern {
  val name: String = "ObjectBindingPattern1"
  override def toString: String = {
    s"{ $x1 }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("BindingRestProperty", x1, Nil).reverse
  val info: ASTInfo = ObjectBindingPattern1
}
object ObjectBindingPattern1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> ObjectBindingPattern1BindingInitialization0.func
  )
}
case class ObjectBindingPattern2(x1: BindingPropertyList, parserParams: List[Boolean]) extends ObjectBindingPattern {
  val name: String = "ObjectBindingPattern2"
  override def toString: String = {
    s"{ $x1 }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("BindingPropertyList", x1, Nil).reverse
  val info: ASTInfo = ObjectBindingPattern2
}
object ObjectBindingPattern2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> ObjectBindingPattern2BindingInitialization0.func
  )
}
case class ObjectBindingPattern3(x1: BindingPropertyList, x3: Option[BindingRestProperty], parserParams: List[Boolean]) extends ObjectBindingPattern {
  val name: String = "ObjectBindingPattern3"
  override def toString: String = {
    s"{ $x1 , ${x3.getOrElse("")} }"
  }
  val k: Int = d(x3, d(x1, 0))
  val fullList: List[(String, Value)] = l("Option[BindingRestProperty]", x3, l("BindingPropertyList", x1, Nil)).reverse
  val info: ASTInfo = ObjectBindingPattern3
}
object ObjectBindingPattern3 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> ObjectBindingPattern3BindingInitialization0.func,
    "BindingInitialization1" -> ObjectBindingPattern3BindingInitialization1.func,
    "BoundNames0" -> ObjectBindingPattern3BoundNames0.func,
    "BoundNames1" -> ObjectBindingPattern3BoundNames1.func
  )
}
