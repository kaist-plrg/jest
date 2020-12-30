package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait TryStatement extends AST {
  val kind: String = "TryStatement"
}
case class TryStatement0(x1: Block, x2: Catch, parserParams: List[Boolean]) extends TryStatement {
  x1.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "TryStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("try", x1, x2)
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("Catch", x2, l("Block", x1, Nil)).reverse
  val info: ASTInfo = TryStatement0
}
object TryStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> TryStatement0Evaluation0.func,
    "HasCallInTailPosition0" -> TryStatement0HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> TryStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> TryStatement0VarScopedDeclarations0.func
  )
}
case class TryStatement1(x1: Block, x2: Finally, parserParams: List[Boolean]) extends TryStatement {
  x1.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "TryStatement1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("try", x1, x2)
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("Finally", x2, l("Block", x1, Nil)).reverse
  val info: ASTInfo = TryStatement1
}
object TryStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> TryStatement1Evaluation0.func,
    "HasCallInTailPosition0" -> TryStatement1HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> TryStatement1VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> TryStatement1VarScopedDeclarations0.func
  )
}
case class TryStatement2(x1: Block, x2: Catch, x3: Finally, parserParams: List[Boolean]) extends TryStatement {
  x1.parent = Some(this)
  x2.parent = Some(this)
  x3.parent = Some(this)
  val name: String = "TryStatement2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    inc(x1.updateSpan(end))
    inc(x2.updateSpan(end))
    inc(x3.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("try", x1, x2, x3)
  }
  val k: Int = d(x3, d(x2, d(x1, 0)))
  val fullList: List[(String, Value)] = l("Finally", x3, l("Catch", x2, l("Block", x1, Nil))).reverse
  val info: ASTInfo = TryStatement2
}
object TryStatement2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> TryStatement2Evaluation0.func,
    "HasCallInTailPosition0" -> TryStatement2HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> TryStatement2VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> TryStatement2VarScopedDeclarations0.func
  )
}
