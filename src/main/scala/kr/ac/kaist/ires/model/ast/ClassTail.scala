package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ClassTail extends AST {
  val kind: String = "ClassTail"
}
case class ClassTail0(x0: Option[ClassHeritage], x2: Option[ClassBody], parserParams: List[Boolean]) extends ClassTail {
  x0.foreach((m) => m.parent = Some(this))
  x2.foreach((m) => m.parent = Some(this))
  val name: String = "ClassTail0"
  def updateSpan(start: Int): Int = {
    this.start = start
    var k = start
    k = x0.fold(k)(_.updateSpan(k)) + 1
    k += 2
    k = x2.fold(k)(_.updateSpan(k)) + 1
    k += 2
    this.end = k - 1
    this.end
  }
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
    "ClassDefinitionEvaluation3" -> ClassTail0ClassDefinitionEvaluation3.func,
    "Contains3" -> ClassTail0Contains3.func
  )
}
