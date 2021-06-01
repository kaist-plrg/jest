package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTconcat extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTconcat"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.concat" (this, argumentsList, NewTarget) => {
    app __x0__ = (RequireObjectCoercible this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (ToString O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    let args = argumentsList
    let R = S
    while (< 0i args["length"]) {
      let next = (pop args 0i)
      app __x2__ = (ToString next)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let nextString = __x2__
      R = (+ R nextString)
    }
    app __x3__ = (WrapCompletion R)
    return __x3__
  }"""), this)
}
