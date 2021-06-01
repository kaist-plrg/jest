package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetValue extends Algorithm {
  val name: String = "GetValue"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetValue" (V) => {
    if (is-completion V) if (= V["Type"] CONST_normal) V = V["Value"] else return V else {}
    V
    app __x0__ = (Type V)
    if (! (= __x0__ Reference)) {
      app __x1__ = (WrapCompletion V)
      return __x1__
    } else {}
    app __x2__ = (GetBase V)
    let base = __x2__
    app __x3__ = (IsUnresolvableReference V)
    if (= __x3__ true) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (IsPropertyReference V)
    if (= __x5__ true) {
      app __x6__ = (HasPrimitiveBase V)
      if (= __x6__ true) {
        app __x7__ = (ToObject base)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        base = __x7__
      } else {}
      app __x8__ = (GetReferencedName V)
      app __x9__ = (GetThisValue V)
      app __x10__ = (base["Get"] base __x8__ __x9__)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {
      app __x12__ = (GetReferencedName V)
      app __x13__ = (IsStrictReference V)
      app __x14__ = (base["GetBindingValue"] base __x12__ __x13__)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (WrapCompletion __x14__)
      return __x15__
    }
  }"""), this)
}
