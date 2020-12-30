package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LabelIdentifier extends AST {
  val kind: String = "LabelIdentifier"
}
case class LabelIdentifier0(x0: Identifier, parserParams: List[Boolean]) extends LabelIdentifier {
  x0.parent = Some(this)
  val name: String = "LabelIdentifier0"
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
  val fullList: List[(String, Value)] = l("Identifier", x0, Nil).reverse
  val info: ASTInfo = LabelIdentifier0
}
object LabelIdentifier0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class LabelIdentifier1(parserParams: List[Boolean]) extends LabelIdentifier {
  val name: String = "LabelIdentifier1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("yield")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = LabelIdentifier1
}
object LabelIdentifier1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "StringValue0" -> LabelIdentifier1StringValue0.func
  )
}
case class LabelIdentifier2(parserParams: List[Boolean]) extends LabelIdentifier {
  val name: String = "LabelIdentifier2"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("await")
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = LabelIdentifier2
}
object LabelIdentifier2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "StringValue0" -> LabelIdentifier2StringValue0.func
  )
}
