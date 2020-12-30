package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Arguments extends AST {
  val kind: String = "Arguments"
}
case class Arguments0(parserParams: List[Boolean]) extends Arguments {
  val name: String = "Arguments0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("(", ")")
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
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("(", x1, ")")
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
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    inc(end + 1)
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("(", x1, ",", ")")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ArgumentList", x1, Nil).reverse
  val info: ASTInfo = Arguments2
}
object Arguments2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
