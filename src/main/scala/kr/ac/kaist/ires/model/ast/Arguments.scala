package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Arguments extends AST {
  val kind: String = "Arguments"
}
case class Arguments0(parserParams: List[Boolean]) extends Arguments {
  val name: String = "Arguments0"
  override def toString: String = {
    s"( )"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = Arguments0
}
object Arguments0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ArgumentListEvaluation0" -> Arguments0ArgumentListEvaluation0.func
  )
}
case class Arguments1(x1: ArgumentList, parserParams: List[Boolean]) extends Arguments {
  val name: String = "Arguments1"
  override def toString: String = {
    s"( $x1 )"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ArgumentList", x1, Nil).reverse
  val info: ASTInfo = Arguments1
}
object Arguments1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class Arguments2(x1: ArgumentList, parserParams: List[Boolean]) extends Arguments {
  val name: String = "Arguments2"
  override def toString: String = {
    s"( $x1 , )"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ArgumentList", x1, Nil).reverse
  val info: ASTInfo = Arguments2
}
object Arguments2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
