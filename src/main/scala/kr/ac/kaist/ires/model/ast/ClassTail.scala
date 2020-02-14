package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ClassTail extends AST {
  val kind: String = "ClassTail"
}
case class ClassTail0(x0: Option[ClassHeritage], x2: Option[ClassBody], parserParams: List[Boolean]) extends ClassTail {
  val name: String = "ClassTail0"
  override def toString: String = {
    s"${x0.getOrElse("")} { ${x2.getOrElse("")} }"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("Option[ClassBody]", x2, l("Option[ClassHeritage]", x0, Nil)).reverse
  val info: ASTInfo = ClassTail0
}
object ClassTail0 extends ASTInfo {
  val maxK: Int = 3
  val semMap: Map[String, Func] = Map(
    "Contains3" -> ClassTail0Contains3.func,
    "ClassDefinitionEvaluation3" -> ClassTail0ClassDefinitionEvaluation3.func
  )
}
