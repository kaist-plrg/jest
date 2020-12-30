package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait GeneratorBody extends AST {
  val kind: String = "GeneratorBody"
}
case class GeneratorBody0(x0: FunctionBody, parserParams: List[Boolean]) extends GeneratorBody {
  x0.parent = Some(this)
  val name: String = "GeneratorBody0"
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
  val info: ASTInfo = GeneratorBody0
}
object GeneratorBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "EvaluateBody0" -> GeneratorBody0EvaluateBody0.func
  )
}
