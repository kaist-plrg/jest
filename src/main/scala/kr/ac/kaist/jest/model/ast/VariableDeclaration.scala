package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait VariableDeclaration extends AST {
  val kind: String = "VariableDeclaration"
}
case class VariableDeclaration0(x0: BindingIdentifier, x1: Option[Initializer], parserParams: List[Boolean]) extends VariableDeclaration {
  x0.parent = Some(this)
  x1.foreach((m) => m.parent = Some(this))
  val name: String = "VariableDeclaration0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    x1.map(x => inc(x.updateSpan(end)))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1.getOrElse(""))
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
  x0.parent = Some(this)
  x1.parent = Some(this)
  val name: String = "VariableDeclaration1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, x1)
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
