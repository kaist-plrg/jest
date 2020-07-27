package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncMethod extends AST {
  val kind: String = "AsyncMethod"
}
case class AsyncMethod0(x2: PropertyName, x4: UniqueFormalParameters, x7: AsyncFunctionBody, parserParams: List[Boolean]) extends AsyncMethod {
  x2.parent = Some(this)
  x4.parent = Some(this)
  x7.parent = Some(this)
  val name: String = "AsyncMethod0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 6
    k = x2.updateSpan(k) + 1
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
    s"async $x2 ( $x4 ) { $x7 }"
  }
  val k: Int = d(x7, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("AsyncFunctionBody", x7, l("UniqueFormalParameters", x4, l("PropertyName", x2, Nil))).reverse
  val info: ASTInfo = AsyncMethod0
}
object AsyncMethod0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> AsyncMethod0ComputedPropertyContains0.func,
    "PropName0" -> AsyncMethod0PropName0.func,
    "PropertyDefinitionEvaluation0" -> AsyncMethod0PropertyDefinitionEvaluation0.func
  )
}
