package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTObjectDOTgetOwnPropertyDescriptors extends Algorithm {
  val name: String = "GLOBALDOTObjectDOTgetOwnPropertyDescriptors"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Object.getOwnPropertyDescriptors" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (ToObject O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let obj = __x1__
    app __x2__ = (obj["OwnPropertyKeys"] obj)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let ownKeys = __x2__
    app descriptors = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
    ! descriptors
    let __x3__ = ownKeys
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let key = __x3__[__x4__]
      app __x5__ = (obj["GetOwnProperty"] obj key)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let desc = __x5__
      app __x6__ = (FromPropertyDescriptor desc)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let descriptor = __x6__
      if (! (= descriptor undefined)) {
        app __x7__ = (CreateDataPropertyOrThrow descriptors key descriptor)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        __x7__
      } else {}
      __x4__ = (+ __x4__ 1i)
    }
    app __x8__ = (WrapCompletion descriptors)
    return __x8__
  }"""), this)
}
