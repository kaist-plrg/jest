package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ReturnStatement extends AST {
  val kind: String = "ReturnStatement"
}
case class ReturnStatement0(parserParams: List[Boolean]) extends ReturnStatement {
  val name: String = "ReturnStatement0"
  override def toString: String = {
    s"return ;"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = ReturnStatement0
}
object ReturnStatement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ReturnStatement0Evaluation0.func,
    "HasCallInTailPosition0" -> ReturnStatement0HasCallInTailPosition0.func
  )
}
case class ReturnStatement1(x2: Expression, parserParams: List[Boolean]) extends ReturnStatement {
  x2.parent = Some(this)
  val name: String = "ReturnStatement1"
  override def toString: String = {
    s"return $x2 ;"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("Expression", x2, Nil).reverse
  val info: ASTInfo = ReturnStatement1
}
object ReturnStatement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ReturnStatement1Evaluation0.func,
    "HasCallInTailPosition0" -> ReturnStatement1HasCallInTailPosition0.func
  )
}
