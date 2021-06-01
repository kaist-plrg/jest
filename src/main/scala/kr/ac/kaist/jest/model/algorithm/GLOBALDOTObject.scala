package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTObject extends Algorithm {
  val name: String = "GLOBALDOTObject"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Object" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    if (! (|| (= NewTarget undefined) (= NewTarget GLOBAL_context["Function"]))) {
      app __x1__ = (OrdinaryCreateFromConstructor NewTarget "%Object.prototype%")
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    if (|| (= value undefined) (= value null)) {
      app obj = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
      return obj
    } else {}
    app __x3__ = (ToObject value)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
