package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ShortCircuitExpression extends AST {
  val kind: String = "ShortCircuitExpression"
}
case class ShortCircuitExpression0(x0: LogicalORExpression, parserParams: List[Boolean]) extends ShortCircuitExpression {
  val name: String = "ShortCircuitExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("LogicalORExpression", x0, Nil).reverse
  val info: ASTInfo = ShortCircuitExpression0
}
object ShortCircuitExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class ShortCircuitExpression1(x0: CoalesceExpression, parserParams: List[Boolean]) extends ShortCircuitExpression {
  val name: String = "ShortCircuitExpression1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("CoalesceExpression", x0, Nil).reverse
  val info: ASTInfo = ShortCircuitExpression1
}
object ShortCircuitExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
