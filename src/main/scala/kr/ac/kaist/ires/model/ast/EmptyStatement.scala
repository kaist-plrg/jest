package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait EmptyStatement extends AST {
  val kind: String = "EmptyStatement"
}
case class EmptyStatement0(parserParams: List[Boolean]) extends EmptyStatement {
  val name: String = "EmptyStatement0"
  override def toString: String = {
    s";"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = EmptyStatement0
}
object EmptyStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> EmptyStatement0Evaluation0.func
  )
}
