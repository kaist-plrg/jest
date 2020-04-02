package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTfilter {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.filter" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (Get O "length")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (ToLength __x3__)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let len = __x4__
    app __x5__ = (IsCallable callbackfn)
    if (= __x5__ false) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    if (! (= argumentsList[1i] absent)) let T = thisArg else let T = undefined
    app __x7__ = (ArraySpeciesCreate O 0i)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let A = __x7__
    let k = 0i
    let to = 0i
    while (< k len) {
      app __x8__ = (ToString k)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let Pk = __x8__
      app __x9__ = (HasProperty O Pk)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let kPresent = __x9__
      if (= kPresent true) {
        app __x10__ = (Get O Pk)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let kValue = __x10__
        app __x11__ = (Call callbackfn T (new [kValue, k, O]))
        if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        app __x12__ = (ToBoolean __x11__)
        let selected = __x12__
        if (= selected true) {
          app __x13__ = (ToString to)
          if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
          app __x14__ = (CreateDataPropertyOrThrow A __x13__ kValue)
          if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
          __x14__
          to = (+ to 1i)
        } else {}
      } else {}
      k = (+ k 1i)
    }
    app __x15__ = (WrapCompletion A)
    return __x15__
  }""")
}
