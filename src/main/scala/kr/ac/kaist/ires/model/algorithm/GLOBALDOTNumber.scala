package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumber extends Algorithm {
  val name: String = "GLOBALDOTNumber"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Number" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    if (= argumentsList["length"] 0i) let n = 0i else {
      app __x1__ = (ToNumber value)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let n = __x1__
    }
    if (= NewTarget undefined) {
      app __x2__ = (WrapCompletion n)
      return __x2__
    } else {}
    app __x3__ = (OrdinaryCreateFromConstructor NewTarget INTRINSIC_NumberPrototype (new ["NumberData"]))
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    O["NumberData"] = n
    app __x4__ = (WrapCompletion O)
    return __x4__
  }"""), this)
}
