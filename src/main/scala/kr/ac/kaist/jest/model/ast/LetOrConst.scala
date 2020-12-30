package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LetOrConst extends AST {
  val kind: String = "LetOrConst"
}
case class LetOrConst0(parserParams: List[Boolean]) extends LetOrConst {
  val name: String = "LetOrConst0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 3)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("let")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = LetOrConst0
}
object LetOrConst0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsConstantDeclaration0" -> LetOrConst0IsConstantDeclaration0.func
  )
}
case class LetOrConst1(parserParams: List[Boolean]) extends LetOrConst {
  val name: String = "LetOrConst1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("const")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = LetOrConst1
}
object LetOrConst1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsConstantDeclaration0" -> LetOrConst1IsConstantDeclaration0.func
  )
}
