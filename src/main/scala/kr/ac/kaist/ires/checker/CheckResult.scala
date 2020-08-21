package kr.ac.kaist.ires.checker

trait CheckResult
case class ExceptionFail(expected: ExecuteResult, actual: ExecuteResult, info: String) extends CheckResult
case class AssertionFail(assertion: ExecuteResult) extends CheckResult
case class AssertionPass(assertion: ExecuteResult) extends CheckResult
