package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ForDeclaration extends AST {
  val kind: String = "ForDeclaration"
}
case class ForDeclaration0(x0: LetOrConst, x1: ForBinding, parserParams: List[Boolean]) extends ForDeclaration {
  val name: String = "ForDeclaration0"
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
    "IsDestructuring0" -> ForDeclaration0IsDestructuring0.func,
    "BindingInstantiation0" -> ForDeclaration0BindingInstantiation0.func,
    "BoundNames0" -> ForDeclaration0BoundNames0.func,
    "BindingInitialization0" -> ForDeclaration0BindingInitialization0.func
  )
}
