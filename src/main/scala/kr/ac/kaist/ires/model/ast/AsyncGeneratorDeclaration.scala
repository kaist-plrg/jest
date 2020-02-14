package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncGeneratorDeclaration extends AST {
  val kind: String = "AsyncGeneratorDeclaration"
}
case class AsyncGeneratorDeclaration0(x4: BindingIdentifier, x6: FormalParameters, x9: AsyncGeneratorBody, parserParams: List[Boolean]) extends AsyncGeneratorDeclaration {
  val name: String = "AsyncGeneratorDeclaration0"
  override def toString: String = {
    s"async function * $x4 ( $x6 ) { $x9 }"
  }
  val k: Int = d(x9, d(x6, d(x4, 0)))
  val fullList: List[(String, Value)] = l("AsyncGeneratorBody", x9, l("FormalParameters", x6, l("BindingIdentifier", x4, Nil))).reverse
  val info: ASTInfo = AsyncGeneratorDeclaration0
}
object AsyncGeneratorDeclaration0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Contains0" -> AsyncGeneratorDeclaration0Contains0.func,
    "BoundNames0" -> AsyncGeneratorDeclaration0BoundNames0.func,
    "InstantiateFunctionObject0" -> AsyncGeneratorDeclaration0InstantiateFunctionObject0.func,
    "IsConstantDeclaration0" -> AsyncGeneratorDeclaration0IsConstantDeclaration0.func
  )
}
case class AsyncGeneratorDeclaration1(x5: FormalParameters, x8: AsyncGeneratorBody, parserParams: List[Boolean]) extends AsyncGeneratorDeclaration {
  val name: String = "AsyncGeneratorDeclaration1"
  override def toString: String = {
    s"async function * ( $x5 ) { $x8 }"
  }
  val k: Int = d(x8, d(x5, 0))
  val fullList: List[(String, Value)] = l("AsyncGeneratorBody", x8, l("FormalParameters", x5, Nil)).reverse
  val info: ASTInfo = AsyncGeneratorDeclaration1
}
object AsyncGeneratorDeclaration1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "BoundNames0" -> AsyncGeneratorDeclaration1BoundNames0.func,
    "Contains0" -> AsyncGeneratorDeclaration1Contains0.func,
    "IsConstantDeclaration0" -> AsyncGeneratorDeclaration1IsConstantDeclaration0.func,
    "InstantiateFunctionObject0" -> AsyncGeneratorDeclaration1InstantiateFunctionObject0.func
  )
}
