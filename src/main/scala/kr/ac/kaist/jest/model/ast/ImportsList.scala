package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ImportsList extends AST {
  val kind: String = "ImportsList"
}
case class ImportsList0(x0: ImportSpecifier, parserParams: List[Boolean]) extends ImportsList {
  x0.parent = Some(this)
  val name: String = "ImportsList0"
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
  val fullList: List[(String, Value)] = l("ImportSpecifier", x0, Nil).reverse
  val info: ASTInfo = ImportsList0
}
object ImportsList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ImportsList1(x0: ImportsList, x2: ImportSpecifier, parserParams: List[Boolean]) extends ImportsList {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ImportsList1"
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
  val fullList: List[(String, Value)] = l("ImportSpecifier", x2, l("ImportsList", x0, Nil)).reverse
  val info: ASTInfo = ImportsList1
}
object ImportsList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
