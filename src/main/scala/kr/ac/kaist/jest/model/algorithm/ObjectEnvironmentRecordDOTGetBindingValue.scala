package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectEnvironmentRecordDOTGetBindingValue extends Algorithm {
  val name: String = "ObjectEnvironmentRecordDOTGetBindingValue"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectEnvironmentRecord.GetBindingValue" (this, N, S) => {
    let envRec = this
    let bindings = envRec["BindingObject"]
    app __x0__ = (HasProperty bindings N)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let value = __x0__
    if (= value false) if (= S false) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (Get bindings N)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
