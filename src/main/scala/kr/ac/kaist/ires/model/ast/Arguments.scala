package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Arguments extends AST {
  val kind: String = "Arguments"
}
case class Arguments0(parserParams: List[Boolean]) extends Arguments {
  val name: String = "Arguments0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"( )"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = Arguments0
}
object Arguments0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArgumentListEvaluation0" -> Arguments0ArgumentListEvaluation0.func
  )
}
case class Arguments1(x1: ArgumentList, parserParams: List[Boolean]) extends Arguments {
  x1.parent = Some(this)
  val name: String = "Arguments1"
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
    s"( $x1 )"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ArgumentList", x1, Nil).reverse
  val info: ASTInfo = Arguments1
}
object Arguments1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Arguments2(x1: ArgumentList, parserParams: List[Boolean]) extends Arguments {
  x1.parent = Some(this)
  val name: String = "Arguments2"
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
    s"( $x1 , )"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ArgumentList", x1, Nil).reverse
  val info: ASTInfo = Arguments2
}
object Arguments2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
