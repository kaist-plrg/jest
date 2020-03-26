package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncArrowFunction extends AST {
  val kind: String = "AsyncArrowFunction"
}
case class AsyncArrowFunction0(x2: AsyncArrowBindingIdentifier, x5: AsyncConciseBody, parserParams: List[Boolean]) extends AsyncArrowFunction {
  val name: String = "AsyncArrowFunction0"
  override def toString: String = {
    s"async $x2 => $x5"
  }
  val k: Int = d(x5, d(x2, 0))
  val fullList: List[(String, Value)] = l("AsyncConciseBody", x5, l("AsyncArrowBindingIdentifier", x2, Nil)).reverse
  val info: ASTInfo = AsyncArrowFunction0
}
object AsyncArrowFunction0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Contains0" -> AsyncArrowFunction0Contains0.func,
    "Evaluation0" -> AsyncArrowFunction0Evaluation0.func,
    "HasName0" -> AsyncArrowFunction0HasName0.func,
    "NamedEvaluation0" -> AsyncArrowFunction0NamedEvaluation0.func
  )
}
case class AsyncArrowFunction1(x0: CoverCallExpressionAndAsyncArrowHead, x3: AsyncConciseBody, parserParams: List[Boolean]) extends AsyncArrowFunction {
  val name: String = "AsyncArrowFunction1"
  override def toString: String = {
    s"$x0 => $x3"
  }
  val k: Int = d(x3, d(x0, 0))
  val fullList: List[(String, Value)] = l("AsyncConciseBody", x3, l("CoverCallExpressionAndAsyncArrowHead", x0, Nil)).reverse
  val info: ASTInfo = AsyncArrowFunction1
}
object AsyncArrowFunction1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "NamedEvaluation0" -> AsyncArrowFunction1NamedEvaluation0.func,
    "Contains0" -> AsyncArrowFunction1Contains0.func,
    "Evaluation0" -> AsyncArrowFunction1Evaluation0.func,
    "HasName0" -> AsyncArrowFunction1HasName0.func
  )
}
