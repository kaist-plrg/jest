package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait SingleNameBinding extends AST {
  val kind: String = "SingleNameBinding"
}
case class SingleNameBinding0(x0: BindingIdentifier, x1: Option[Initializer], parserParams: List[Boolean]) extends SingleNameBinding {
  x0.parent = Some(this)
  x1.foreach((m) => m.parent = Some(this))
  val name: String = "SingleNameBinding0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k = x1.fold(k)(_.updateSpan(k)) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0 ${x1.getOrElse("")}"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Option[Initializer]", x1, l("BindingIdentifier", x0, Nil)).reverse
  val info: ASTInfo = SingleNameBinding0
}
object SingleNameBinding0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "BoundNames1" -> SingleNameBinding0BoundNames1.func,
    "ContainsExpression0" -> SingleNameBinding0ContainsExpression0.func,
    "ContainsExpression1" -> SingleNameBinding0ContainsExpression1.func,
    "HasInitializer0" -> SingleNameBinding0HasInitializer0.func,
    "HasInitializer1" -> SingleNameBinding0HasInitializer1.func,
    "IsSimpleParameterList0" -> SingleNameBinding0IsSimpleParameterList0.func,
    "IsSimpleParameterList1" -> SingleNameBinding0IsSimpleParameterList1.func,
    "IteratorBindingInitialization1" -> SingleNameBinding0IteratorBindingInitialization1.func,
    "KeyedBindingInitialization1" -> SingleNameBinding0KeyedBindingInitialization1.func
  )
}
