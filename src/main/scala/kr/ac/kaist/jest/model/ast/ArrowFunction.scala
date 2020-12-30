package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ArrowFunction extends AST {
  val kind: String = "ArrowFunction"
}
case class ArrowFunction0(x0: ArrowParameters, x3: ConciseBody, parserParams: List[Boolean]) extends ArrowFunction {
  x0.parent = Some(this)
  x3.parent = Some(this)
  val name: String = "ArrowFunction0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 2)
    inc(x3.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "=>", x3)
  }
  val k: Int = d(x3, d(x0, 0))
  val fullList: List[(String, Value)] = l("ConciseBody", x3, l("ArrowParameters", x0, Nil)).reverse
  val info: ASTInfo = ArrowFunction0
}
object ArrowFunction0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Contains0" -> ArrowFunction0Contains0.func,
    "Evaluation0" -> ArrowFunction0Evaluation0.func,
    "HasName0" -> ArrowFunction0HasName0.func,
    "NamedEvaluation0" -> ArrowFunction0NamedEvaluation0.func
  )
}
