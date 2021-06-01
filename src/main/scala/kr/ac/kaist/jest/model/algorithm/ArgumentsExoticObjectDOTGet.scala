package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArgumentsExoticObjectDOTGet extends Algorithm {
  val name: String = "ArgumentsExoticObjectDOTGet"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArgumentsExoticObject.Get" (args, P, Receiver) => {
    let args = args
    let map = args["ParameterMap"]
    app __x0__ = (HasOwnProperty map P)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let isMapped = __x0__
    if (= isMapped false) {
      app __x1__ = (OrdinaryGet args P Receiver)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {
      app __x3__ = (Get map P)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    }
  }"""), this)
}
