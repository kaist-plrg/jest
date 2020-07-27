package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ForDeclaration extends AST {
  val kind: String = "ForDeclaration"
}
case class ForDeclaration0(x0: LetOrConst, x1: ForBinding, parserParams: List[Boolean]) extends ForDeclaration {
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "ForDeclaration0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k = x1.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("ForBinding", x1, l("LetOrConst", x0, Nil)).reverse
  val info: ASTInfo = ForDeclaration0
}
object ForDeclaration0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingInitialization0" -> ForDeclaration0BindingInitialization0.func,
    "BindingInstantiation0" -> ForDeclaration0BindingInstantiation0.func,
    "BoundNames0" -> ForDeclaration0BoundNames0.func,
    "IsDestructuring0" -> ForDeclaration0IsDestructuring0.func
  )
}
