package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait DefaultClause extends AST {
  val kind: String = "DefaultClause"
}
case class DefaultClause0(x2: Option[StatementList], parserParams: List[Boolean]) extends DefaultClause {
  x2.foreach((m) => m.parent = Some(this))
  val name: String = "DefaultClause0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 7)
    inc(end + 1)
    x2.map(x => inc(x.updateSpan(end)))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("default", ":", x2.getOrElse(""))
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("Option[StatementList]", x2, Nil).reverse
  val info: ASTInfo = DefaultClause0
}
object DefaultClause0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> DefaultClause0Evaluation0.func,
    "Evaluation1" -> DefaultClause0Evaluation1.func,
    "HasCallInTailPosition1" -> DefaultClause0HasCallInTailPosition1.func,
    "LexicallyDeclaredNames1" -> DefaultClause0LexicallyDeclaredNames1.func,
    "LexicallyScopedDeclarations1" -> DefaultClause0LexicallyScopedDeclarations1.func,
    "VarDeclaredNames1" -> DefaultClause0VarDeclaredNames1.func,
    "VarScopedDeclarations1" -> DefaultClause0VarScopedDeclarations1.func
  )
}
