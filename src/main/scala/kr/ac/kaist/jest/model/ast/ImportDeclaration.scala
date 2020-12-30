package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ImportDeclaration extends AST {
  val kind: String = "ImportDeclaration"
}
case class ImportDeclaration0(x1: ImportClause, x2: FromClause, parserParams: List[Boolean]) extends ImportDeclaration {
  x1.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ImportDeclaration0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 6)
    inc(x1.updateSpan(end))
    inc(x2.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("import", x1, x2, ";")
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("FromClause", x2, l("ImportClause", x1, Nil)).reverse
  val info: ASTInfo = ImportDeclaration0
}
object ImportDeclaration0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ImportDeclaration1(x1: ModuleSpecifier, parserParams: List[Boolean]) extends ImportDeclaration {
  x1.parent = Some(this)
  val name: String = "ImportDeclaration1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 6)
    inc(x1.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("import", x1, ";")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ModuleSpecifier", x1, Nil).reverse
  val info: ASTInfo = ImportDeclaration1
}
object ImportDeclaration1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
