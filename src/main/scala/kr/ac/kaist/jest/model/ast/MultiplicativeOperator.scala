package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait MultiplicativeOperator extends AST {
  val kind: String = "MultiplicativeOperator"
}
case class MultiplicativeOperator0(parserParams: List[Boolean]) extends MultiplicativeOperator {
  val name: String = "MultiplicativeOperator0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("*")
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
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("/")
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
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("%")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = MultiplicativeOperator2
}
object MultiplicativeOperator2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
