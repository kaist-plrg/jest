package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ArrayBindingPattern extends AST {
  val kind: String = "ArrayBindingPattern"
}
case class ArrayBindingPattern0(x1: Option[Elision], x2: Option[BindingRestElement], parserParams: List[Boolean]) extends ArrayBindingPattern {
  x1.foreach((m) => m.parent = Some(this))
  x2.foreach((m) => m.parent = Some(this))
  val name: String = "ArrayBindingPattern0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k = x1.fold(k)(_.updateSpan(k)) + 1
    k = x2.fold(k)(_.updateSpan(k)) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"[ ${x1.getOrElse("")} ${x2.getOrElse("")} ]"
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("Option[BindingRestElement]", x2, l("Option[Elision]", x1, Nil)).reverse
  val info: ASTInfo = ArrayBindingPattern0
}
object ArrayBindingPattern0 extends ASTInfo {
  val maxK: Int = 3
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> ArrayBindingPattern0BoundNames0.func,
    "BoundNames2" -> ArrayBindingPattern0BoundNames2.func,
    "BoundNames3" -> ArrayBindingPattern0BoundNames3.func,
    "ContainsExpression2" -> ArrayBindingPattern0ContainsExpression2.func,
    "ContainsExpression3" -> ArrayBindingPattern0ContainsExpression3.func,
    "IteratorBindingInitialization0" -> ArrayBindingPattern0IteratorBindingInitialization0.func,
    "IteratorBindingInitialization2" -> ArrayBindingPattern0IteratorBindingInitialization2.func,
    "IteratorBindingInitialization3" -> ArrayBindingPattern0IteratorBindingInitialization3.func
  )
}
case class ArrayBindingPattern1(x1: BindingElementList, parserParams: List[Boolean]) extends ArrayBindingPattern {
  x1.parent = Some(this)
  val name: String = "ArrayBindingPattern1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k = x1.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"[ $x1 ]"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("BindingElementList", x1, Nil).reverse
  val info: ASTInfo = ArrayBindingPattern1
}
object ArrayBindingPattern1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IteratorBindingInitialization0" -> ArrayBindingPattern1IteratorBindingInitialization0.func
  )
}
case class ArrayBindingPattern2(x1: BindingElementList, x3: Option[Elision], x4: Option[BindingRestElement], parserParams: List[Boolean]) extends ArrayBindingPattern {
  x1.parent = Some(this)
  x3.foreach((m) => m.parent = Some(this))
  x4.foreach((m) => m.parent = Some(this))
  val name: String = "ArrayBindingPattern2"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k = x1.updateSpan(k) + 1
    k += 2
    k = x3.fold(k)(_.updateSpan(k)) + 1
    k = x4.fold(k)(_.updateSpan(k)) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"[ $x1 , ${x3.getOrElse("")} ${x4.getOrElse("")} ]"
  }
  val k: Int = d(x4, d(x3, d(x1, 0)))
  val fullList: List[(String, Value)] = l("Option[BindingRestElement]", x4, l("Option[Elision]", x3, l("BindingElementList", x1, Nil))).reverse
  val info: ASTInfo = ArrayBindingPattern2
}
object ArrayBindingPattern2 extends ASTInfo {
  val maxK: Int = 3
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> ArrayBindingPattern2BoundNames0.func,
    "BoundNames2" -> ArrayBindingPattern2BoundNames2.func,
    "BoundNames3" -> ArrayBindingPattern2BoundNames3.func,
    "ContainsExpression2" -> ArrayBindingPattern2ContainsExpression2.func,
    "ContainsExpression3" -> ArrayBindingPattern2ContainsExpression3.func,
    "IteratorBindingInitialization0" -> ArrayBindingPattern2IteratorBindingInitialization0.func,
    "IteratorBindingInitialization2" -> ArrayBindingPattern2IteratorBindingInitialization2.func,
    "IteratorBindingInitialization3" -> ArrayBindingPattern2IteratorBindingInitialization3.func
  )
}
