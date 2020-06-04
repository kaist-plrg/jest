package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTlastIndexOf extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.String.prototype.lastIndexOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchString = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let position = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    app __x4__ = (ToString searchString)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let searchStr = __x4__
    app __x5__ = (ToNumber position)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let numPos = __x5__
    if (= numPos NaN) let pos = Infinity else {
      app __x6__ = (ToInteger numPos)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let pos = __x6__
    }
    let len = S["length"]
    app __x7__ = (max pos 0i)
    app __x8__ = (min __x7__ len)
    let start = __x8__
    let searchLen = searchStr["length"]
    app __x9__ = (WrapCompletion !!! "NumberOp")
    return __x9__
  }""")
}
