package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayExoticObjectDOTDefineOwnProperty extends Algorithm {
  val name: String = "ArrayExoticObjectDOTDefineOwnProperty"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayExoticObject.DefineOwnProperty" (A, P, Desc) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    if (= P "length") {
      app __x1__ = (ArraySetLength A Desc)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {
      app __x3__ = (IsArrayIndex P)
      if __x3__ {
        app __x4__ = (OrdinaryGetOwnProperty A "length")
        let oldLenDesc = __x4__
        let oldLen = oldLenDesc["Value"]
        app __x5__ = (IsNonNegativeInteger oldLen)
        assert (= __x5__ true)
        app __x6__ = (ToUint32 P)
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        let index = __x6__
        if (&& (! (< index oldLen)) (= oldLenDesc["Writable"] false)) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        app __x8__ = (OrdinaryDefineOwnProperty A P Desc)
        if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let succeeded = __x8__
        if (= succeeded false) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {}
        if (! (< index oldLen)) {
          oldLenDesc["Value"] = (+ index 1i)
          app __x10__ = (OrdinaryDefineOwnProperty A "length" oldLenDesc)
          let succeeded = __x10__
          assert (= succeeded true)
        } else {}
        app __x11__ = (WrapCompletion true)
        return __x11__
      } else {}
    }
    app __x12__ = (OrdinaryDefineOwnProperty A P Desc)
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }"""), this)
}
