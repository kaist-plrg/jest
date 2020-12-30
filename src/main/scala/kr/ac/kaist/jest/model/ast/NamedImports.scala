package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait NamedImports extends AST {
  val kind: String = "NamedImports"
}
case class NamedImports0(parserParams: List[Boolean]) extends NamedImports {
  val name: String = "NamedImports0"
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
  val info: ASTInfo = NamedImports0
}
object NamedImports0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class NamedImports1(x1: ImportsList, parserParams: List[Boolean]) extends NamedImports {
  x1.parent = Some(this)
  val name: String = "NamedImports1"
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
  val fullList: List[(String, Value)] = l("ImportsList", x1, Nil).reverse
  val info: ASTInfo = NamedImports1
}
object NamedImports1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class NamedImports2(x1: ImportsList, parserParams: List[Boolean]) extends NamedImports {
  x1.parent = Some(this)
  val name: String = "NamedImports2"
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
  val fullList: List[(String, Value)] = l("ImportsList", x1, Nil).reverse
  val info: ASTInfo = NamedImports2
}
object NamedImports2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
