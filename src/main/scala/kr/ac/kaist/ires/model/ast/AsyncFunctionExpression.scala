package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncFunctionExpression extends AST {
  val kind: String = "AsyncFunctionExpression"
}
case class AsyncFunctionExpression0(x4: FormalParameters, x7: AsyncFunctionBody, parserParams: List[Boolean]) extends AsyncFunctionExpression {
  x4.parent = Some(this)
  x7.parent = Some(this)
  val name: String = "AsyncFunctionExpression0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 6
    k += 9
    k += 2
    k = x4.updateSpan(k) + 1
    k += 2
    k += 2
    k = x7.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"async function ( $x4 ) { $x7 }"
  }
  val k: Int = d(x7, d(x4, 0))
  val fullList: List[(String, Value)] = l("AsyncFunctionBody", x7, l("FormalParameters", x4, Nil)).reverse
  val info: ASTInfo = AsyncFunctionExpression0
}
object AsyncFunctionExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Contains0" -> AsyncFunctionExpression0Contains0.func,
    "Evaluation0" -> AsyncFunctionExpression0Evaluation0.func,
    "HasName0" -> AsyncFunctionExpression0HasName0.func,
    "IsFunctionDefinition0" -> AsyncFunctionExpression0IsFunctionDefinition0.func,
    "NamedEvaluation0" -> AsyncFunctionExpression0NamedEvaluation0.func
  )
}
case class AsyncFunctionExpression1(x3: BindingIdentifier, x5: FormalParameters, x8: AsyncFunctionBody, parserParams: List[Boolean]) extends AsyncFunctionExpression {
  x3.parent = Some(this)
  x5.parent = Some(this)
  x8.parent = Some(this)
  val name: String = "AsyncFunctionExpression1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 6
    k += 9
    k = x3.updateSpan(k) + 1
    k += 2
    k = x5.updateSpan(k) + 1
    k += 2
    k += 2
    k = x8.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"async function $x3 ( $x5 ) { $x8 }"
  }
  val k: Int = d(x8, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("AsyncFunctionBody", x8, l("FormalParameters", x5, l("BindingIdentifier", x3, Nil))).reverse
  val info: ASTInfo = AsyncFunctionExpression1
}
object AsyncFunctionExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Contains0" -> AsyncFunctionExpression1Contains0.func,
    "Evaluation0" -> AsyncFunctionExpression1Evaluation0.func,
    "HasName0" -> AsyncFunctionExpression1HasName0.func,
    "IsFunctionDefinition0" -> AsyncFunctionExpression1IsFunctionDefinition0.func
  )
}
