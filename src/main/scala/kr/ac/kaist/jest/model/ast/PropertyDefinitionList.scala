package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait PropertyDefinitionList extends AST {
  val kind: String = "PropertyDefinitionList"
}
case class PropertyDefinitionList0(x0: PropertyDefinition, parserParams: List[Boolean]) extends PropertyDefinitionList {
  x0.parent = Some(this)
  val name: String = "PropertyDefinitionList0"
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
  val fullList: List[(String, Value)] = l("PropertyDefinition", x0, Nil).reverse
  val info: ASTInfo = PropertyDefinitionList0
}
object PropertyDefinitionList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "PropertyNameList0" -> PropertyDefinitionList0PropertyNameList0.func
  )
}
case class PropertyDefinitionList1(x0: PropertyDefinitionList, x2: PropertyDefinition, parserParams: List[Boolean]) extends PropertyDefinitionList {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "PropertyDefinitionList1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ",", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("PropertyDefinition", x2, l("PropertyDefinitionList", x0, Nil)).reverse
  val info: ASTInfo = PropertyDefinitionList1
}
object PropertyDefinitionList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "PropertyDefinitionEvaluation0" -> PropertyDefinitionList1PropertyDefinitionEvaluation0.func,
    "PropertyNameList0" -> PropertyDefinitionList1PropertyNameList0.func
  )
}
