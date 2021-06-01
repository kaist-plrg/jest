package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTPromiseDOTallSettledRejectElementFunctions extends Algorithm {
  val name: String = "GLOBALDOTPromiseDOTallSettledRejectElementFunctions"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Promise.allSettledRejectElementFunctions" (this, argumentsList, NewTarget) => {
    let x = argumentsList[0i]
    let F = GLOBAL_context["Function"]
    let alreadyCalled = F["AlreadyCalled"]
    if (= alreadyCalled["Value"] true) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    alreadyCalled["Value"] = true
    let index = F["Index"]
    let values = F["Values"]
    let promiseCapability = F["Capability"]
    let remainingElementsCount = F["RemainingElements"]
    app obj = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
    ! obj
    app __x1__ = (CreateDataPropertyOrThrow obj "status" "rejected")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (CreateDataPropertyOrThrow obj "reason" x)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    values[index] = obj
    remainingElementsCount["Value"] = (- remainingElementsCount["Value"] 1i)
    if (= remainingElementsCount["Value"] 0i) {
      app __x3__ = (CreateArrayFromList values)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let valuesArray = __x3__
      app __x4__ = (Call promiseCapability["Resolve"] undefined (new [valuesArray]))
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (WrapCompletion undefined)
    return __x6__
  }"""), this)
}
