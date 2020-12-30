package kr.ac.kaist.jest.checker

trait ExecuteResult
case object Normal extends ExecuteResult
case class AssertionError(stdout: String) extends ExecuteResult
case object SyntaxError extends ExecuteResult
case object ReferenceError extends ExecuteResult
case object TypeError extends ExecuteResult
case object RangeError extends ExecuteResult
case object EvalError extends ExecuteResult
case object InternalError extends ExecuteResult
case object TimeoutError extends ExecuteResult
case class IRError(uid: Int) extends ExecuteResult
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
    TimeoutError,
    IRError(0),
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

    // IRError -> insert uid
    if (result.isInstanceOf[IRError]) {
      val uid = line.filter(c => '0' <= c && c <= '9').toInt
      result = IRError(uid)
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
