package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ObjectBindingPattern extends AST {
  val kind: String = "ObjectBindingPattern"
}
case class ObjectBindingPattern0(parserParams: List[Boolean]) extends ObjectBindingPattern {
  val name: String = "ObjectBindingPattern0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("{", "}")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ObjectBindingPattern0
}
object ObjectBindingPattern0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> ObjectBindingPattern0BindingInitialization0.func,
    "BoundNames0" -> ObjectBindingPattern0BoundNames0.func,
    "ContainsExpression0" -> ObjectBindingPattern0ContainsExpression0.func
  )
}
case class ObjectBindingPattern1(x1: BindingRestProperty, parserParams: List[Boolean]) extends ObjectBindingPattern {
  x1.parent = Some(this)
  val name: String = "ObjectBindingPattern1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("{", x1, "}")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("BindingRestProperty", x1, Nil).reverse
  val info: ASTInfo = ObjectBindingPattern1
}
object ObjectBindingPattern1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> ObjectBindingPattern1BindingInitialization0.func,
    "ContainsExpression0" -> ObjectBindingPattern1ContainsExpression0.func
  )
}
case class ObjectBindingPattern2(x1: BindingPropertyList, parserParams: List[Boolean]) extends ObjectBindingPattern {
  x1.parent = Some(this)
  val name: String = "ObjectBindingPattern2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("{", x1, "}")
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
  x1.parent = Some(this)
  x3.foreach((m) => m.parent = Some(this))
  val name: String = "ObjectBindingPattern3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    inc(end + 1)
    x3.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("{", x1, ",", x3.getOrElse(""), "}")
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
    "BoundNames1" -> ObjectBindingPattern3BoundNames1.func,
    "BoundNames1" -> ObjectBindingPattern3BoundNames1.func,
    "ContainsExpression1" -> ObjectBindingPattern3ContainsExpression1.func
  )
}
