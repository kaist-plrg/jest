package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ContinueStatement extends AST {
  val kind: String = "ContinueStatement"
}
case class ContinueStatement0(parserParams: List[Boolean]) extends ContinueStatement {
  val name: String = "ContinueStatement0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 9
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"continue ;"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ContinueStatement0
}
object ContinueStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ContinueStatement0Evaluation0.func
  )
}
case class ContinueStatement1(x2: LabelIdentifier, parserParams: List[Boolean]) extends ContinueStatement {
  x2.parent = Some(this)
  val name: String = "ContinueStatement1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 9
    k = x2.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"continue $x2 ;"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("LabelIdentifier", x2, Nil).reverse
  val info: ASTInfo = ContinueStatement1
}
object ContinueStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ContinueStatement1Evaluation0.func
  )
}
