package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseDOTallResolveElementFunctions extends Algorithm {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Promise.allResolveElementFunctions" (this, argumentsList, NewTarget) => {
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
    values[index] = x
    remainingElementsCount["Value"] = (- remainingElementsCount["Value"] 1i)
    if (= remainingElementsCount["Value"] 0i) {
      app __x1__ = (CreateArrayFromList values)
      let valuesArray = __x1__
      app __x2__ = (Call promiseCapability["Resolve"] undefined (new [valuesArray]))
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }""")
}
