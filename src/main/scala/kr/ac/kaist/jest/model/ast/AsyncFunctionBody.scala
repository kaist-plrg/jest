package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncFunctionBody extends AST {
  val kind: String = "AsyncFunctionBody"
}
case class AsyncFunctionBody0(x0: FunctionBody, parserParams: List[Boolean]) extends AsyncFunctionBody {
  x0.parent = Some(this)
  val name: String = "AsyncFunctionBody0"
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
  val fullList: List[(String, Value)] = l("FunctionBody", x0, Nil).reverse
  val info: ASTInfo = AsyncFunctionBody0
}
object AsyncFunctionBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "EvaluateBody0" -> AsyncFunctionBody0EvaluateBody0.func
  )
}
