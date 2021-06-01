package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTErrorDOTprototypeDOTtoString extends Algorithm {
  val name: String = "GLOBALDOTErrorDOTprototypeDOTtoString"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Error.prototype.toString" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (Get O "name")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let name = __x2__
    if (= name undefined) name = "Error" else {
      app __x3__ = (ToString name)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      name = __x3__
    }
    app __x4__ = (Get O "message")
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let msg = __x4__
    if (= msg undefined) msg = "" else {
      app __x5__ = (ToString msg)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      msg = __x5__
    }
    if (= name "") {
      app __x6__ = (WrapCompletion msg)
      return __x6__
    } else {}
    if (= msg "") {
      app __x7__ = (WrapCompletion name)
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion (+ (+ (+ name ":") " ") msg))
    return __x8__
  }"""), this)
}
