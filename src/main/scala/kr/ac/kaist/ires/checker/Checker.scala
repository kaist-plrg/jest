package kr.ac.kaist.ires.checker

import kr.ac.kaist.ires.util.Useful._

import spray.json._

case class Checker(filename: String, engines: List[String], expected: String, debug: Boolean) {
  val result: Map[String, Set[Result]] = {
    val executeResults: List[(String, Set[Result])] = engines.map(e => (e, execute(e, filename)))
    val expectedResult: Result = Result(expected)

    val diffs = executeResults.filter(Set(expectedResult) != _._2)
    if (diffs.size >= 3) {
      val first = diffs(0)._2
      val intersection = diffs.map(_._2).foldLeft(first)(_ intersect _)

      (diffs.map { case (e, s) => (e, s -- intersection) } :+ ("spec", intersection)).toMap
    } else diffs.toMap
  }

  def execute(engine: String, filepath: String): Set[Result] = {
    val (stdout, stderr) = executeCmd(s"$engine $filepath")
    //TODO:  "graal" need to use node
    Result(stdout, stderr)
  }
}

