package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LexicalDeclaration extends AST {
  val kind: String = "LexicalDeclaration"
}
case class LexicalDeclaration0(x0: LetOrConst, x1: BindingList, parserParams: List[Boolean]) extends LexicalDeclaration {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "LexicalDeclaration0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k = x1.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0 $x1 ;"
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
