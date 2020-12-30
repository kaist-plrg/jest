package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ToPrimitive extends Algorithm {
  val name: String = "ToPrimitive"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToPrimitive" (input, PreferredType) => {
    app __x0__ = (Type input)
    if (= __x0__ Object) {
      if (= PreferredType absent) let hint = "default" else if (= PreferredType String) let hint = "string" else let hint = "number"
      app __x1__ = (GetMethod input SYMBOL_toPrimitive)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let exoticToPrim = __x1__
      if (! (= exoticToPrim undefined)) {
        app __x2__ = (Call exoticToPrim input (new [hint]))
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let result = __x2__
        app __x3__ = (Type result)
        if (! (= __x3__ Object)) {
          app __x4__ = (WrapCompletion result)
          return __x4__
        } else {}
        app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x5__
      } else {}
      if (= hint "default") hint = "number" else {}
      app __x6__ = (OrdinaryToPrimitive input hint)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion input)
    return __x8__
  }"""), this)
}
