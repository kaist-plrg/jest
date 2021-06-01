package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectDefineProperties extends Algorithm {
  val name: String = "ObjectDefineProperties"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""ObjectDefineProperties" (O, Properties) => {
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (ToObject Properties)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let props = __x2__
    app __x3__ = (props["OwnPropertyKeys"] props)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let keys = __x3__
    let descriptors = (new [])
    let __x4__ = keys
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let nextKey = __x4__[__x5__]
      app __x6__ = (props["GetOwnProperty"] props nextKey)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let propDesc = __x6__
      if (&& (! (= propDesc undefined)) (= propDesc["Enumerable"] true)) {
        app __x7__ = (Get props nextKey)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let descObj = __x7__
        app __x8__ = (ToPropertyDescriptor descObj)
        if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let desc = __x8__
        append (new [nextKey, desc]) -> descriptors
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    let __x9__ = descriptors
    let __x10__ = 0i
    while (< __x10__ __x9__["length"]) {
      let pair = __x9__[__x10__]
      let P = pair[0i]
      let desc = pair[1i]
      app __x11__ = (DefinePropertyOrThrow O P desc)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      __x10__ = (+ __x10__ 1i)
    }
    app __x12__ = (WrapCompletion O)
    return __x12__
  }"""), this)
}
