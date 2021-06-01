package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArray extends Algorithm {
  val name: String = "GLOBALDOTArray"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array" (this, argumentsList, NewTarget) => if (== argumentsList["length"] 0i) {
    let numberOfArgs = argumentsList["length"]
    assert (== numberOfArgs 0i)
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x0__ = (GetPrototypeFromConstructor newTarget "%Array.prototype%")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let proto = __x0__
    app __x1__ = (ArrayCreate 0i proto)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  } else if (== argumentsList["length"] 1i) {
    app __x3__ = (GetArgument argumentsList 0i)
    let len = __x3__
    let numberOfArgs = argumentsList["length"]
    assert (== numberOfArgs 1i)
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x4__ = (GetPrototypeFromConstructor newTarget "%Array.prototype%")
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let proto = __x4__
    app __x5__ = (ArrayCreate 0i proto)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let array = __x5__
    app __x6__ = (Type len)
    if (! (= __x6__ Number)) {
      app __x7__ = (CreateDataPropertyOrThrow array "0" len)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      __x7__
      let intLen = 1i
    } else {
      app __x8__ = (ToUint32 len)
      let intLen = __x8__
      if (! (== intLen len)) {
        app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x9__
      } else {}
    }
    app __x10__ = (Set array "length" intLen true)
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    __x10__
    app __x11__ = (WrapCompletion array)
    return __x11__
  } else {
    let numberOfArgs = argumentsList["length"]
    assert (! (< numberOfArgs 2i))
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x12__ = (GetPrototypeFromConstructor newTarget "%Array.prototype%")
    if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let proto = __x12__
    app __x13__ = (ArrayCreate numberOfArgs proto)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let array = __x13__
    let k = 0i
    let items = argumentsList
    while (< k numberOfArgs) {
      app __x14__ = (ToString k)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let Pk = __x14__
      let itemK = items[k]
      app __x15__ = (CreateDataPropertyOrThrow array Pk itemK)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x15__
      k = (+ k 1i)
    }
    app __x16__ = (WrapCompletion array)
    return __x16__
  }"""), this)
}
