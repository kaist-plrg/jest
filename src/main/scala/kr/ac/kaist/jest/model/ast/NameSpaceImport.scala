package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait NameSpaceImport extends AST {
  val kind: String = "NameSpaceImport"
}
case class NameSpaceImport0(x2: ImportedBinding, parserParams: List[Boolean]) extends NameSpaceImport {
  x2.parent = Some(this)
  val name: String = "NameSpaceImport0"
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
  val fullList: List[(String, Value)] = l("ImportedBinding", x2, Nil).reverse
  val info: ASTInfo = NameSpaceImport0
}
object NameSpaceImport0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
