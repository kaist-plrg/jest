package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LexicalBinding extends AST {
  val kind: String = "LexicalBinding"
}
case class LexicalBinding0(x0: BindingIdentifier, x1: Option[Initializer], parserParams: List[Boolean]) extends LexicalBinding {
  val name: String = "LexicalBinding0"
  override def toString: String = {
    s"$x0 ${x1.getOrElse("")}"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Option[Initializer]", x1, l("BindingIdentifier", x0, Nil)).reverse
  val info: ASTInfo = LexicalBinding0
}
object LexicalBinding0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> LexicalBinding0Evaluation0.func,
    "Evaluation1" -> LexicalBinding0Evaluation1.func,
    "BoundNames1" -> LexicalBinding0BoundNames1.func
  )
}
case class LexicalBinding1(x0: BindingPattern, x1: Initializer, parserParams: List[Boolean]) extends LexicalBinding {
  val name: String = "LexicalBinding1"
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Initializer", x1, l("BindingPattern", x0, Nil)).reverse
  val info: ASTInfo = LexicalBinding1
}
object LexicalBinding1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> LexicalBinding1BoundNames0.func,
    "Evaluation0" -> LexicalBinding1Evaluation0.func
  )
}
