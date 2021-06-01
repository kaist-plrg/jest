package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BoundFunctionExoticObjectDOTConstruct extends Algorithm {
  val name: String = "BoundFunctionExoticObjectDOTConstruct"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BoundFunctionExoticObject.Construct" (F, argumentsList, newTarget) => {
    let target = F["BoundTargetFunction"]
    app __x0__ = (IsConstructor target)
    assert (= __x0__ true)
    let boundArgs = F["BoundArguments"]
    let __x1__ = (copy-obj boundArgs)
    let __x2__ = argumentsList
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> __x1__
      __x3__ = (+ __x3__ 1i)
    }
    let args = __x1__
    app __x5__ = (SameValue F newTarget)
    if (= __x5__ true) newTarget = target else {}
    app __x6__ = (Construct target args newTarget)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""), this)
}
