package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncFunctionBody extends AST {
  val kind: String = "AsyncFunctionBody"
}
case class AsyncFunctionBody0(x0: FunctionBody, parserParams: List[Boolean]) extends AsyncFunctionBody {
  val name: String = "AsyncFunctionBody0"
  override def toString: String = {
    s"$x0"
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
