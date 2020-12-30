package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ConciseBody extends AST {
  val kind: String = "ConciseBody"
}
case class ConciseBody0(x1: ExpressionBody, parserParams: List[Boolean]) extends ConciseBody {
  x1.parent = Some(this)
  val name: String = "ConciseBody0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ExpressionBody", x1, Nil).reverse
  val info: ASTInfo = ConciseBody0
}
object ConciseBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUseStrict0" -> ConciseBody0ContainsUseStrict0.func,
    "EvaluateBody0" -> ConciseBody0EvaluateBody0.func,
    "LexicallyDeclaredNames0" -> ConciseBody0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> ConciseBody0LexicallyScopedDeclarations0.func,
    "VarDeclaredNames0" -> ConciseBody0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> ConciseBody0VarScopedDeclarations0.func
  )
}
case class ConciseBody1(x1: FunctionBody, parserParams: List[Boolean]) extends ConciseBody {
  x1.parent = Some(this)
  val name: String = "ConciseBody1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("{", x1, "}")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("FunctionBody", x1, Nil).reverse
  val info: ASTInfo = ConciseBody1
}
object ConciseBody1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
