package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AddRestrictedFunctionProperties extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""AddRestrictedFunctionProperties" (F, realm) => {
    let thrower = realm["Intrinsics"]["INTRINSIC_ThrowTypeError"]
    app __x0__ = (DefinePropertyOrThrow F "caller" (new PropertyDescriptor("Get" -> thrower, "Set" -> thrower, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (DefinePropertyOrThrow F "arguments" (new PropertyDescriptor("Get" -> thrower, "Set" -> thrower, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
