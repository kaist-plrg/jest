package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait NamedImports extends AST {
  val kind: String = "NamedImports"
}
case class NamedImports0(parserParams: List[Boolean]) extends NamedImports {
  val name: String = "NamedImports0"
  override def toString: String = {
    s"{ }"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = NamedImports0
}
object NamedImports0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class NamedImports1(x1: ImportsList, parserParams: List[Boolean]) extends NamedImports {
  x1.parent = Some(this)
  val name: String = "NamedImports1"
  override def toString: String = {
    s"{ $x1 }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ImportsList", x1, Nil).reverse
  val info: ASTInfo = NamedImports1
}
object NamedImports1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class NamedImports2(x1: ImportsList, parserParams: List[Boolean]) extends NamedImports {
  x1.parent = Some(this)
  val name: String = "NamedImports2"
  override def toString: String = {
    s"{ $x1 , }"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ImportsList", x1, Nil).reverse
  val info: ASTInfo = NamedImports2
}
object NamedImports2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
