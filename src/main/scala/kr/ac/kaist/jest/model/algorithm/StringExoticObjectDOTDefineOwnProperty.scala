package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StringExoticObjectDOTDefineOwnProperty extends Algorithm {
  val name: String = "StringExoticObjectDOTDefineOwnProperty"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StringExoticObject.DefineOwnProperty" (S, P, Desc) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (StringGetOwnProperty S P)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let stringDesc = __x1__
    if (! (= stringDesc undefined)) {
      let extensible = S["Extensible"]
      app __x2__ = (IsCompatiblePropertyDescriptor extensible Desc stringDesc)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (OrdinaryDefineOwnProperty S P Desc)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
