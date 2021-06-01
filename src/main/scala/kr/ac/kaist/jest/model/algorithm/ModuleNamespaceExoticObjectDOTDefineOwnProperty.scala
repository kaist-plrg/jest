package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ModuleNamespaceExoticObjectDOTDefineOwnProperty extends Algorithm {
  val name: String = "ModuleNamespaceExoticObjectDOTDefineOwnProperty"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleNamespaceExoticObject.DefineOwnProperty" (O, P, Desc) => {
    app __x0__ = (Type P)
    if (= __x0__ Symbol) {
      app __x1__ = (OrdinaryDefineOwnProperty O P Desc)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    app __x3__ = (O["GetOwnProperty"] O P)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let current = __x3__
    if (= current undefined) {
      app __x4__ = (WrapCompletion false)
      return __x4__
    } else {}
    app __x5__ = (IsAccessorDescriptor Desc)
    if (= __x5__ true) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    if (= Desc["Writable"] false) {
      app __x7__ = (WrapCompletion false)
      return __x7__
    } else {}
    if (= Desc["Enumerable"] false) {
      app __x8__ = (WrapCompletion false)
      return __x8__
    } else {}
    if (= Desc["Configurable"] true) {
      app __x9__ = (WrapCompletion false)
      return __x9__
    } else {}
    if (! (= Desc["Value"] absent)) {
      app __x10__ = (SameValue Desc["Value"] current["Value"])
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (WrapCompletion true)
    return __x12__
  }"""), this)
}
