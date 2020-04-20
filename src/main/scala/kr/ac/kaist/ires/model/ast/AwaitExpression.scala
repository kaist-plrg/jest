package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AwaitExpression extends AST {
  val kind: String = "AwaitExpression"
}
case class AwaitExpression0(x1: UnaryExpression, parserParams: List[Boolean]) extends AwaitExpression {
  x1.parent = Some(this)
  val name: String = "AwaitExpression0"
  override def toString: String = {
    s"await $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("UnaryExpression", x1, Nil).reverse
  val info: ASTInfo = AwaitExpression0
}
object AwaitExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> AwaitExpression0Evaluation0.func
  )
}
