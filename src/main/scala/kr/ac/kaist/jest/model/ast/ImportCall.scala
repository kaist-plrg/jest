package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ImportCall extends AST {
  val kind: String = "ImportCall"
}
case class ImportCall0(x2: AssignmentExpression, parserParams: List[Boolean]) extends ImportCall {
  x2.parent = Some(this)
  val name: String = "ImportCall0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 6)
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("import", "(", x2, ")")
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x2, Nil).reverse
  val info: ASTInfo = ImportCall0
}
object ImportCall0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ImportCall0Evaluation0.func
  )
}
