package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Block extends AST {
  val kind: String = "Block"
}
case class Block0(x1: Option[StatementList], parserParams: List[Boolean]) extends Block {
  x1.foreach((m) => m.parent = Some(this))
  val name: String = "Block0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k = x1.fold(k)(_.updateSpan(k)) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"{ ${x1.getOrElse("")} }"
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
