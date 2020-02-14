package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Finally extends AST {
  val kind: String = "Finally"
}
case class Finally0(x1: Block, parserParams: List[Boolean]) extends Finally {
  val name: String = "Finally0"
  override def toString: String = {
    s"finally $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Block", x1, Nil).reverse
  val info: ASTInfo = Finally0
}
object Finally0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
