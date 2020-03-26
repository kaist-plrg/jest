package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncMethod extends AST {
  val kind: String = "AsyncMethod"
}
case class AsyncMethod0(x2: PropertyName, x4: UniqueFormalParameters, x7: AsyncFunctionBody, parserParams: List[Boolean]) extends AsyncMethod {
  val name: String = "AsyncMethod0"
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
    "HasDirectSuper0" -> AsyncMethod0HasDirectSuper0.func,
    "PropertyDefinitionEvaluation0" -> AsyncMethod0PropertyDefinitionEvaluation0.func
  )
}
