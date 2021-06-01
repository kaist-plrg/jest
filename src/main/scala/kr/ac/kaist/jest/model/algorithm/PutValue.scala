package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PutValue extends Algorithm {
  val name: String = "PutValue"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PutValue" (V, W) => {
    if (is-completion V) if (= V["Type"] CONST_normal) V = V["Value"] else return V else {}
    V
    if (is-completion W) if (= W["Type"] CONST_normal) W = W["Value"] else return W else {}
    W
    app __x0__ = (Type V)
    if (! (= __x0__ Reference)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (GetBase V)
    let base = __x2__
    app __x3__ = (IsUnresolvableReference V)
    if (= __x3__ true) {
      app __x4__ = (IsStrictReference V)
      if (= __x4__ true) {
        app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x5__
      } else {}
      app __x6__ = (GetGlobalObject )
      let globalObj = __x6__
      app __x7__ = (GetReferencedName V)
      app __x8__ = (Set globalObj __x7__ W false)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {
      app __x10__ = (IsPropertyReference V)
      if (= __x10__ true) {
        app __x11__ = (HasPrimitiveBase V)
        if (= __x11__ true) {
          app __x12__ = (ToObject base)
          if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
          base = __x12__
        } else {}
        app __x13__ = (GetReferencedName V)
        app __x14__ = (GetThisValue V)
        app __x15__ = (base["Set"] base __x13__ W __x14__)
        if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        let succeeded = __x15__
        let __x16__ = (= succeeded false)
        if __x16__ {
          app __x17__ = (IsStrictReference V)
          __x16__ = (= __x17__ true)
        } else {}
        if __x16__ {
          app __x18__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x18__
        } else {}
        app __x19__ = (NormalCompletion undefined)
        return __x19__
      } else {
        app __x20__ = (GetReferencedName V)
        app __x21__ = (IsStrictReference V)
        app __x22__ = (base["SetMutableBinding"] base __x20__ W __x21__)
        if (is-completion __x22__) if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
        app __x23__ = (WrapCompletion __x22__)
        return __x23__
      }
    }
  }"""), this)
}
