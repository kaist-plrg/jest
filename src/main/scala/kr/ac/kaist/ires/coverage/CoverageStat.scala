package kr.ac.kaist.ires.coverage

import kr.ac.kaist.ires.{ COVERAGE_DIR, LINE_SEP }
import kr.ac.kaist.ires.model.Algorithm
import kr.ac.kaist.ires.util.Useful._
import spray.json._

case class CoverageStat(coverage: Coverage) extends CoverageProtocol {
  val cases = coverage.cases

  // instructions
  val instTotal = (0 until cases.length).toSet
  val instCovered = instTotal.filter(k => cases(k).covered)

  // conditions
  val condTotal = instTotal.flatMap(k => cases(k) match {
    case _: Cond => List((k, true), (k, false))
    case _ => Nil
  })
  val condCovered = condTotal.filter {
    case (k, true) => cases(k).asInstanceOf[Cond].thenCovered
    case (k, false) => cases(k).asInstanceOf[Cond].elseCovered
  }

  // algorithms
  val allAlgo = cases.map(_.algo).toSet
  val neverVisit = allAlgo -- cases.filter(_.covered).map(_.algo).toSet
  val fullVisit = allAlgo -- cases.filter(!_.covered).map(_.algo).toSet
  val partialVisit = allAlgo -- fullVisit -- neverVisit

  // meaningful failed cases
  val meaningfulFailed = cases.filter(c => partialVisit.contains(c.algo) && (c match {
    case _: Base => false
    case c: Cond =>
      !c.cond.startsWith("(is-completion") &&
        !c.cond.contains(" CONST_normal)") &&
        c.cond != "true" &&
        (!c.thenCovered || !c.elseCovered)
  }))

  // summary
  val summary: String = {
    s"Coverage:" + LINE_SEP +
      s"- Inst: ${getPercent(instCovered, instTotal)}" + LINE_SEP +
      s"- Cond: ${getPercent(condCovered, condTotal)}" + LINE_SEP +
      s"Visit Algorithm:" + LINE_SEP +
      s"- Never  : ${getPercent(neverVisit, allAlgo)}" + LINE_SEP +
      s"- Partial: ${getPercent(partialVisit, allAlgo)}" + LINE_SEP +
      s"- Full   : ${getPercent(fullVisit, allAlgo)}" + LINE_SEP +
      s"Meaningful Failed: ${getPercent(meaningfulFailed, condTotal)}"
  }

  // dump statistics
  def dump: Unit = {
    // directory for coverage results
    mkdir(COVERAGE_DIR)

    // never visited algorithms
    dumpJson(neverVisit.toList.sorted, s"$COVERAGE_DIR/never-visit.json")

    // partially covered algorithms
    dumpJson(partialVisit.toList.sorted, s"$COVERAGE_DIR/partial-visit.json")

    // fully covered algorithms
    dumpJson(fullVisit.toList.sorted, s"$COVERAGE_DIR/full-visit.json")

    // meaningful failed cases
    dumpJson(meaningfulFailed, s"$COVERAGE_DIR/meaningful-failed.json")

    // summary
    dumpFile(summary, s"$COVERAGE_DIR/summary")
  }
}
object CoverageStat extends CoverageProtocol {
  def apply(filename: String = s"$COVERAGE_DIR/coverage.json"): CoverageStat = {
    Algorithm.all
    val content = readFile(filename)
    val coverage = content.parseJson.convertTo[Coverage]
    CoverageStat(coverage)
  }
}
