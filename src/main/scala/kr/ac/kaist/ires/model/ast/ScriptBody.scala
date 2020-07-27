package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ScriptBody extends AST {
  val kind: String = "ScriptBody"
}
case class ScriptBody0(x0: StatementList, parserParams: List[Boolean]) extends ScriptBody {
  x0.parent = Some(this)
  val name: String = "ScriptBody0"
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
