package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTlocaleCompare extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTlocaleCompare"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.localeCompare" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let that = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let reserved1 = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let reserved2 = __x2__
    app __x3__ = (RequireObjectCoercible this)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    app __x4__ = (ToString O)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let S = __x4__
    app __x5__ = (ToString that)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let That = __x5__
  }"""), this)
}
