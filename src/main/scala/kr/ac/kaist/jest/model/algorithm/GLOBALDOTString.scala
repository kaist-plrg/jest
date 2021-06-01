package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTString extends Algorithm {
  val name: String = "GLOBALDOTString"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    if (= argumentsList[0i] absent) let s = "" else {
      let __x1__ = (= NewTarget undefined)
      if __x1__ {
        app __x2__ = (Type value)
        __x1__ = (= __x2__ Symbol)
      } else {}
      if __x1__ {
        app __x3__ = (SymbolDescriptiveString value)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      app __x5__ = (ToString value)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let s = __x5__
    }
    if (= NewTarget undefined) {
      app __x6__ = (WrapCompletion s)
      return __x6__
    } else {}
    app __x7__ = (GetPrototypeFromConstructor NewTarget "%String.prototype%")
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (StringCreate s __x7__)
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }"""), this)
}
