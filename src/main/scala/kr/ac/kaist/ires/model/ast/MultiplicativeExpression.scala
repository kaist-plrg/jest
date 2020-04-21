package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait MultiplicativeExpression extends AST {
  val kind: String = "MultiplicativeExpression"
}
case class MultiplicativeExpression0(x0: ExponentiationExpression, parserParams: List[Boolean]) extends MultiplicativeExpression {
  x0.parent = Some(this)
  val name: String = "MultiplicativeExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ExponentiationExpression", x0, Nil).reverse
  val info: ASTInfo = MultiplicativeExpression0
}
object MultiplicativeExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class MultiplicativeExpression1(x0: MultiplicativeExpression, x1: MultiplicativeOperator, x2: ExponentiationExpression, parserParams: List[Boolean]) extends MultiplicativeExpression {
  x0.parent = Some(this)
  x1.parent = Some(this)
  x2.parent = Some(this)
  val name: String = "MultiplicativeExpression1"
  override def toString: String = {
    s"$x0 $x1 $x2"
  }
  val k: Int = d(x2, d(x1, d(x0, 0)))
  val fullList: List[(String, Value)] = l("ExponentiationExpression", x2, l("MultiplicativeOperator", x1, l("MultiplicativeExpression", x0, Nil))).reverse
  val info: ASTInfo = MultiplicativeExpression1
}
object MultiplicativeExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> MultiplicativeExpression1AssignmentTargetType0.func,
    "Evaluation0" -> MultiplicativeExpression1Evaluation0.func,
    "HasCallInTailPosition0" -> MultiplicativeExpression1HasCallInTailPosition0.func,
    "IsFunctionDefinition0" -> MultiplicativeExpression1IsFunctionDefinition0.func
  )
}
