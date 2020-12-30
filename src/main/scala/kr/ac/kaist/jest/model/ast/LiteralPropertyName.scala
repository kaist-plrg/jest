package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LiteralPropertyName extends AST {
  val kind: String = "LiteralPropertyName"
}
case class LiteralPropertyName0(x0: Lexical, parserParams: List[Boolean]) extends LiteralPropertyName {
  x0.parent = Some(this)
  val name: String = "LiteralPropertyName0"
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
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = LiteralPropertyName0
}
object LiteralPropertyName0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Contains0" -> LiteralPropertyName0Contains0.func,
    "Evaluation0" -> LiteralPropertyName0Evaluation0.func,
    "PropName0" -> LiteralPropertyName0PropName0.func
  )
}
case class LiteralPropertyName1(x0: Lexical, parserParams: List[Boolean]) extends LiteralPropertyName {
  x0.parent = Some(this)
  val name: String = "LiteralPropertyName1"
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
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = LiteralPropertyName1
}
object LiteralPropertyName1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> LiteralPropertyName1Evaluation0.func,
    "PropName0" -> LiteralPropertyName1PropName0.func
  )
}
case class LiteralPropertyName2(x0: Lexical, parserParams: List[Boolean]) extends LiteralPropertyName {
  x0.parent = Some(this)
  val name: String = "LiteralPropertyName2"
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
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = LiteralPropertyName2
}
object LiteralPropertyName2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> LiteralPropertyName2Evaluation0.func,
    "PropName0" -> LiteralPropertyName2PropName0.func
  )
}
