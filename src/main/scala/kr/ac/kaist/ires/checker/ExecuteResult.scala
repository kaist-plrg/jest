package kr.ac.kaist.ires.checker

trait ExecuteResult
case object Normal extends ExecuteResult
case class AssertionError(stdout: String) extends ExecuteResult
case object SyntaxError extends ExecuteResult
case object ReferenceError extends ExecuteResult
case object TypeError extends ExecuteResult
case object RangeError extends ExecuteResult
case object EvalError extends ExecuteResult
case object InternalError extends ExecuteResult
case object Throw extends ExecuteResult

object ExecuteResult {
  def getKind(r: ExecuteResult) = r.getClass.getSimpleName.split('$')(0)
  val results: List[ExecuteResult] = List(
    Normal,
    SyntaxError,
    ReferenceError,
    TypeError,
    RangeError,
    EvalError,
    InternalError,
    Throw
  )
  val hints = results.map(r => (s"${getKind(r)}:", r)).toMap
  def getResult(line: String): ExecuteResult = {
    var result: ExecuteResult = Throw
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

  def apply(expected: String): ExecuteResult = getResult(expected)
  def apply(stdout: String, stderr: String): Set[ExecuteResult] = {
    if (stderr.nonEmpty) Set(getResult(stderr))
    else if (stdout.nonEmpty) stdout.split("\n").map(AssertionError).toSet
    else Set(Normal)
  }
}
