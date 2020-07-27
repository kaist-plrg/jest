package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ModuleBody extends AST {
  val kind: String = "ModuleBody"
}
case class ModuleBody0(x0: ModuleItemList, parserParams: List[Boolean]) extends ModuleBody {
  x0.parent = Some(this)
  val name: String = "ModuleBody0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.updateSpan(k) + 1
    this.end = k - 1
    this.end
  }
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ModuleItemList", x0, Nil).reverse
  val info: ASTInfo = ModuleBody0
}
object ModuleBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
