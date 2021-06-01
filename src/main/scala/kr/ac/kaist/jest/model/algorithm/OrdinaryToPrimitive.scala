package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryToPrimitive extends Algorithm {
  val name: String = "OrdinaryToPrimitive"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryToPrimitive" (O, hint) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    if (= hint "string") let methodNames = (new ["toString", "valueOf"]) else let methodNames = (new ["valueOf", "toString"])
    let __x1__ = methodNames
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let name = __x1__[__x2__]
      app __x3__ = (Get O name)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let method = __x3__
      app __x4__ = (IsCallable method)
      if (= __x4__ true) {
        app __x5__ = (Call method O)
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        let result = __x5__
        app __x6__ = (Type result)
        if (! (= __x6__ Object)) {
          app __x7__ = (WrapCompletion result)
          return __x7__
        } else {}
      } else {}
      __x2__ = (+ __x2__ 1i)
    }
    app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x8__
  }"""), this)
}
