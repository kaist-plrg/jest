package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTfromCodePoint {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.String.fromCodePoint" (this, argumentsList, NewTarget) => {
    !!! "Etc"
    let length = codePoints["length"]
    let elements = (new [])
    let nextIndex = 0i
    while (< nextIndex length) {
      let next = codePoints[nextIndex]
      app __x0__ = (ToNumber next)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let nextCP = __x0__
      app __x1__ = (ToInteger nextCP)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (SameValue nextCP __x1__)
      if (= __x2__ false) {
        app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x3__
      } else {}
      if (|| (< nextCP 0i) (< 1114111i nextCP)) {
        app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x4__
      } else {}
      access __x5__ = (nextCP "UTF16Encoding")
      let __x6__ = __x5__
      let __x7__ = 0i
      while (< __x7__ __x6__["length"]) {
        let __x8__ = __x6__[__x7__]
        append __x8__ -> elements
        __x7__ = (+ __x7__ 1i)
      }
      nextIndex = (+ nextIndex 1i)
    }
    app __x9__ = (WrapCompletion !!! "StringOp")
    return __x9__
  }""")
}
