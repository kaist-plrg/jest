package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LabelledStatement extends AST {
  val kind: String = "LabelledStatement"
}
case class LabelledStatement0(x0: LabelIdentifier, x2: LabelledItem, parserParams: List[Boolean]) extends LabelledStatement {
  x0.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "LabelledStatement0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 1)
    inc(x2.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, ":", x2)
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("LabelledItem", x2, l("LabelIdentifier", x0, Nil)).reverse
  val info: ASTInfo = LabelledStatement0
}
object LabelledStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> LabelledStatement0Evaluation0.func,
    "HasCallInTailPosition0" -> LabelledStatement0HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> LabelledStatement0LabelledEvaluation0.func,
    "LexicallyDeclaredNames0" -> LabelledStatement0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> LabelledStatement0LexicallyScopedDeclarations0.func,
    "TopLevelLexicallyDeclaredNames0" -> LabelledStatement0TopLevelLexicallyDeclaredNames0.func,
    "TopLevelLexicallyScopedDeclarations0" -> LabelledStatement0TopLevelLexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> LabelledStatement0TopLevelVarDeclaredNames0.func,
    "TopLevelVarScopedDeclarations0" -> LabelledStatement0TopLevelVarScopedDeclarations0.func,
    "VarDeclaredNames0" -> LabelledStatement0VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> LabelledStatement0VarScopedDeclarations0.func
  )
}
