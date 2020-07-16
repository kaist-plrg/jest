package kr.ac.kaist.ires.sampler

import spray.json._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.{ AST, Lexical, RESOURCE_DIR }
import kr.ac.kaist.ires.model.UnitWalker

class RHSTracer extends UnitWalker {
  import RHSElem._

  // covered RHS
  var _covered: Set[RHSElem] = Set()
  def covered: List[RHSElem] = _covered.toList.sorted
  def summary: String = s"Syntax Coverage: ${getPercent(covered, total)}"
  def uncovered: List[RHSElem] = (total -- _covered).toList.sorted

  // added touched AST
  override def beforeWalk[T <: AST](ast: T): Unit =
    _covered += RHSElem(ast.name, ast.parserParams, ast.k)

  def apply[T <: AST](ast: T): Unit = walk(ast)
  def apply[T <: AST](seq: Seq[T]): Unit = seq.foreach(walk)

  def dump(dir: String): Unit = {
    // directory for coverage results
    mkdir(dir)

    // dump covered RHS
    dumpJson(covered, s"$dir/covered.json")

    // dump uncovered RHS
    dumpJson(uncovered, s"$dir/uncovered.json")

    // summary
    dumpFile(summary, s"$dir/summary")
  }
}

case class RHSElem(rhsName: String, parserParams: List[Boolean], k: Int)

object RHSElem extends DefaultJsonProtocol {
  implicit val RHSElemFormat: JsonFormat[RHSElem] = jsonFormat3(RHSElem.apply)
  implicit def ordering[E <: RHSElem]: Ordering[E] = new Ordering[E] {
    override def compare(x: E, y: E): Int = x.toString.compareTo(y.toString)
  }
  lazy val total: Set[RHSElem] =
    readJson[Set[RHSElem]](s"$RESOURCE_DIR/TargetRHS.json")
}
