package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait DebuggerStatement extends AST {
  val kind: String = "DebuggerStatement"
}
case class DebuggerStatement0(parserParams: List[Boolean]) extends DebuggerStatement {
  val name: String = "DebuggerStatement0"
  override def toString: String = {
    s"debugger ;"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = DebuggerStatement0
}
object DebuggerStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> DebuggerStatement0Evaluation0.func
  )
}
