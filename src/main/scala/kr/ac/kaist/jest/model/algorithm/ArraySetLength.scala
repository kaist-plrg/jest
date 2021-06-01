package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArraySetLength extends Algorithm {
  val name: String = "ArraySetLength"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArraySetLength" (A, Desc) => {
    if (= Desc["Value"] absent) {
      app __x0__ = (OrdinaryDefineOwnProperty A "length" Desc)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    let newLenDesc = (copy-obj Desc)
    app __x2__ = (ToUint32 Desc["Value"])
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let newLen = __x2__
    app __x3__ = (ToNumber Desc["Value"])
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let numberLen = __x3__
    if (! (== newLen numberLen)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    newLenDesc["Value"] = newLen
    app __x5__ = (OrdinaryGetOwnProperty A "length")
    let oldLenDesc = __x5__
    let oldLen = oldLenDesc["Value"]
    if (! (< newLen oldLen)) {
      app __x6__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    if (= oldLenDesc["Writable"] false) {
      app __x8__ = (WrapCompletion false)
      return __x8__
    } else {}
    if (|| (= newLenDesc["Writable"] absent) (= newLenDesc["Writable"] true)) let newWritable = true else {
      let newWritable = false
      newLenDesc["Writable"] = true
    }
    app __x9__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let succeeded = __x9__
    if (= succeeded false) {
      app __x10__ = (WrapCompletion false)
      return __x10__
    } else {}
    while (< newLen oldLen) {
      oldLen = (- oldLen 1i)
      app __x11__ = (ToString oldLen)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (A["Delete"] A __x11__)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let deleteSucceeded = __x12__
      if (= deleteSucceeded false) {
        newLenDesc["Value"] = (+ oldLen 1i)
        if (= newWritable false) newLenDesc["Writable"] = false else {}
        app __x13__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
        if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
        app __x14__ = (WrapCompletion false)
        return __x14__
      } else {}
    }
    if (= newWritable false) {
      app __x27__ = (OrdinaryDefineOwnProperty A "length" (new PropertyDescriptor("Writable" -> false)))
      app __x28__ = (WrapCompletion __x27__)
      return __x28__
    } else {}
    app __x29__ = (WrapCompletion true)
    return __x29__
  }"""), this)
}
