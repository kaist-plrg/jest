package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BoundFunctionExoticObjectDOTCall extends Algorithm {
  val name: String = "BoundFunctionExoticObjectDOTCall"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BoundFunctionExoticObject.Call" (F, thisArgument, argumentsList) => {
    let target = F["BoundTargetFunction"]
    let boundThis = F["BoundThis"]
    let boundArgs = F["BoundArguments"]
    let __x0__ = (copy-obj boundArgs)
    let __x1__ = argumentsList
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let __x3__ = __x1__[__x2__]
      append __x3__ -> __x0__
      __x2__ = (+ __x2__ 1i)
    }
    let args = __x0__
    app __x4__ = (Call target boundThis args)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
