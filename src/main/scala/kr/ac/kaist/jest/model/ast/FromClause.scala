package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait FromClause extends AST {
  val kind: String = "FromClause"
}
case class FromClause0(x1: ModuleSpecifier, parserParams: List[Boolean]) extends FromClause {
  x1.parent = Some(this)
  val name: String = "FromClause0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 4)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("from", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ModuleSpecifier", x1, Nil).reverse
  val info: ASTInfo = FromClause0
}
object FromClause0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
