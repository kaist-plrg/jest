package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SetIntegrityLevel extends Algorithm {
  val name: String = "SetIntegrityLevel"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SetIntegrityLevel" (O, level) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    assert (|| (= level CONST_sealed) (= level CONST_frozen))
    app __x1__ = (O["PreventExtensions"] O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let status = __x1__
    if (= status false) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (O["OwnPropertyKeys"] O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let keys = __x3__
    if (= level CONST_sealed) {
      let __x4__ = keys
      let __x5__ = 0i
      while (< __x5__ __x4__["length"]) {
        let k = __x4__[__x5__]
        app __x6__ = (DefinePropertyOrThrow O k (new PropertyDescriptor("Configurable" -> false)))
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        __x6__
        __x5__ = (+ __x5__ 1i)
      }
    } else {
      assert (= level CONST_frozen)
      let __x7__ = keys
      let __x8__ = 0i
      while (< __x8__ __x7__["length"]) {
        let k = __x7__[__x8__]
        app __x9__ = (O["GetOwnProperty"] O k)
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        let currentDesc = __x9__
        if (! (= currentDesc undefined)) {
          app __x10__ = (IsAccessorDescriptor currentDesc)
          if (= __x10__ true) let desc = (new PropertyDescriptor("Configurable" -> false)) else let desc = (new PropertyDescriptor("Configurable" -> false, "Writable" -> false))
          app __x11__ = (DefinePropertyOrThrow O k desc)
          if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          __x11__
        } else {}
        __x8__ = (+ __x8__ 1i)
      }
    }
    app __x12__ = (WrapCompletion true)
    return __x12__
  }"""), this)
}
