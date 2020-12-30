package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait MethodDefinition extends AST {
  val kind: String = "MethodDefinition"
}
case class MethodDefinition0(x0: PropertyName, x2: UniqueFormalParameters, x5: FunctionBody, parserParams: List[Boolean]) extends MethodDefinition {
  x0.parent = Some(this)
  x2.parent = Some(this)
  x5.parent = Some(this)
  val name: String = "MethodDefinition0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 1)
    inc(end + 1)
    inc(x5.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "(", x2, ")", "{", x5, "}")
  }
  val k: Int = d(x5, d(x2, d(x0, 0)))
  val fullList: List[(String, Value)] = l("FunctionBody", x5, l("UniqueFormalParameters", x2, l("PropertyName", x0, Nil))).reverse
  val info: ASTInfo = MethodDefinition0
}
object MethodDefinition0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> MethodDefinition0ComputedPropertyContains0.func,
    "DefineMethod0" -> MethodDefinition0DefineMethod0.func,
    "PropName0" -> MethodDefinition0PropName0.func,
    "PropertyDefinitionEvaluation0" -> MethodDefinition0PropertyDefinitionEvaluation0.func,
    "SpecialMethod0" -> MethodDefinition0SpecialMethod0.func
  )
}
case class MethodDefinition1(x0: GeneratorMethod, parserParams: List[Boolean]) extends MethodDefinition {
  x0.parent = Some(this)
  val name: String = "MethodDefinition1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
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
  x0.parent = Some(this)
  val name: String = "MethodDefinition2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
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
  x0.parent = Some(this)
  val name: String = "MethodDefinition3"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
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
  x1.parent = Some(this)
  x5.parent = Some(this)
  val name: String = "MethodDefinition4"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    inc(end + 1)
    inc(end + 1)
    inc(end + 1)
    inc(x5.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("get", x1, "(", ")", "{", x5, "}")
  }
  val k: Int = d(x5, d(x1, 0))
  val fullList: List[(String, Value)] = l("FunctionBody", x5, l("PropertyName", x1, Nil)).reverse
  val info: ASTInfo = MethodDefinition4
}
object MethodDefinition4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> MethodDefinition4ComputedPropertyContains0.func,
    "PropName0" -> MethodDefinition4PropName0.func,
    "PropertyDefinitionEvaluation0" -> MethodDefinition4PropertyDefinitionEvaluation0.func,
    "SpecialMethod0" -> MethodDefinition4SpecialMethod0.func
  )
}
case class MethodDefinition5(x1: PropertyName, x3: PropertySetParameterList, x6: FunctionBody, parserParams: List[Boolean]) extends MethodDefinition {
  x1.parent = Some(this)
  x3.parent = Some(this)
  x6.parent = Some(this)
  val name: String = "MethodDefinition5"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    inc(end + 1)
    inc(x3.updateSpan(end))
    inc(end + 1)
    inc(end + 1)
    inc(x6.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("set", x1, "(", x3, ")", "{", x6, "}")
  }
  val k: Int = d(x6, d(x3, d(x1, 0)))
  val fullList: List[(String, Value)] = l("FunctionBody", x6, l("PropertySetParameterList", x3, l("PropertyName", x1, Nil))).reverse
  val info: ASTInfo = MethodDefinition5
}
object MethodDefinition5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ComputedPropertyContains0" -> MethodDefinition5ComputedPropertyContains0.func,
    "PropName0" -> MethodDefinition5PropName0.func,
    "PropertyDefinitionEvaluation0" -> MethodDefinition5PropertyDefinitionEvaluation0.func,
    "SpecialMethod0" -> MethodDefinition5SpecialMethod0.func
  )
}
