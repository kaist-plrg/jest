package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait FormalParameterList extends AST {
  val kind: String = "FormalParameterList"
}
case class FormalParameterList0(x0: FormalParameter, parserParams: List[Boolean]) extends FormalParameterList {
  x0.parent = Some(this)
  val name: String = "FormalParameterList0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FormalParameter", x0, Nil).reverse
  val info: ASTInfo = FormalParameterList0
}
object FormalParameterList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpectedArgumentCount0" -> FormalParameterList0ExpectedArgumentCount0.func,
    "ExpectedArgumentCount0" -> FormalParameterList0ExpectedArgumentCount0.func
  )
}
case class FormalParameterList1(x0: FormalParameterList, x2: FormalParameter, parserParams: List[Boolean]) extends FormalParameterList {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "FormalParameterList1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k += 2
    k = x2.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0 , $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("FormalParameter", x2, l("FormalParameterList", x0, Nil)).reverse
  val info: ASTInfo = FormalParameterList1
}
object FormalParameterList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> FormalParameterList1BoundNames0.func,
    "ContainsExpression0" -> FormalParameterList1ContainsExpression0.func,
    "ExpectedArgumentCount0" -> FormalParameterList1ExpectedArgumentCount0.func,
    "HasInitializer0" -> FormalParameterList1HasInitializer0.func,
    "IsSimpleParameterList0" -> FormalParameterList1IsSimpleParameterList0.func,
    "IteratorBindingInitialization0" -> FormalParameterList1IteratorBindingInitialization0.func
  )
}
