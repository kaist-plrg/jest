package kr.ac.kaist.jest.checker

trait CheckResult
case class ExceptionFail(expected: ExecuteResult, actual: ExecuteResult, feature: String) extends CheckResult
case class AssertionFail(assertion: ExecuteResult, feature: String) extends CheckResult
case class AssertionPass(assertion: ExecuteResult, feature: String) extends CheckResult
