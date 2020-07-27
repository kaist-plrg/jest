package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait IfStatement extends AST {
  val kind: String = "IfStatement"
}
case class IfStatement0(x2: Expression, x4: Statement, x6: Statement, parserParams: List[Boolean]) extends IfStatement {
  x2.parent = Some(this)
  x4.parent = Some(this)
  x6.parent = Some(this)
  val name: String = "IfStatement0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 3
    k += 2
    k = x2.updateSpan(k) + 1
    k += 2
    k = x4.updateSpan(k) + 1
    k += 5
    k = x6.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"if ( $x2 ) $x4 else $x6"
  }
  val k: Int = d(x6, d(x4, d(x2, 0)))
  val fullList: List[(String, Value)] = l("Statement1", x6, l("Statement0", x4, l("Expression", x2, Nil))).reverse
  val info: ASTInfo = IfStatement0
}
object IfStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> IfStatement0Evaluation0.func,
    "HasCallInTailPosition0" -> IfStatement0HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> IfStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IfStatement0VarScopedDeclarations0.func
  )
}
case class IfStatement1(x2: Expression, x4: Statement, parserParams: List[Boolean]) extends IfStatement {
  x2.parent = Some(this)
  x4.parent = Some(this)
  val name: String = "IfStatement1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 3
    k += 2
    k = x2.updateSpan(k) + 1
    k += 2
    k = x4.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"if ( $x2 ) $x4"
  }
  val k: Int = d(x4, d(x2, 0))
  val fullList: List[(String, Value)] = l("Statement", x4, l("Expression", x2, Nil)).reverse
  val info: ASTInfo = IfStatement1
}
object IfStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> IfStatement1Evaluation0.func,
    "HasCallInTailPosition0" -> IfStatement1HasCallInTailPosition0.func,
    "VarDeclaredNames0" -> IfStatement1VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> IfStatement1VarScopedDeclarations0.func
  )
}
