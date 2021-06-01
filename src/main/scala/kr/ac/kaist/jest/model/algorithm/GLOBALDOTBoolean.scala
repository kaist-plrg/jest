package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTBoolean extends Algorithm {
  val name: String = "GLOBALDOTBoolean"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Boolean" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    app __x1__ = (ToBoolean value)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let b = __x1__
    if (= NewTarget undefined) {
      app __x2__ = (WrapCompletion b)
      return __x2__
    } else {}
    app __x3__ = (OrdinaryCreateFromConstructor NewTarget "%Boolean.prototype%" (new ["BooleanData"]))
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    O["BooleanData"] = b
    app __x4__ = (WrapCompletion O)
    return __x4__
  }"""), this)
}
