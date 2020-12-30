package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Declaration extends AST {
  val kind: String = "Declaration"
}
case class Declaration0(x0: HoistableDeclaration, parserParams: List[Boolean]) extends Declaration {
  x0.parent = Some(this)
  val name: String = "Declaration0"
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
  val fullList: List[(String, Value)] = l("HoistableDeclaration", x0, Nil).reverse
  val info: ASTInfo = Declaration0
}
object Declaration0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Declaration1(x0: ClassDeclaration, parserParams: List[Boolean]) extends Declaration {
  x0.parent = Some(this)
  val name: String = "Declaration1"
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
  val fullList: List[(String, Value)] = l("ClassDeclaration", x0, Nil).reverse
  val info: ASTInfo = Declaration1
}
object Declaration1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "DeclarationPart0" -> Declaration1DeclarationPart0.func
  )
}
case class Declaration2(x0: LexicalDeclaration, parserParams: List[Boolean]) extends Declaration {
  x0.parent = Some(this)
  val name: String = "Declaration2"
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
  val fullList: List[(String, Value)] = l("LexicalDeclaration", x0, Nil).reverse
  val info: ASTInfo = Declaration2
}
object Declaration2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "DeclarationPart0" -> Declaration2DeclarationPart0.func
  )
}
