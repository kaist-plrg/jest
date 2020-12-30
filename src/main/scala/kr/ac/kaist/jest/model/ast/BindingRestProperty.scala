package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingRestProperty extends AST {
  val kind: String = "BindingRestProperty"
}
case class BindingRestProperty0(x1: BindingIdentifier, parserParams: List[Boolean]) extends BindingRestProperty {
  x1.parent = Some(this)
  val name: String = "BindingRestProperty0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("...", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("BindingIdentifier", x1, Nil).reverse
  val info: ASTInfo = BindingRestProperty0
}
object BindingRestProperty0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "RestBindingInitialization0" -> BindingRestProperty0RestBindingInitialization0.func
  )
}
