package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArgumentsExoticObjectDOTDefineOwnProperty extends Algorithm {
  val name: String = "ArgumentsExoticObjectDOTDefineOwnProperty"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArgumentsExoticObject.DefineOwnProperty" (args, P, Desc) => {
    let args = args
    let map = args["ParameterMap"]
    app __x0__ = (HasOwnProperty map P)
    let isMapped = __x0__
    let newArgDesc = Desc
    let __x1__ = (= isMapped true)
    if __x1__ {
      app __x2__ = (IsDataDescriptor Desc)
      __x1__ = (= __x2__ true)
    } else {}
    if __x1__ if (&& (= Desc["Value"] absent) (= Desc["Writable"] false)) {
      newArgDesc = (copy-obj Desc)
      app __x3__ = (Get map P)
      newArgDesc["Value"] = __x3__
    } else {} else {}
    app __x4__ = (OrdinaryDefineOwnProperty args P newArgDesc)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let allowed = __x4__
    if (= allowed false) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {}
    if (= isMapped true) {
      app __x6__ = (IsAccessorDescriptor Desc)
      if (= __x6__ true) {
        app __x7__ = (map["Delete"] map P)
        __x7__
      } else {
        if (! (= Desc["Value"] absent)) {
          app __x8__ = (Set map P Desc["Value"] false)
          let setStatus = __x8__
        } else {}
        if (= Desc["Writable"] false) {
          app __x9__ = (map["Delete"] map P)
          __x9__
        } else {}
      }
    } else {}
    app __x10__ = (WrapCompletion true)
    return __x10__
  }"""), this)
}
