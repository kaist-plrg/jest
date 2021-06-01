package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UnaryExpression1Evaluation0 extends Algorithm {
  val name: String = "UnaryExpression1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UnaryExpression1Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let ref = __x0__
    if (is-completion ref) if (= ref["Type"] CONST_normal) ref = ref["Value"] else return ref else {}
    ref
    app __x1__ = (Type ref)
    if (! (= __x1__ Reference)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (IsUnresolvableReference ref)
    if (= __x3__ true) {
      app __x4__ = (IsStrictReference ref)
      assert (= __x4__ false)
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    app __x6__ = (IsPropertyReference ref)
    if (= __x6__ true) {
      app __x7__ = (IsSuperReference ref)
      if (= __x7__ true) {
        app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x8__
      } else {}
      app __x9__ = (GetBase ref)
      app __x10__ = (ToObject __x9__)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let baseObj = __x10__
      app __x11__ = (GetReferencedName ref)
      app __x12__ = (baseObj["Delete"] baseObj __x11__)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let deleteStatus = __x12__
      let __x13__ = (= deleteStatus false)
      if __x13__ {
        app __x14__ = (IsStrictReference ref)
        __x13__ = (= __x14__ true)
      } else {}
      if __x13__ {
        app __x15__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x15__
      } else {}
      app __x16__ = (WrapCompletion deleteStatus)
      return __x16__
    } else {
      app __x17__ = (GetBase ref)
      let bindings = __x17__
      app __x18__ = (GetReferencedName ref)
      app __x19__ = (bindings["DeleteBinding"] bindings __x18__)
      if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      app __x20__ = (WrapCompletion __x19__)
      return __x20__
    }
  }"""), this)
}
