package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait GeneratorDeclaration extends AST {
  val kind: String = "GeneratorDeclaration"
}
case class GeneratorDeclaration0(x2: BindingIdentifier, x4: FormalParameters, x7: GeneratorBody, parserParams: List[Boolean]) extends GeneratorDeclaration {
  val name: String = "GeneratorDeclaration0"
  override def toString: String = {
    s"function * $x2 ( $x4 ) { $x7 }"
  }
  val k: Int = d(x7, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("GeneratorBody", x7, l("FormalParameters", x4, l("BindingIdentifier", x2, Nil))).reverse
  val info: ASTInfo = GeneratorDeclaration0
}
object GeneratorDeclaration0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> GeneratorDeclaration0BoundNames0.func,
    "Contains0" -> GeneratorDeclaration0Contains0.func,
    "InstantiateFunctionObject0" -> GeneratorDeclaration0InstantiateFunctionObject0.func,
    "IsConstantDeclaration0" -> GeneratorDeclaration0IsConstantDeclaration0.func
  )
}
case class GeneratorDeclaration1(x3: FormalParameters, x6: GeneratorBody, parserParams: List[Boolean]) extends GeneratorDeclaration {
  val name: String = "GeneratorDeclaration1"
  override def toString: String = {
    s"function * ( $x3 ) { $x6 }"
  }
  val k: Int = d(x6, d(x3, 0))
  val fullList: List[(String, Value)] = l("GeneratorBody", x6, l("FormalParameters", x3, Nil)).reverse
  val info: ASTInfo = GeneratorDeclaration1
}
object GeneratorDeclaration1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> GeneratorDeclaration1BoundNames0.func,
    "Contains0" -> GeneratorDeclaration1Contains0.func,
    "InstantiateFunctionObject0" -> GeneratorDeclaration1InstantiateFunctionObject0.func,
    "IsConstantDeclaration0" -> GeneratorDeclaration1IsConstantDeclaration0.func
  )
}
