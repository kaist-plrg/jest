package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait FunctionDeclaration extends AST {
  val kind: String = "FunctionDeclaration"
}
case class FunctionDeclaration0(x1: BindingIdentifier, x3: FormalParameters, x6: FunctionBody, parserParams: List[Boolean]) extends FunctionDeclaration {
  x1.parent = Some(this)
  x3.parent = Some(this)
  x6.parent = Some(this)
  val name: String = "FunctionDeclaration0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 9
    k = x1.updateSpan(k) + 1
    k += 2
    k = x3.updateSpan(k) + 1
    k += 2
    k += 2
    k = x6.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"function $x1 ( $x3 ) { $x6 }"
  }
  val k: Int = d(x6, d(x3, d(x1, 0)))
  val fullList: List[(String, Value)] = l("FunctionBody", x6, l("FormalParameters", x3, l("BindingIdentifier", x1, Nil))).reverse
  val info: ASTInfo = FunctionDeclaration0
}
object FunctionDeclaration0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> FunctionDeclaration0BoundNames0.func,
    "Contains0" -> FunctionDeclaration0Contains0.func,
    "Evaluation0" -> FunctionDeclaration0Evaluation0.func,
    "InstantiateFunctionObject0" -> FunctionDeclaration0InstantiateFunctionObject0.func,
    "IsConstantDeclaration0" -> FunctionDeclaration0IsConstantDeclaration0.func
  )
}
case class FunctionDeclaration1(x2: FormalParameters, x5: FunctionBody, parserParams: List[Boolean]) extends FunctionDeclaration {
  x2.parent = Some(this)
  x5.parent = Some(this)
  val name: String = "FunctionDeclaration1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 9
    k += 2
    k = x2.updateSpan(k) + 1
    k += 2
    k += 2
    k = x5.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"function ( $x2 ) { $x5 }"
  }
  val k: Int = d(x5, d(x2, 0))
  val fullList: List[(String, Value)] = l("FunctionBody", x5, l("FormalParameters", x2, Nil)).reverse
  val info: ASTInfo = FunctionDeclaration1
}
object FunctionDeclaration1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> FunctionDeclaration1BoundNames0.func,
    "Contains0" -> FunctionDeclaration1Contains0.func,
    "Evaluation0" -> FunctionDeclaration1Evaluation0.func,
    "InstantiateFunctionObject0" -> FunctionDeclaration1InstantiateFunctionObject0.func,
    "IsConstantDeclaration0" -> FunctionDeclaration1IsConstantDeclaration0.func
  )
}
