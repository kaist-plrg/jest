package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncArrowBindingIdentifier extends AST {
  val kind: String = "AsyncArrowBindingIdentifier"
}
case class AsyncArrowBindingIdentifier0(x0: BindingIdentifier, parserParams: List[Boolean]) extends AsyncArrowBindingIdentifier {
  x0.parent = Some(this)
  val name: String = "AsyncArrowBindingIdentifier0"
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
  val fullList: List[(String, Value)] = l("BindingIdentifier", x0, Nil).reverse
  val info: ASTInfo = AsyncArrowBindingIdentifier0
}
object AsyncArrowBindingIdentifier0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsExpression0" -> AsyncArrowBindingIdentifier0ContainsExpression0.func,
    "ExpectedArgumentCount0" -> AsyncArrowBindingIdentifier0ExpectedArgumentCount0.func,
    "IsSimpleParameterList0" -> AsyncArrowBindingIdentifier0IsSimpleParameterList0.func,
    "IteratorBindingInitialization0" -> AsyncArrowBindingIdentifier0IteratorBindingInitialization0.func
  )
}
