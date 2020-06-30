package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait IdentifierReference extends AST {
  val kind: String = "IdentifierReference"
}
case class IdentifierReference0(x0: Identifier, parserParams: List[Boolean]) extends IdentifierReference {
  x0.parent = Some(this)
  val name: String = "IdentifierReference0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Identifier", x0, Nil).reverse
  val info: ASTInfo = IdentifierReference0
}
object IdentifierReference0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> IdentifierReference0Evaluation0.func
  )
}
case class IdentifierReference1(parserParams: List[Boolean]) extends IdentifierReference {
  val name: String = "IdentifierReference1"
  override def toString: String = {
    s"yield"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = IdentifierReference1
}
object IdentifierReference1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> IdentifierReference1Evaluation0.func,
    "StringValue0" -> IdentifierReference1StringValue0.func
  )
}
case class IdentifierReference2(parserParams: List[Boolean]) extends IdentifierReference {
  val name: String = "IdentifierReference2"
  override def toString: String = {
    s"await"
  }
  val k: Int = 0
  val fullList: List[(String, Value)] = Nil.reverse
  val info: ASTInfo = IdentifierReference2
}
object IdentifierReference2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> IdentifierReference2Evaluation0.func,
    "StringValue0" -> IdentifierReference2StringValue0.func
  )
}
