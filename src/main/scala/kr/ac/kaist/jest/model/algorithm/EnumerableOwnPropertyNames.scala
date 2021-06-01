package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object EnumerableOwnPropertyNames extends Algorithm {
  val name: String = "EnumerableOwnPropertyNames"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""EnumerableOwnPropertyNames" (O, kind) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    app __x1__ = (O["OwnPropertyKeys"] O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let ownKeys = __x1__
    let properties = (new [])
    let __x2__ = ownKeys
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let key = __x2__[__x3__]
      app __x4__ = (Type key)
      if (= __x4__ String) {
        app __x5__ = (O["GetOwnProperty"] O key)
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        let desc = __x5__
        if (&& (! (= desc undefined)) (= desc["Enumerable"] true)) if (= kind CONST_key) append key -> properties else {
          app __x6__ = (Get O key)
          if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          let value = __x6__
          if (= kind CONST_value) append value -> properties else {
            assert (= kind CONST_keyPLUSvalue)
            app __x7__ = (CreateArrayFromList (new [key, value]))
            if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
            let entry = __x7__
            append entry -> properties
          }
        } else {}
      } else {}
      __x3__ = (+ __x3__ 1i)
    }
    app __x8__ = (WrapCompletion properties)
    return __x8__
  }"""), this)
}
