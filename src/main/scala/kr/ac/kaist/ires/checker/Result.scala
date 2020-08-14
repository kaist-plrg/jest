package kr.ac.kaist.ires.checker

/*
case class Result(a: Int, b: Int)
object ResultJsonProtocol extends DefaultJsonProtocol {
  implicit val ResultFormat = jsonFormat2(Result)
}
*/
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

object Result extends Result {
  val errors = List(SyntaxError, ReferenceError, TypeError, RangeError, EvalError, InternalError)
  val str2err = errors.map(e => (e.getClass.getSimpleName.split('$')(0) + ":", e)).toMap
  val str2result = str2err ++ Map("Normal:" -> Pass, "Throw" -> Throw)

  def getResult(line: String): Result = {
    var result: Option[Result] = None
    var index: Int = -1

    str2result.foreach {
      case (s, r) =>
        val curIndex = line.indexOfSlice(s)
        if (curIndex >= 0) {
          if (index < 0 || curIndex < index) {
            index = curIndex
            result = Some(r)
          }
        }
    }

    result match {
      case None => ???
      case Some(r) => r
    }
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
