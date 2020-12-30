package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Elision extends AST {
  val kind: String = "Elision"
}
case class Elision0(parserParams: List[Boolean]) extends Elision {
  val name: String = "Elision0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(",")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = Elision0
}
object Elision0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArrayAccumulation0" -> Elision0ArrayAccumulation0.func,
    "IteratorDestructuringAssignmentEvaluation0" -> Elision0IteratorDestructuringAssignmentEvaluation0.func
  )
}
case class Elision1(x0: Elision, parserParams: List[Boolean]) extends Elision {
  x0.parent = Some(this)
  val name: String = "Elision1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ",")
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Elision", x0, Nil).reverse
  val info: ASTInfo = Elision1
}
object Elision1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArrayAccumulation0" -> Elision1ArrayAccumulation0.func,
    "IteratorDestructuringAssignmentEvaluation0" -> Elision1IteratorDestructuringAssignmentEvaluation0.func
  )
}
