package kr.ac.kaist.jest.coverage

import kr.ac.kaist.jest.LINE_SEP
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Inst._
import kr.ac.kaist.jest.model.Algorithm
import kr.ac.kaist.jest.util.Useful._

case class Coverage(cases: Vector[Case]) extends CoverageProtocol {
  val size: Int = cases.size

  // instructions
  val insts: Set[Int] = (0 until cases.length).toSet
  val instCovered: Set[Int] = insts.filter(k => cases(k).covered)

  // conditions
  case class Branch(id: Int, pass: Boolean) {
    def neg: Branch = Branch(id, !pass)
  }
  val conds: Set[Branch] = insts.flatMap(k => cases(k) match {
    case _: Cond => List(Branch(k, true), Branch(k, false))
    case _ => Nil
  })
  val condCovered: Set[Branch] = conds.filter {
    case Branch(k, true) => !cases(k).asInstanceOf[Cond].thenCovered.isEmpty
    case Branch(k, false) => !cases(k).asInstanceOf[Cond].elseCovered.isEmpty
  }

  // algorithms
  val algos: Set[String] = cases.map(_.algo).toSet
  val neverVisit: Set[String] = algos -- cases.filter(_.covered).map(_.algo).toSet
  val fullVisit: Set[String] = algos -- cases.filter(!_.covered).map(_.algo).toSet
  val partialVisit: Set[String] = algos -- fullVisit -- neverVisit

  // meaningful failed cases
  val meaningfulFailed = cases.filter(c => partialVisit.contains(c.algo) && (c match {
    case _: Base => false
    case c: Cond =>
      !c.cond.startsWith("(is-completion") &&
        !c.cond.contains(" CONST_normal)") &&
        c.cond != "true" &&
        (c.thenCovered.isEmpty || c.elseCovered.isEmpty)
  }))

  // summary
  val summary: String = {
    s"Coverage:" + LINE_SEP +
      s"- Inst: ${getPercent(instCovered, insts)}" + LINE_SEP +
      s"- Cond: ${getPercent(condCovered, conds)}" + LINE_SEP +
      s"Visit Algorithm:" + LINE_SEP +
      s"- Never  : ${getPercent(neverVisit, algos)}" + LINE_SEP +
      s"- Partial: ${getPercent(partialVisit, algos)}" + LINE_SEP +
      s"- Full   : ${getPercent(fullVisit, algos)}" + LINE_SEP +
      s"Meaningful Failed: ${getPercent(meaningfulFailed, conds)}"
  }

  // dump statistics
  def dump(dir: String): Unit = {
    // directory for coverage results
    mkdir(dir)

    // dump coverage
    dumpJson(this, s"$dir/coverage.json")

    // never visited algorithms
    dumpJson(neverVisit.toList.sorted, s"$dir/never-visit.json")

    // partially covered algorithms
    dumpJson(partialVisit.toList.sorted, s"$dir/partial-visit.json")

    // fully covered algorithms
    dumpJson(fullVisit.toList.sorted, s"$dir/full-visit.json")

    // meaningful failed cases
    dumpJson(meaningfulFailed, s"$dir/meaningful-failed.json")

    // summary
    dumpFile(summary, s"$dir/summary")
  }
}
