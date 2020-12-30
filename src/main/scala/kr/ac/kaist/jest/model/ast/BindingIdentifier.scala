package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingIdentifier extends AST {
  val kind: String = "BindingIdentifier"
}
case class BindingIdentifier0(x0: Identifier, parserParams: List[Boolean]) extends BindingIdentifier {
  x0.parent = Some(this)
  val name: String = "BindingIdentifier0"
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
  val fullList: List[(String, Value)] = l("Identifier", x0, Nil).reverse
  val info: ASTInfo = BindingIdentifier0
}
object BindingIdentifier0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> BindingIdentifier0BindingInitialization0.func,
    "BoundNames0" -> BindingIdentifier0BoundNames0.func,
    "IteratorBindingInitialization0" -> BindingIdentifier0IteratorBindingInitialization0.func
  )
}
case class BindingIdentifier1(parserParams: List[Boolean]) extends BindingIdentifier {
  val name: String = "BindingIdentifier1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("yield")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = BindingIdentifier1
}
object BindingIdentifier1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> BindingIdentifier1BindingInitialization0.func,
    "BoundNames0" -> BindingIdentifier1BoundNames0.func,
    "IteratorBindingInitialization0" -> BindingIdentifier1IteratorBindingInitialization0.func,
    "StringValue0" -> BindingIdentifier1StringValue0.func
  )
}
case class BindingIdentifier2(parserParams: List[Boolean]) extends BindingIdentifier {
  val name: String = "BindingIdentifier2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("await")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = BindingIdentifier2
}
object BindingIdentifier2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> BindingIdentifier2BindingInitialization0.func,
    "BoundNames0" -> BindingIdentifier2BoundNames0.func,
    "IteratorBindingInitialization0" -> BindingIdentifier2IteratorBindingInitialization0.func,
    "StringValue0" -> BindingIdentifier2StringValue0.func
  )
}
