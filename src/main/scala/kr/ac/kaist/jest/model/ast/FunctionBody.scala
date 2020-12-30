package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait FunctionBody extends AST {
  val kind: String = "FunctionBody"
}
case class FunctionBody0(x0: FunctionStatementList, parserParams: List[Boolean]) extends FunctionBody {
  x0.parent = Some(this)
  val name: String = "FunctionBody0"
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
  val fullList: List[(String, Value)] = l("FunctionStatementList", x0, Nil).reverse
  val info: ASTInfo = FunctionBody0
}
object FunctionBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUseStrict0" -> FunctionBody0ContainsUseStrict0.func,
    "EvaluateBody0" -> FunctionBody0EvaluateBody0.func
  )
}
