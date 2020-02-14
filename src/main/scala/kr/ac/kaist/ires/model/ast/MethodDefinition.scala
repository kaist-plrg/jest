package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait MethodDefinition extends AST {
  val kind: String = "MethodDefinition"
}
case class MethodDefinition0(x0: PropertyName, x2: UniqueFormalParameters, x5: FunctionBody, parserParams: List[Boolean]) extends MethodDefinition {
  val name: String = "MethodDefinition0"
  override def toString: String = {
    s"$x0 ( $x2 ) { $x5 }"
  }
  val k: Int = d(x5, d(x2, d(x0, 0)))
  val fullList: List[(String, Value)] = l("FunctionBody", x5, l("UniqueFormalParameters", x2, l("PropertyName", x0, Nil))).reverse
  val info: ASTInfo = MethodDefinition0
}
object MethodDefinition0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "SpecialMethod0" -> MethodDefinition0SpecialMethod0.func,
    "PropertyDefinitionEvaluation0" -> MethodDefinition0PropertyDefinitionEvaluation0.func,
    "HasDirectSuper0" -> MethodDefinition0HasDirectSuper0.func,
    "DefineMethod0" -> MethodDefinition0DefineMethod0.func,
    "ComputedPropertyContains0" -> MethodDefinition0ComputedPropertyContains0.func,
    "PropName0" -> MethodDefinition0PropName0.func
  )
}
case class MethodDefinition1(x0: GeneratorMethod, parserParams: List[Boolean]) extends MethodDefinition {
  val name: String = "MethodDefinition1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("GeneratorMethod", x0, Nil).reverse
  val info: ASTInfo = MethodDefinition1
}
object MethodDefinition1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "SpecialMethod0" -> MethodDefinition1SpecialMethod0.func
  )
}
case class MethodDefinition2(x0: AsyncMethod, parserParams: List[Boolean]) extends MethodDefinition {
  val name: String = "MethodDefinition2"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AsyncMethod", x0, Nil).reverse
  val info: ASTInfo = MethodDefinition2
}
object MethodDefinition2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "SpecialMethod0" -> MethodDefinition2SpecialMethod0.func
  )
}
case class MethodDefinition3(x0: AsyncGeneratorMethod, parserParams: List[Boolean]) extends MethodDefinition {
  val name: String = "MethodDefinition3"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("AsyncGeneratorMethod", x0, Nil).reverse
  val info: ASTInfo = MethodDefinition3
}
object MethodDefinition3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "SpecialMethod0" -> MethodDefinition3SpecialMethod0.func
  )
}
case class MethodDefinition4(x1: PropertyName, x5: FunctionBody, parserParams: List[Boolean]) extends MethodDefinition {
  val name: String = "MethodDefinition4"
  override def toString: String = {
    s"get $x1 ( ) { $x5 }"
  }
  val k: Int = d(x5, d(x1, 0))
  val fullList: List[(String, Value)] = l("FunctionBody", x5, l("PropertyName", x1, Nil)).reverse
  val info: ASTInfo = MethodDefinition4
}
object MethodDefinition4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasDirectSuper0" -> MethodDefinition4HasDirectSuper0.func,
    "ComputedPropertyContains0" -> MethodDefinition4ComputedPropertyContains0.func,
    "PropertyDefinitionEvaluation0" -> MethodDefinition4PropertyDefinitionEvaluation0.func,
    "SpecialMethod0" -> MethodDefinition4SpecialMethod0.func,
    "PropName0" -> MethodDefinition4PropName0.func
  )
}
case class MethodDefinition5(x1: PropertyName, x3: PropertySetParameterList, x6: FunctionBody, parserParams: List[Boolean]) extends MethodDefinition {
  val name: String = "MethodDefinition5"
  override def toString: String = {
    s"set $x1 ( $x3 ) { $x6 }"
  }
  val k: Int = d(x6, d(x3, d(x1, 0)))
  val fullList: List[(String, Value)] = l("FunctionBody", x6, l("PropertySetParameterList", x3, l("PropertyName", x1, Nil))).reverse
  val info: ASTInfo = MethodDefinition5
}
object MethodDefinition5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "PropName0" -> MethodDefinition5PropName0.func,
    "ComputedPropertyContains0" -> MethodDefinition5ComputedPropertyContains0.func,
    "HasDirectSuper0" -> MethodDefinition5HasDirectSuper0.func,
    "SpecialMethod0" -> MethodDefinition5SpecialMethod0.func,
    "PropertyDefinitionEvaluation0" -> MethodDefinition5PropertyDefinitionEvaluation0.func
  )
}
