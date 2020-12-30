package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ImportSpecifier extends AST {
  val kind: String = "ImportSpecifier"
}
case class ImportSpecifier0(x0: ImportedBinding, parserParams: List[Boolean]) extends ImportSpecifier {
  x0.parent = Some(this)
  val name: String = "ImportSpecifier0"
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
  val fullList: List[(String, Value)] = l("ImportedBinding", x0, Nil).reverse
  val info: ASTInfo = ImportSpecifier0
}
object ImportSpecifier0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ImportSpecifier1(x0: Lexical, x2: ImportedBinding, parserParams: List[Boolean]) extends ImportSpecifier {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ImportSpecifier1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 2)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "as", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("ImportedBinding", x2, l("Lexical", x0, Nil)).reverse
  val info: ASTInfo = ImportSpecifier1
}
object ImportSpecifier1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
