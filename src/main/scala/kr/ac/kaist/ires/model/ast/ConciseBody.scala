package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ConciseBody extends AST {
  val kind: String = "ConciseBody"
}
case class ConciseBody0(x1: AssignmentExpression, parserParams: List[Boolean]) extends ConciseBody {
  val name: String = "ConciseBody0"
  override def toString: String = {
    s"$x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x1, Nil).reverse
  val info: ASTInfo = ConciseBody0
}
object ConciseBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "VarDeclaredNames0" -> ConciseBody0VarDeclaredNames0.func,
    "EvaluateBody0" -> ConciseBody0EvaluateBody0.func,
    "LexicallyScopedDeclarations0" -> ConciseBody0LexicallyScopedDeclarations0.func,
    "StatementRules0" -> ConciseBody0StatementRules0.func,
    "VarScopedDeclarations0" -> ConciseBody0VarScopedDeclarations0.func,
    "ContainsUseStrict0" -> ConciseBody0ContainsUseStrict0.func,
    "LexicallyDeclaredNames0" -> ConciseBody0LexicallyDeclaredNames0.func
  )
}
case class ConciseBody1(x1: FunctionBody, parserParams: List[Boolean]) extends ConciseBody {
  val name: String = "ConciseBody1"
  override def toString: String = {
    s"{ $x1 }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("FunctionBody", x1, Nil).reverse
  val info: ASTInfo = ConciseBody1
}
object ConciseBody1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
