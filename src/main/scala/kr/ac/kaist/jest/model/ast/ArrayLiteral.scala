package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ArrayLiteral extends AST {
  val kind: String = "ArrayLiteral"
}
case class ArrayLiteral0(x1: Option[Elision], parserParams: List[Boolean]) extends ArrayLiteral {
  x1.foreach((m) => m.parent = Some(this))
  val name: String = "ArrayLiteral0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    x1.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("[", x1.getOrElse(""), "]")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Option[Elision]", x1, Nil).reverse
  val info: ASTInfo = ArrayLiteral0
}
object ArrayLiteral0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Evaluation1" -> ArrayLiteral0Evaluation1.func
  )
}
case class ArrayLiteral1(x1: ElementList, parserParams: List[Boolean]) extends ArrayLiteral {
  x1.parent = Some(this)
  val name: String = "ArrayLiteral1"
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
    s("[", x1, "]")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ElementList", x1, Nil).reverse
  val info: ASTInfo = ArrayLiteral1
}
object ArrayLiteral1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ArrayLiteral1Evaluation0.func
  )
}
case class ArrayLiteral2(x1: ElementList, x3: Option[Elision], parserParams: List[Boolean]) extends ArrayLiteral {
  x1.parent = Some(this)
  x3.foreach((m) => m.parent = Some(this))
  val name: String = "ArrayLiteral2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    inc(end + 1)
    x3.map(x => inc(x.updateSpan(end)))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("[", x1, ",", x3.getOrElse(""), "]")
  }
  val k: Int = d(x3, d(x1, 0))
  val fullList: List[(String, Value)] = l("Option[Elision]", x3, l("ElementList", x1, Nil)).reverse
  val info: ASTInfo = ArrayLiteral2
}
object ArrayLiteral2 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Evaluation1" -> ArrayLiteral2Evaluation1.func
  )
}
