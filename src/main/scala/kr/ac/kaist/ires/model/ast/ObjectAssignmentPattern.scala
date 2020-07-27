package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ObjectAssignmentPattern extends AST {
  val kind: String = "ObjectAssignmentPattern"
}
case class ObjectAssignmentPattern0(parserParams: List[Boolean]) extends ObjectAssignmentPattern {
  val name: String = "ObjectAssignmentPattern0"
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
  val info: ASTInfo = ObjectAssignmentPattern0
}
object ObjectAssignmentPattern0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "DestructuringAssignmentEvaluation0" -> ObjectAssignmentPattern0DestructuringAssignmentEvaluation0.func
  )
}
case class ObjectAssignmentPattern1(x1: AssignmentRestProperty, parserParams: List[Boolean]) extends ObjectAssignmentPattern {
  x1.parent = Some(this)
  val name: String = "ObjectAssignmentPattern1"
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
  val fullList: List[(String, Value)] = l("AssignmentRestProperty", x1, Nil).reverse
  val info: ASTInfo = ObjectAssignmentPattern1
}
object ObjectAssignmentPattern1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "DestructuringAssignmentEvaluation0" -> ObjectAssignmentPattern1DestructuringAssignmentEvaluation0.func
  )
}
case class ObjectAssignmentPattern2(x1: AssignmentPropertyList, parserParams: List[Boolean]) extends ObjectAssignmentPattern {
  x1.parent = Some(this)
  val name: String = "ObjectAssignmentPattern2"
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
  val fullList: List[(String, Value)] = l("AssignmentPropertyList", x1, Nil).reverse
  val info: ASTInfo = ObjectAssignmentPattern2
}
object ObjectAssignmentPattern2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "DestructuringAssignmentEvaluation0" -> ObjectAssignmentPattern2DestructuringAssignmentEvaluation0.func
  )
}
case class ObjectAssignmentPattern3(x1: AssignmentPropertyList, x3: Option[AssignmentRestProperty], parserParams: List[Boolean]) extends ObjectAssignmentPattern {
  x1.parent = Some(this)
  x3.foreach((m) => m.parent = Some(this))
  val name: String = "ObjectAssignmentPattern3"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k = x1.updateSpan(k) + 1
    k += 2
    k = x3.fold(k)(_.updateSpan(k)) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"{ $x1 , ${x3.getOrElse("")} }"
  }
  val k: Int = d(x3, d(x1, 0))
  val fullList: List[(String, Value)] = l("Option[AssignmentRestProperty]", x3, l("AssignmentPropertyList", x1, Nil)).reverse
  val info: ASTInfo = ObjectAssignmentPattern3
}
object ObjectAssignmentPattern3 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "DestructuringAssignmentEvaluation0" -> ObjectAssignmentPattern3DestructuringAssignmentEvaluation0.func,
    "DestructuringAssignmentEvaluation1" -> ObjectAssignmentPattern3DestructuringAssignmentEvaluation1.func
  )
}
