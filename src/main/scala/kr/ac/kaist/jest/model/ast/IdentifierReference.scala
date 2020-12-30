package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait IdentifierReference extends AST {
  val kind: String = "IdentifierReference"
}
case class IdentifierReference0(x0: Identifier, parserParams: List[Boolean]) extends IdentifierReference {
  x0.parent = Some(this)
  val name: String = "IdentifierReference0"
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
  val info: ASTInfo = IdentifierReference0
}
object IdentifierReference0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> IdentifierReference0Evaluation0.func
  )
}
case class IdentifierReference1(parserParams: List[Boolean]) extends IdentifierReference {
  val name: String = "IdentifierReference1"
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
  val info: ASTInfo = IdentifierReference1
}
object IdentifierReference1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> IdentifierReference1Evaluation0.func,
    "StringValue0" -> IdentifierReference1StringValue0.func
  )
}
case class IdentifierReference2(parserParams: List[Boolean]) extends IdentifierReference {
  val name: String = "IdentifierReference2"
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
  val info: ASTInfo = IdentifierReference2
}
object IdentifierReference2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> IdentifierReference2Evaluation0.func,
    "StringValue0" -> IdentifierReference2StringValue0.func
  )
}
