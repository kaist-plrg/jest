package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ImportMeta extends AST {
  val kind: String = "ImportMeta"
}
case class ImportMeta0(parserParams: List[Boolean]) extends ImportMeta {
  val name: String = "ImportMeta0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 6)
    inc(end + 1)
    inc(end + 4)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("import", ".", "meta")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ImportMeta0
}
object ImportMeta0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ImportMeta0Evaluation0.func
  )
}
