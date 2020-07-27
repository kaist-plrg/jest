package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncGeneratorBody extends AST {
  val kind: String = "AsyncGeneratorBody"
}
case class AsyncGeneratorBody0(x0: FunctionBody, parserParams: List[Boolean]) extends AsyncGeneratorBody {
  x0.parent = Some(this)
  val name: String = "AsyncGeneratorBody0"
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
  val fullList: List[(String, Value)] = l("FunctionBody", x0, Nil).reverse
  val info: ASTInfo = AsyncGeneratorBody0
}
object AsyncGeneratorBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "EvaluateBody0" -> AsyncGeneratorBody0EvaluateBody0.func
  )
}
