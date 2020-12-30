package kr.ac.kaist.jest.sampler

import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.AST
import kr.ac.kaist.jest.model.UnitWalker

class RHSTracer extends UnitWalker {
  import RHSElem._

  // covered RHS
  var _covered: Set[RHSElem] = Set()
  def covered: List[RHSElem] = _covered.toList.sorted
  def summary: String = s"Syntax Coverage: ${getPercent(covered, total)}"
  def uncovered: List[RHSElem] = (total -- _covered).toList.sorted

  // added touched AST
  override def beforeWalk[T <: AST](ast: T): Unit =
    _covered += RHSElem(ast.name, ast.k)

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
object RHSTracer {
  def apply[T <: AST](ast: T): RHSTracer = {
    val tracer = new RHSTracer
    tracer.walk(ast)
    tracer
  }
  def apply[T <: AST](seq: Seq[T]): RHSTracer = {
    val tracer = new RHSTracer
    seq.foreach(tracer.walk)
    tracer
  }
}
