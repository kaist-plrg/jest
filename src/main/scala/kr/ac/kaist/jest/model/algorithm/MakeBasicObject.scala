package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MakeBasicObject extends Algorithm {
  val name: String = "MakeBasicObject"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MakeBasicObject" (internalSlotsList) => {
    let obj = (new OrdinaryObject("SubMap" -> (new SubMap())))
    let __x0__ = internalSlotsList
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let __x2__ = __x0__[__x1__]
      obj[__x2__] = undefined
      __x1__ = (+ __x1__ 1i)
    }
    if (contains internalSlotsList "Extensible") obj["Extensible"] = true else {}
    app __x3__ = (WrapCompletion obj)
    return __x3__
  }"""), this)
}
