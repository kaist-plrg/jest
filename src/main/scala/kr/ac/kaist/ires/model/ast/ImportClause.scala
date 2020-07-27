package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ImportClause extends AST {
  val kind: String = "ImportClause"
}
case class ImportClause0(x0: ImportedDefaultBinding, parserParams: List[Boolean]) extends ImportClause {
  x0.parent = Some(this)
  val name: String = "ImportClause0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ImportedDefaultBinding", x0, Nil).reverse
  val info: ASTInfo = ImportClause0
}
object ImportClause0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ImportClause1(x0: NameSpaceImport, parserParams: List[Boolean]) extends ImportClause {
  x0.parent = Some(this)
  val name: String = "ImportClause1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("NameSpaceImport", x0, Nil).reverse
  val info: ASTInfo = ImportClause1
}
object ImportClause1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ImportClause2(x0: NamedImports, parserParams: List[Boolean]) extends ImportClause {
  x0.parent = Some(this)
  val name: String = "ImportClause2"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("NamedImports", x0, Nil).reverse
  val info: ASTInfo = ImportClause2
}
object ImportClause2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ImportClause3(x0: ImportedDefaultBinding, x2: NameSpaceImport, parserParams: List[Boolean]) extends ImportClause {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ImportClause3"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k += 2
    k = x2.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0 , $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("NameSpaceImport", x2, l("ImportedDefaultBinding", x0, Nil)).reverse
  val info: ASTInfo = ImportClause3
}
object ImportClause3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ImportClause4(x0: ImportedDefaultBinding, x2: NamedImports, parserParams: List[Boolean]) extends ImportClause {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "ImportClause4"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    k += 2
    k = x2.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0 , $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("NamedImports", x2, l("ImportedDefaultBinding", x0, Nil)).reverse
  val info: ASTInfo = ImportClause4
}
object ImportClause4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
