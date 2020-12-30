package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Script extends AST {
  val kind: String = "Script"
}
case class Script0(x0: Option[ScriptBody], parserParams: List[Boolean]) extends Script {
  x0.foreach((m) => m.parent = Some(this))
  val name: String = "Script0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    x0.map(x => inc(x.updateSpan(end)))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0.getOrElse(""))
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Option[ScriptBody]", x0, Nil).reverse
  val info: ASTInfo = Script0
}
object Script0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> Script0Evaluation0.func,
    "IsStrict1" -> Script0IsStrict1.func,
    "LexicallyDeclaredNames0" -> Script0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> Script0LexicallyScopedDeclarations0.func,
    "VarDeclaredNames0" -> Script0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Script0VarScopedDeclarations0.func
  )
}
