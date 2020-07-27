package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait SuperProperty extends AST {
  val kind: String = "SuperProperty"
}
case class SuperProperty0(x2: Expression, parserParams: List[Boolean]) extends SuperProperty {
  x2.parent = Some(this)
  val name: String = "SuperProperty0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 6
    k += 2
    k = x2.updateSpan(k) + 1
    k += 2
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"super [ $x2 ]"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("Expression", x2, Nil).reverse
  val info: ASTInfo = SuperProperty0
}
object SuperProperty0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> SuperProperty0Evaluation0.func
  )
}
case class SuperProperty1(x2: Lexical, parserParams: List[Boolean]) extends SuperProperty {
  x2.parent = Some(this)
  val name: String = "SuperProperty1"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k += 6
    k += 2
    k = x2.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"super . $x2"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("Lexical", x2, Nil).reverse
  val info: ASTInfo = SuperProperty1
}
object SuperProperty1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Contains0" -> SuperProperty1Contains0.func,
    "Evaluation0" -> SuperProperty1Evaluation0.func
  )
}
