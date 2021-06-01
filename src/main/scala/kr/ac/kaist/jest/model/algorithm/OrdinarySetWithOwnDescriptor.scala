package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinarySetWithOwnDescriptor extends Algorithm {
  val name: String = "OrdinarySetWithOwnDescriptor"
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinarySetWithOwnDescriptor" (O, P, V, Receiver, ownDesc) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    if (= ownDesc undefined) {
      app __x1__ = (O["GetPrototypeOf"] O)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let parent = __x1__
      if (! (= parent null)) {
        app __x2__ = (parent["Set"] parent P V Receiver)
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        app __x3__ = (WrapCompletion __x2__)
        return __x3__
      } else ownDesc = (new PropertyDescriptor("Value" -> undefined, "Writable" -> true, "Enumerable" -> true, "Configurable" -> true))
    } else {}
    app __x4__ = (IsDataDescriptor ownDesc)
    if (= __x4__ true) {
      if (= ownDesc["Writable"] false) {
        app __x5__ = (WrapCompletion false)
        return __x5__
      } else {}
      app __x6__ = (Type Receiver)
      if (! (= __x6__ Object)) {
        app __x7__ = (WrapCompletion false)
        return __x7__
      } else {}
      app __x8__ = (Receiver["GetOwnProperty"] Receiver P)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let existingDescriptor = __x8__
      if (! (= existingDescriptor undefined)) {
        app __x9__ = (IsAccessorDescriptor existingDescriptor)
        if (= __x9__ true) {
          app __x10__ = (WrapCompletion false)
          return __x10__
        } else {}
        if (= existingDescriptor["Writable"] false) {
          app __x11__ = (WrapCompletion false)
          return __x11__
        } else {}
        let valueDesc = (new PropertyDescriptor("Value" -> V))
        app __x12__ = (Receiver["DefineOwnProperty"] Receiver P valueDesc)
        if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        app __x13__ = (WrapCompletion __x12__)
        return __x13__
      } else {
        app __x14__ = (CreateDataProperty Receiver P V)
        if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        app __x15__ = (WrapCompletion __x14__)
        return __x15__
      }
    } else {}
    app __x16__ = (IsAccessorDescriptor ownDesc)
    assert (= __x16__ true)
    let setter = ownDesc["Set"]
    if (= setter undefined) {
      app __x17__ = (WrapCompletion false)
      return __x17__
    } else {}
    app __x18__ = (Call setter Receiver (new [V]))
    if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
    __x18__
    app __x19__ = (WrapCompletion true)
    return __x19__
  }"""), this)
}
