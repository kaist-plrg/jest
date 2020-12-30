package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryObjectDOTDefineOwnProperty extends Algorithm {
  val name: String = "OrdinaryObjectDOTDefineOwnProperty"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryObject.DefineOwnProperty" (O, P, Desc) => {
    app __x0__ = (OrdinaryDefineOwnProperty O P Desc)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
