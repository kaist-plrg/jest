package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ReturnStatement extends AST {
  val kind: String = "ReturnStatement"
}
case class ReturnStatement0(parserParams: List[Boolean]) extends ReturnStatement {
  val name: String = "ReturnStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 6)
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("return", ";")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ReturnStatement0
}
object ReturnStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ReturnStatement0Evaluation0.func,
    "HasCallInTailPosition0" -> ReturnStatement0HasCallInTailPosition0.func
  )
}
case class ReturnStatement1(x2: Expression, parserParams: List[Boolean]) extends ReturnStatement {
  x2.parent = Some(this)
  val name: String = "ReturnStatement1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 6)
    inc(x2.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("return", x2, ";")
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("Expression", x2, Nil).reverse
  val info: ASTInfo = ReturnStatement1
}
object ReturnStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ReturnStatement1Evaluation0.func,
    "HasCallInTailPosition0" -> ReturnStatement1HasCallInTailPosition0.func
  )
}
