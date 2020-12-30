package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Catch extends AST {
  val kind: String = "Catch"
}
case class Catch0(x2: CatchParameter, x4: Block, parserParams: List[Boolean]) extends Catch {
  x2.parent = Some(this)
  x4.parent = Some(this)
  val name: String = "Catch0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(end + 1)
    inc(x2.updateSpan(end))
    inc(end + 1)
    inc(x4.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("catch", "(", x2, ")", x4)
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("Block", x4, l("CatchParameter", x2, Nil)).reverse
  val info: ASTInfo = Catch0
}
object Catch0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "CatchClauseEvaluation0" -> Catch0CatchClauseEvaluation0.func,
    "HasCallInTailPosition0" -> Catch0HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> Catch0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> Catch0VarScopedDeclarations0.func
  )
}
case class Catch1(x1: Block, parserParams: List[Boolean]) extends Catch {
  x1.parent = Some(this)
  val name: String = "Catch1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("catch", x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Block", x1, Nil).reverse
  val info: ASTInfo = Catch1
}
object Catch1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "CatchClauseEvaluation0" -> Catch1CatchClauseEvaluation0.func
  )
}
