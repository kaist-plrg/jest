package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait NamedExports extends AST {
  val kind: String = "NamedExports"
}
case class NamedExports0(parserParams: List[Boolean]) extends NamedExports {
  val name: String = "NamedExports0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("{", "}")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = NamedExports0
}
object NamedExports0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class NamedExports1(x1: ExportsList, parserParams: List[Boolean]) extends NamedExports {
  x1.parent = Some(this)
  val name: String = "NamedExports1"
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
    s("{", x1, "}")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ExportsList", x1, Nil).reverse
  val info: ASTInfo = NamedExports1
}
object NamedExports1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class NamedExports2(x1: ExportsList, parserParams: List[Boolean]) extends NamedExports {
  x1.parent = Some(this)
  val name: String = "NamedExports2"
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
    s("{", x1, ",", "}")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ExportsList", x1, Nil).reverse
  val info: ASTInfo = NamedExports2
}
object NamedExports2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
