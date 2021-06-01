package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTfromCodePoint extends Algorithm {
  val name: String = "GLOBALDOTStringDOTfromCodePoint"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.fromCodePoint" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.fromCodePoint"

    !!! "Etc"
    let length = codePoints["length"]
    let elements = (new [])
    let nextIndex = 0i
    while (< nextIndex length) {
      let next = codePoints[nextIndex]
      app __x0__ = (ToNumber next)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let nextCP = __x0__
      app __x1__ = (IsInteger nextCP)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      if (= __x1__ false) {
        app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x2__
      } else {}
      if (|| (< nextCP 0i) (< 1114111i nextCP)) {
        app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x3__
      } else {}
      access __x4__ = (nextCP "UTF16Encoding")
      let __x5__ = __x4__
      let __x6__ = 0i
      while (< __x6__ __x5__["length"]) {
        let __x7__ = __x5__[__x6__]
        append __x7__ -> elements
        __x6__ = (+ __x6__ 1i)
      }
      nextIndex = (+ nextIndex 1i)
    }
    app __x8__ = (WrapCompletion !!! "StringOp")
    return __x8__
  }"""), this)
}
