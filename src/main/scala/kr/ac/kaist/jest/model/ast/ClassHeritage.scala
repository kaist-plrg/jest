package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ClassHeritage extends AST {
  val kind: String = "ClassHeritage"
}
case class ClassHeritage0(x1: LeftHandSideExpression, parserParams: List[Boolean]) extends ClassHeritage {
  x1.parent = Some(this)
  val name: String = "ClassHeritage0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 7)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("extends", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("LeftHandSideExpression", x1, Nil).reverse
  val info: ASTInfo = ClassHeritage0
}
object ClassHeritage0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
