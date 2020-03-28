package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait VariableDeclaration extends AST {
  val kind: String = "VariableDeclaration"
}
case class VariableDeclaration0(x0: BindingIdentifier, x1: Option[Initializer], parserParams: List[Boolean]) extends VariableDeclaration {
  val name: String = "VariableDeclaration0"
  override def toString: String = {
    s"$x0 ${x1.getOrElse("")}"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Option[Initializer]", x1, l("BindingIdentifier", x0, Nil)).reverse
  val info: ASTInfo = VariableDeclaration0
}
object VariableDeclaration0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "BoundNames1" -> VariableDeclaration0BoundNames1.func,
    "Evaluation0" -> VariableDeclaration0Evaluation0.func,
    "Evaluation1" -> VariableDeclaration0Evaluation1.func
  )
}
case class VariableDeclaration1(x0: BindingPattern, x1: Initializer, parserParams: List[Boolean]) extends VariableDeclaration {
  val name: String = "VariableDeclaration1"
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Initializer", x1, l("BindingPattern", x0, Nil)).reverse
  val info: ASTInfo = VariableDeclaration1
}
object VariableDeclaration1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> VariableDeclaration1BoundNames0.func,
    "Evaluation0" -> VariableDeclaration1Evaluation0.func
  )
}
