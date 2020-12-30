package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTnormalize extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTnormalize"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.normalize" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let form = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (ToString O)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let S = __x2__
    if (= form undefined) let f = "NFC" else {
      app __x3__ = (ToString form)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let f = __x3__
    }
    if (= f "NFC") {
      let ns = S.normNFC
    } else if (= f "NFD") {
      let ns = S.normNFD
    } else if (= f "NFKC") {
      let ns = S.normNFKC
    } else if (= f "NFKD") {
      let ns = S.normNFKD
    } else throw RangeError
    app __x5__ = (WrapCompletion ns)
    return __x5__
  }"""), this)
}
