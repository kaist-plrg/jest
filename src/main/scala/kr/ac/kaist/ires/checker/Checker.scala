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

  /*
  def check_all(filepath):
  # concat helper.js
  temppath = "_81204d72cd_temp.js"
  with open("helper.js", "r") as helper:
    with open(filepath, "r") as script:
      with open(temppath, "w") as temp:
        script_content = script.read()
        # read first line and get expected output
        expected = script_content.splitlines()[0][2:]
        ires_output = ExecutionResult.get_expected(expected)
        # write temp.js
        temp.write(helper.read() + '\n' + script_content)
  # execute script in each engines
  # engines = ["js", "qjs", "xst", "node"]
  engines = ["GRAAL", "QJS", "MODDABLE", "V8"]
  hr = "-" * 60
  check_str = "{}\n[{}]\n{}\n\n".format(hr, filepath, script_content)
  check_str += "[Expected]: {}\n\n".format(ires_output)
  diff_cnt = 0
  for engine in engines:
    engine_output = check(engine, temppath)
    # engine_output = ExecutionResult.get(out, err)
    if engine_output.need_print(ires_output):
      check_str += "[{}]: {}".format(engine, engine_output)
      diff_cnt += 1
  check_str += "\ndiff_cnt: %d\n"%diff_cnt
  check_str += hr
  # print if something different
  if diff_cnt > 0:
    print(check_str)
  # remove temp.js
  os.remove(temppath)
*/
}

