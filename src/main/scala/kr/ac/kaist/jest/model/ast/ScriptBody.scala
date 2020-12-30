package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ScriptBody extends AST {
  val kind: String = "ScriptBody"
}
case class ScriptBody0(x0: StatementList, parserParams: List[Boolean]) extends ScriptBody {
  x0.parent = Some(this)
  val name: String = "ScriptBody0"
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
  val fullList: List[(String, Value)] = l("StatementList", x0, Nil).reverse
  val info: ASTInfo = ScriptBody0
}
object ScriptBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "LexicallyDeclaredNames0" -> ScriptBody0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> ScriptBody0LexicallyScopedDeclarations0.func,
    "VarDeclaredNames0" -> ScriptBody0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> ScriptBody0VarScopedDeclarations0.func
  )
}
