package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ExportsList extends AST {
  val kind: String = "ExportsList"
}
case class ExportsList0(x0: ExportSpecifier, parserParams: List[Boolean]) extends ExportsList {
  x0.parent = Some(this)
  val name: String = "ExportsList0"
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
  val fullList: List[(String, Value)] = l("ExportSpecifier", x0, Nil).reverse
  val info: ASTInfo = ExportsList0
}
object ExportsList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ExportsList1(x0: ExportsList, x2: ExportSpecifier, parserParams: List[Boolean]) extends ExportsList {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ExportsList1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ",", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ExportSpecifier", x2, l("ExportsList", x0, Nil)).reverse
  val info: ASTInfo = ExportsList1
}
object ExportsList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
