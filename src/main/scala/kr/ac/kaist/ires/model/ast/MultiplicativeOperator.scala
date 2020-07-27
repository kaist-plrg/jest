package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait MultiplicativeOperator extends AST {
  val kind: String = "MultiplicativeOperator"
}
case class MultiplicativeOperator0(parserParams: List[Boolean]) extends MultiplicativeOperator {
  val name: String = "MultiplicativeOperator0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"*"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = MultiplicativeOperator0
}
object MultiplicativeOperator0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class MultiplicativeOperator1(parserParams: List[Boolean]) extends MultiplicativeOperator {
  val name: String = "MultiplicativeOperator1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"/"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = MultiplicativeOperator1
}
object MultiplicativeOperator1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class MultiplicativeOperator2(parserParams: List[Boolean]) extends MultiplicativeOperator {
  val name: String = "MultiplicativeOperator2"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"%"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = MultiplicativeOperator2
}
object MultiplicativeOperator2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
