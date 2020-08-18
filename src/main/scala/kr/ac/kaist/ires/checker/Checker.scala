package kr.ac.kaist.ires.checker

import kr.ac.kaist.ires.util.Useful._

import spray.json._

case class Checker(filename: String, engines: List[String], expected: String, debug: Boolean) {
  val result: Map[String, Set[CheckResult]] = {
    val executeResults: List[(String, Set[ExecuteResult])] = engines.map(e => (e, execute(e, filename)))
    val expectedResult: ExecuteResult = ExecuteResult(expected)
    val diffs = executeResults.filter(Set(expectedResult) != _._2)

    def diffCnt(r: ExecuteResult): Int = diffs.map(_._2).count(_ contains r)

    val fails: Set[ExecuteResult] = diffs.map(_._2).fold(Set())(_ union _)
    val meaningfulFails = fails.filter(diffCnt(_) >= 3)
    val answer = if (meaningfulFails.isEmpty) Set(expectedResult) else meaningfulFails

    def merge(ans: Set[ExecuteResult], cur: Set[ExecuteResult]): Set[CheckResult] = {
      val ahead = ans.head
      val chead = cur.head
      val ansIsAssertions = ahead.isInstanceOf[AssertionError]
      val curIsAssertions = chead.isInstanceOf[AssertionError]
      (ansIsAssertions, curIsAssertions) match {
        case (true, true) => (cur -- ans).map(AssertionFail) ++ (ans -- cur).map(AssertionPass)
        case (true, false) => ans.map(AssertionPass) ++ (if (chead != Normal) Set(ExceptionFail(Normal, chead)) else Set())
        case (false, true) => if (ahead == Normal) cur.map(AssertionFail) else Set(ExceptionFail(ahead, Normal))
        case (false, false) => if (ahead != chead) Set(ExceptionFail(ans.head, cur.head)) else Set()
      }
    }

    val results = executeResults :+ ("spec", Set(expectedResult))
    results.map { case (e, rs) => (e, merge(answer, rs)) }.filter(_._2.nonEmpty).toMap
  }

  def execute(engine: String, filepath: String): Set[ExecuteResult] = {
    val cmd = if (engine contains "node") s"$engine --unhandled-rejections=none $filepath" else s"$engine $filepath"
    val (stdout, stderr) = executeCmd(cmd).getOrElse(("Timeout occurs.", ""))
    //TODO:  "graal" need to use node
    ExecuteResult(stdout, stderr)
  }
}

