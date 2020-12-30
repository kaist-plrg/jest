package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LabelledItem extends AST {
  val kind: String = "LabelledItem"
}
case class LabelledItem0(x0: Statement, parserParams: List[Boolean]) extends LabelledItem {
  x0.parent = Some(this)
  val name: String = "LabelledItem0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Statement", x0, Nil).reverse
  val info: ASTInfo = LabelledItem0
}
object LabelledItem0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "LabelledEvaluation0" -> LabelledItem0LabelledEvaluation0.func,
    "LexicallyDeclaredNames0" -> LabelledItem0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> LabelledItem0LexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> LabelledItem0TopLevelVarDeclaredNames0.func,
    "TopLevelVarScopedDeclarations0" -> LabelledItem0TopLevelVarScopedDeclarations0.func
  )
}
case class LabelledItem1(x0: FunctionDeclaration, parserParams: List[Boolean]) extends LabelledItem {
  x0.parent = Some(this)
  val name: String = "LabelledItem1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FunctionDeclaration", x0, Nil).reverse
  val info: ASTInfo = LabelledItem1
}
object LabelledItem1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "HasCallInTailPosition0" -> LabelledItem1HasCallInTailPosition0.func,
    "LabelledEvaluation0" -> LabelledItem1LabelledEvaluation0.func,
    "LexicallyDeclaredNames0" -> LabelledItem1LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> LabelledItem1LexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> LabelledItem1TopLevelVarDeclaredNames0.func,
    "TopLevelVarScopedDeclarations0" -> LabelledItem1TopLevelVarScopedDeclarations0.func,
    "VarDeclaredNames0" -> LabelledItem1VarDeclaredNames0.func,
    "VarScopedDeclarations0" -> LabelledItem1VarScopedDeclarations0.func
  )
}
