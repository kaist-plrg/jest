package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LabelIdentifier extends AST {
  val kind: String = "LabelIdentifier"
}
case class LabelIdentifier0(x0: Identifier, parserParams: List[Boolean]) extends LabelIdentifier {
  x0.parent = Some(this)
  val name: String = "LabelIdentifier0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Identifier", x0, Nil).reverse
  val info: ASTInfo = LabelIdentifier0
}
object LabelIdentifier0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class LabelIdentifier1(parserParams: List[Boolean]) extends LabelIdentifier {
  val name: String = "LabelIdentifier1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 6
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"yield"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = LabelIdentifier1
}
object LabelIdentifier1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "StringValue0" -> LabelIdentifier1StringValue0.func
  )
}
case class LabelIdentifier2(parserParams: List[Boolean]) extends LabelIdentifier {
  val name: String = "LabelIdentifier2"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 6
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"await"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = LabelIdentifier2
}
object LabelIdentifier2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "StringValue0" -> LabelIdentifier2StringValue0.func
  )
}
