package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

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
    let __x11__ = (new [])
    let __x12__ = (new [])
    let __x13__ = (new [])
    let __x14__ = (map-keys O["SubMap"])
    let __x15__ = __x14__
    let __x16__ = 0i
    while (< __x16__ __x15__["length"]) {
      let __x17__ = __x15__[__x16__]
      if (= (typeof __x17__) "Symbol") append __x17__ -> __x11__ else {
        app __x18__ = (CanonicalNumericIndexString __x17__)
        if (|| (= __x18__ undefined) (|| (< __x18__ 0.0) (< 4.294967295E9 __x18__))) append __x17__ -> __x12__ else append __x18__ -> __x13__
      }
      __x16__ = (+ __x16__ 1i)
    }
    while (< 0i __x13__["length"]) {
      let __x19__ = 0i
      let __x20__ = 0i
      while (< __x20__ __x13__["length"]) {
        if (< __x13__[__x20__] __x13__[__x19__]) __x19__ = __x20__ else {}
        __x20__ = (+ __x20__ 1i)
      }
      let __x21__ = (pop __x13__ __x19__)
      app __x22__ = (ToString __x21__)
      append __x22__ -> keys
    }
    let __x23__ = __x12__
    let __x24__ = 0i
    while (< __x24__ __x23__["length"]) {
      let __x17__ = __x23__[__x24__]
      append __x17__ -> keys
      __x24__ = (+ __x24__ 1i)
    }
    let __x25__ = __x11__
    let __x26__ = 0i
    while (< __x26__ __x25__["length"]) {
      let __x17__ = __x25__[__x26__]
      append __x17__ -> keys
      __x26__ = (+ __x26__ 1i)
    }
    return keys
    if (= newWritable false) {
      app __x27__ = (OrdinaryDefineOwnProperty A "length" (new PropertyDescriptor("Writable" -> false)))
      app __x28__ = (WrapCompletion __x27__)
      return __x28__
    } else {}
    app __x29__ = (WrapCompletion true)
    return __x29__
  }"""), this)
}
