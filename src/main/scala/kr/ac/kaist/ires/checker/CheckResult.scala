package kr.ac.kaist.ires.checker

trait CheckResult
case object Pass extends CheckResult
case class AssertionFail(msg: String) extends CheckResult
case object SyntaxError extends CheckResult
case object ReferenceError extends CheckResult
case object TypeError extends CheckResult
case object RangeError extends CheckResult
case object EvalError extends CheckResult
case object InternalError extends CheckResult
case object Throw extends CheckResult

object CheckResult {
  def getKind(r: CheckResult) = r.getClass.getSimpleName.split('$')(0)
  val results: List[CheckResult] = List(
    Pass,
    SyntaxError,
    ReferenceError,
    TypeError,
    RangeError,
    EvalError,
    InternalError,
    Throw
  )
  val hints = results.map(r => (s"${getKind(r)}:", r)).toMap
  def getResult(line: String): CheckResult = {
    var result: CheckResult = Throw
    var index: Int = -1

    hints.foreach {
      case (hint, res) =>
        val curIndex = line.indexOfSlice(hint)
        if (curIndex >= 0 && (index < 0 || curIndex < index)) {
          index = curIndex
          result = res
        }
    }

    result
  }

  def apply(expected: String): CheckResult = getResult(expected)
  def apply(stdout: String, stderr: String): Set[CheckResult] = {
    if (stdout.nonEmpty)
      stdout.split("\n").map(AssertionFail(_)).toSet
    else if (stderr.nonEmpty && !(stderr contains "UnhandledPromiseRejectionWarning"))
      Set(getResult(stderr))
    else
      Set(Pass)
  }
}
