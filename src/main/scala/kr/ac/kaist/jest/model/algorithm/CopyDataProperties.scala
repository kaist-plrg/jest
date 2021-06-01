package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CopyDataProperties extends Algorithm {
  val name: String = "CopyDataProperties"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CopyDataProperties" (target, source, excludedItems) => {
    app __x0__ = (Type target)
    assert (= __x0__ Object)
    if (|| (= source undefined) (= source null)) {
      app __x1__ = (WrapCompletion target)
      return __x1__
    } else {}
    app __x2__ = (ToObject source)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let from = __x2__
    app __x3__ = (from["OwnPropertyKeys"] from)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let keys = __x3__
    let __x4__ = keys
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let nextKey = __x4__[__x5__]
      let excluded = false
      let __x6__ = excludedItems
      let __x7__ = 0i
      while (< __x7__ __x6__["length"]) {
        let e = __x6__[__x7__]
        app __x8__ = (SameValue e nextKey)
        if (= __x8__ true) excluded = true else {}
        __x7__ = (+ __x7__ 1i)
      }
      if (= excluded false) {
        app __x9__ = (from["GetOwnProperty"] from nextKey)
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        let desc = __x9__
        if (&& (! (= desc undefined)) (= desc["Enumerable"] true)) {
          app __x10__ = (Get from nextKey)
          if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          let propValue = __x10__
          app __x11__ = (CreateDataPropertyOrThrow target nextKey propValue)
          if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          __x11__
        } else {}
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x12__ = (WrapCompletion target)
    return __x12__
  }"""), this)
}
