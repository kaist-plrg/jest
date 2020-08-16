package kr.ac.kaist.ires.checker

trait Result
case object Pass extends Result
case class AssertionFail(msg: String) extends Result
case object SyntaxError extends Result
case object ReferenceError extends Result
case object TypeError extends Result
case object RangeError extends Result
case object EvalError extends Result
case object InternalError extends Result
case object Throw extends Result

object Result {
  def getKind(r: Result) = r.getClass.getSimpleName.split('$')(0)
  val results: List[Result] = List(
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
  def getResult(line: String): Result = {
    var result: Result = Throw
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

  def apply(expected: String): Result = getResult(expected)
  def apply(stdout: String, stderr: String): Set[Result] = {
    if (stdout.nonEmpty)
      stdout.split("\n").map(AssertionFail(_)).toSet
    else if (stderr.nonEmpty && !(stderr contains "UnhandledPromiseRejectionWarning"))
      Set(getResult(stderr))
    else
      Set(Pass)
  }
}
