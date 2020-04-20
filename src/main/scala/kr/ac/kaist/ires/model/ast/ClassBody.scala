package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ClassBody extends AST {
  val kind: String = "ClassBody"
}
case class ClassBody0(x0: ClassElementList, parserParams: List[Boolean]) extends ClassBody {
  x0.parent = Some(this)
  val name: String = "ClassBody0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ClassElementList", x0, Nil).reverse
  val info: ASTInfo = ClassBody0
}
object ClassBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
