package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArgumentsExoticObjectDOTSet extends Algorithm {
  val name: String = "ArgumentsExoticObjectDOTSet"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArgumentsExoticObject.Set" (args, P, V, Receiver) => {
    let args = args
    app __x0__ = (SameValue args Receiver)
    if (= __x0__ false) let isMapped = false else {
      let map = args["ParameterMap"]
      app __x1__ = (HasOwnProperty map P)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let isMapped = __x1__
    }
    if (= isMapped true) {
      app __x2__ = (Set map P V false)
      let setStatus = __x2__
    } else {}
    app __x3__ = (OrdinarySet args P V Receiver)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
