package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ForBinding extends AST {
  val kind: String = "ForBinding"
}
case class ForBinding0(x0: BindingIdentifier, parserParams: List[Boolean]) extends ForBinding {
  x0.parent = Some(this)
  val name: String = "ForBinding0"
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
  val fullList: List[(String, Value)] = l("BindingIdentifier", x0, Nil).reverse
  val info: ASTInfo = ForBinding0
}
object ForBinding0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ForBinding0Evaluation0.func,
    "IsDestructuring0" -> ForBinding0IsDestructuring0.func
  )
}
case class ForBinding1(x0: BindingPattern, parserParams: List[Boolean]) extends ForBinding {
  x0.parent = Some(this)
  val name: String = "ForBinding1"
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
  val fullList: List[(String, Value)] = l("BindingPattern", x0, Nil).reverse
  val info: ASTInfo = ForBinding1
}
object ForBinding1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsDestructuring0" -> ForBinding1IsDestructuring0.func
  )
}
