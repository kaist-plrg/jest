package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Module extends AST {
  val kind: String = "Module"
}
case class Module0(x0: Option[ModuleBody], parserParams: List[Boolean]) extends Module {
  x0.foreach((m) => m.parent = Some(this))
  val name: String = "Module0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    x0.map(x => inc(x.updateSpan(end)))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0.getOrElse(""))
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Option[ModuleBody]", x0, Nil).reverse
  val info: ASTInfo = Module0
}
object Module0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map()
}
