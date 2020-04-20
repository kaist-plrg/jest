package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncGeneratorMethod extends AST {
  val kind: String = "AsyncGeneratorMethod"
}
case class AsyncGeneratorMethod0(x3: PropertyName, x5: UniqueFormalParameters, x8: AsyncGeneratorBody, parserParams: List[Boolean]) extends AsyncGeneratorMethod {
  x3.parent = Some(this)
  x5.parent = Some(this)
  x8.parent = Some(this)
  val name: String = "AsyncGeneratorMethod0"
  override def toString: String = {
    s"async * $x3 ( $x5 ) { $x8 }"
  }
  val k: Int = d(x8, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("AsyncGeneratorBody", x8, l("UniqueFormalParameters", x5, l("PropertyName", x3, Nil))).reverse
  val info: ASTInfo = AsyncGeneratorMethod0
}
object AsyncGeneratorMethod0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> AsyncGeneratorMethod0ComputedPropertyContains0.func,
    "HasDirectSuper0" -> AsyncGeneratorMethod0HasDirectSuper0.func,
    "PropName0" -> AsyncGeneratorMethod0PropName0.func,
    "PropertyDefinitionEvaluation0" -> AsyncGeneratorMethod0PropertyDefinitionEvaluation0.func
  )
}
