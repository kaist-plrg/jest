package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArgumentsExoticObjectDOTDelete extends Algorithm {
  val name: String = "ArgumentsExoticObjectDOTDelete"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArgumentsExoticObject.Delete" (args, P) => {
    let args = args
    let map = args["ParameterMap"]
    app __x0__ = (HasOwnProperty map P)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let isMapped = __x0__
    app __x1__ = (OrdinaryDelete args P)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let result = __x1__
    if (&& (= result true) (= isMapped true)) {
      app __x2__ = (map["Delete"] map P)
      __x2__
    } else {}
    app __x3__ = (WrapCompletion result)
    return __x3__
  }"""), this)
}
