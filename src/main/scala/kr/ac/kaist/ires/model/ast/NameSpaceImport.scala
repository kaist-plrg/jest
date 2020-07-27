package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait NameSpaceImport extends AST {
  val kind: String = "NameSpaceImport"
}
case class NameSpaceImport0(x2: ImportedBinding, parserParams: List[Boolean]) extends NameSpaceImport {
  x2.parent = Some(this)
  val name: String = "NameSpaceImport0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 2
    k += 3
    k = x2.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"* as $x2"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("ImportedBinding", x2, Nil).reverse
  val info: ASTInfo = NameSpaceImport0
}
object NameSpaceImport0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
