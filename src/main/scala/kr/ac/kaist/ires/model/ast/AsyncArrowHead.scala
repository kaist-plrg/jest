package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncArrowHead extends AST {
  val kind: String = "AsyncArrowHead"
}
case class AsyncArrowHead0(x2: ArrowFormalParameters, parserParams: List[Boolean]) extends AsyncArrowHead {
  val name: String = "AsyncArrowHead0"
  override def toString: String = {
    s"async $x2"
  }
  val k: Int = d(x2, 0)
  val fullList: List[(String, Value)] = l("ArrowFormalParameters", x2, Nil).reverse
  val info: ASTInfo = AsyncArrowHead0
}
object AsyncArrowHead0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
