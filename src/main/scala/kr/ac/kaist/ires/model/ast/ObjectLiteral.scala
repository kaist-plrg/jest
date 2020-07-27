package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ObjectLiteral extends AST {
  val kind: String = "ObjectLiteral"
}
case class ObjectLiteral0(parserParams: List[Boolean]) extends ObjectLiteral {
  val name: String = "ObjectLiteral0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"{ }"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ObjectLiteral0
}
object ObjectLiteral0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ObjectLiteral0Evaluation0.func
  )
}
case class ObjectLiteral1(x1: PropertyDefinitionList, parserParams: List[Boolean]) extends ObjectLiteral {
  x1.parent = Some(this)
  val name: String = "ObjectLiteral1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k = x1.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"{ $x1 }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("PropertyDefinitionList", x1, Nil).reverse
  val info: ASTInfo = ObjectLiteral1
}
object ObjectLiteral1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ObjectLiteral1Evaluation0.func
  )
}
case class ObjectLiteral2(x1: PropertyDefinitionList, parserParams: List[Boolean]) extends ObjectLiteral {
  x1.parent = Some(this)
  val name: String = "ObjectLiteral2"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k = x1.updateSpan(k) + 1
    k += 2
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"{ $x1 , }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("PropertyDefinitionList", x1, Nil).reverse
  val info: ASTInfo = ObjectLiteral2
}
object ObjectLiteral2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ObjectLiteral2Evaluation0.func
  )
}
