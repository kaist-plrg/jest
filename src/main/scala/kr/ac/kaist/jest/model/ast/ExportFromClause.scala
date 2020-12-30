package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ExportFromClause extends AST {
  val kind: String = "ExportFromClause"
}
case class ExportFromClause0(parserParams: List[Boolean]) extends ExportFromClause {
  val name: String = "ExportFromClause0"
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
  val info: ASTInfo = ExportFromClause0
}
object ExportFromClause0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportFromClause1(x2: Lexical, parserParams: List[Boolean]) extends ExportFromClause {
  x2.parent = Some(this)
  val name: String = "ExportFromClause1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(end + 2)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("*", "as", x2)
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("Lexical", x2, Nil).reverse
  val info: ASTInfo = ExportFromClause1
}
object ExportFromClause1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportFromClause2(x0: NamedExports, parserParams: List[Boolean]) extends ExportFromClause {
  x0.parent = Some(this)
  val name: String = "ExportFromClause2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("NamedExports", x0, Nil).reverse
  val info: ASTInfo = ExportFromClause2
}
object ExportFromClause2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
