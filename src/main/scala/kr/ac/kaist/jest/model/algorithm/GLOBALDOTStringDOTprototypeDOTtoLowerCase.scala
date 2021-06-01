package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTtoLowerCase extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTtoLowerCase"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.toLowerCase" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.prototype.toLowerCase"

    app __x0__ = (RequireObjectCoercible this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (ToString O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    app __x2__ = (UTF16DecodeString S)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let sText = __x2__
    !!! "Let id:{lowerText} be the result of toLowercase ( id:{sText} ) , according to the Unicode Default Case Conversion algorithm ."
    app __x3__ = (UTF16Encode lowerText)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let L = __x3__
    app __x4__ = (WrapCompletion L)
    return __x4__
  }"""), this)
}
