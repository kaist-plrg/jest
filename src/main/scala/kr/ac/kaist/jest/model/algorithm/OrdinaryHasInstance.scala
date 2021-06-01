package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryHasInstance extends Algorithm {
  val name: String = "OrdinaryHasInstance"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryHasInstance" (C, O) => {
    app __x0__ = (IsCallable C)
    if (= __x0__ false) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (! (= C["BoundTargetFunction"] absent)) {
      let BC = C["BoundTargetFunction"]
      app __x2__ = (InstanceofOperator O BC)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Type O)
    if (! (= __x4__ Object)) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {}
    app __x6__ = (Get C "prototype")
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let P = __x6__
    app __x7__ = (Type P)
    if (! (= __x7__ Object)) {
      app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x8__
    } else {}
    while true {
      app __x9__ = (O["GetPrototypeOf"] O)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      O = __x9__
      if (= O null) {
        app __x10__ = (WrapCompletion false)
        return __x10__
      } else {}
      app __x11__ = (SameValue P O)
      if (= __x11__ true) {
        app __x12__ = (WrapCompletion true)
        return __x12__
      } else {}
    }
  }"""), this)
}
