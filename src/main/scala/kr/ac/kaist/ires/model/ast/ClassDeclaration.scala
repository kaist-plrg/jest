package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ClassDeclaration extends AST {
  val kind: String = "ClassDeclaration"
}
case class ClassDeclaration0(x1: BindingIdentifier, x2: ClassTail, parserParams: List[Boolean]) extends ClassDeclaration {
  x1.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ClassDeclaration0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 6
    k = x1.updateSpan(k) + 1
    k = x2.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"class $x1 $x2"
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("ClassTail", x2, l("BindingIdentifier", x1, Nil)).reverse
  val info: ASTInfo = ClassDeclaration0
}
object ClassDeclaration0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingClassDeclarationEvaluation0" -> ClassDeclaration0BindingClassDeclarationEvaluation0.func,
    "BoundNames0" -> ClassDeclaration0BoundNames0.func,
    "Evaluation0" -> ClassDeclaration0Evaluation0.func,
    "IsConstantDeclaration0" -> ClassDeclaration0IsConstantDeclaration0.func
  )
}
case class ClassDeclaration1(x1: ClassTail, parserParams: List[Boolean]) extends ClassDeclaration {
  x1.parent = Some(this)
  val name: String = "ClassDeclaration1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 6
    k = x1.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"class $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ClassTail", x1, Nil).reverse
  val info: ASTInfo = ClassDeclaration1
}
object ClassDeclaration1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BindingClassDeclarationEvaluation0" -> ClassDeclaration1BindingClassDeclarationEvaluation0.func,
    "BoundNames0" -> ClassDeclaration1BoundNames0.func,
    "IsConstantDeclaration0" -> ClassDeclaration1IsConstantDeclaration0.func
  )
}
