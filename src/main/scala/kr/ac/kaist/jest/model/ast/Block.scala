package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Block extends AST {
  val kind: String = "Block"
}
case class Block0(x1: Option[StatementList], parserParams: List[Boolean]) extends Block {
  x1.foreach((m) => m.parent = Some(this))
  val name: String = "Block0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    x1.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("{", x1.getOrElse(""), "}")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Option[StatementList]", x1, Nil).reverse
  val info: ASTInfo = Block0
}
object Block0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> Block0Evaluation0.func,
    "Evaluation1" -> Block0Evaluation1.func,
    "HasCallInTailPosition0" -> Block0HasCallInTailPosition0.func,
    "LexicallyDeclaredNames0" -> Block0LexicallyDeclaredNames0.func,
    "TopLevelLexicallyScopedDeclarations0" -> Block0TopLevelLexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> Block0TopLevelVarDeclaredNames0.func,
    "TopLevelVarScopedDeclarations0" -> Block0TopLevelVarScopedDeclarations0.func,
    "VarDeclaredNames0" -> Block0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Block0VarScopedDeclarations0.func
  )
}
