package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LexicalDeclaration extends AST {
  val kind: String = "LexicalDeclaration"
}
case class LexicalDeclaration0(x0: LetOrConst, x1: BindingList, parserParams: List[Boolean]) extends LexicalDeclaration {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "LexicalDeclaration0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1, ";")
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("BindingList", x1, l("LetOrConst", x0, Nil)).reverse
  val info: ASTInfo = LexicalDeclaration0
}
object LexicalDeclaration0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> LexicalDeclaration0BoundNames0.func,
    "Evaluation0" -> LexicalDeclaration0Evaluation0.func,
    "IsConstantDeclaration0" -> LexicalDeclaration0IsConstantDeclaration0.func
  )
}
