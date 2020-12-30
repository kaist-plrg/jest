package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ImportedDefaultBinding extends AST {
  val kind: String = "ImportedDefaultBinding"
}
case class ImportedDefaultBinding0(x0: ImportedBinding, parserParams: List[Boolean]) extends ImportedDefaultBinding {
  x0.parent = Some(this)
  val name: String = "ImportedDefaultBinding0"
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
  val info: ASTInfo = ImportedDefaultBinding0
}
object ImportedDefaultBinding0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
