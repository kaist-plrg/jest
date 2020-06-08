package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncConciseBody extends AST {
  val kind: String = "AsyncConciseBody"
}
case class AsyncConciseBody0(x1: ExpressionBody, parserParams: List[Boolean]) extends AsyncConciseBody {
  x1.parent = Some(this)
  val name: String = "AsyncConciseBody0"
  override def toString: String = {
    s"$x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ExpressionBody", x1, Nil).reverse
  val info: ASTInfo = AsyncConciseBody0
}
object AsyncConciseBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUseStrict0" -> AsyncConciseBody0ContainsUseStrict0.func,
    "EvaluateBody0" -> AsyncConciseBody0EvaluateBody0.func,
    "LexicallyDeclaredNames0" -> AsyncConciseBody0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> AsyncConciseBody0LexicallyScopedDeclarations0.func,
    "VarDeclaredNames0" -> AsyncConciseBody0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> AsyncConciseBody0VarScopedDeclarations0.func
  )
}
case class AsyncConciseBody1(x1: AsyncFunctionBody, parserParams: List[Boolean]) extends AsyncConciseBody {
  x1.parent = Some(this)
  val name: String = "AsyncConciseBody1"
  override def toString: String = {
    s"{ $x1 }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("AsyncFunctionBody", x1, Nil).reverse
  val info: ASTInfo = AsyncConciseBody1
}
object AsyncConciseBody1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
