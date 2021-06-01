package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object TestIntegrityLevel extends Algorithm {
  val name: String = "TestIntegrityLevel"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TestIntegrityLevel" (O, level) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    assert (|| (= level CONST_sealed) (= level CONST_frozen))
    app __x1__ = (IsExtensible O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let extensible = __x1__
    if (= extensible true) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (O["OwnPropertyKeys"] O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let keys = __x3__
    let __x4__ = keys
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let k = __x4__[__x5__]
      app __x6__ = (O["GetOwnProperty"] O k)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let currentDesc = __x6__
      if (! (= currentDesc undefined)) {
        if (= currentDesc["Configurable"] true) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        let __x8__ = (= level CONST_frozen)
        if __x8__ {
          app __x9__ = (IsDataDescriptor currentDesc)
          __x8__ = (= __x9__ true)
        } else {}
        if __x8__ if (= currentDesc["Writable"] true) {
          app __x10__ = (WrapCompletion false)
          return __x10__
        } else {} else {}
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x11__ = (WrapCompletion true)
    return __x11__
  }"""), this)
}
