package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTconcat extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTconcat"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.concat" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (ArraySpeciesCreate O 0i)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let A = __x1__
    let n = 0i
    prepend O -> argumentsList
    let items = argumentsList
    while (< 0i items["length"]) {
      let E = (pop items 0i)
      app __x2__ = (IsConcatSpreadable E)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let spreadable = __x2__
      if (= spreadable true) {
        let k = 0i
        app __x3__ = (LengthOfArrayLike E)
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        let len = __x3__
        if (< (- 9007199254740992i 1i) (+ n len)) {
          app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x4__
        } else {}
        while (< k len) {
          app __x5__ = (ToString k)
          if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          let P = __x5__
          app __x6__ = (HasProperty E P)
          if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          let exists = __x6__
          if (= exists true) {
            app __x7__ = (Get E P)
            if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
            let subElement = __x7__
            app __x8__ = (ToString n)
            if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
            app __x9__ = (CreateDataPropertyOrThrow A __x8__ subElement)
            if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
            __x9__
          } else {}
          n = (+ n 1i)
          k = (+ k 1i)
        }
      } else {
        if (! (< n (- 9007199254740992i 1i))) {
          app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x10__
        } else {}
        app __x11__ = (ToString n)
        if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        app __x12__ = (CreateDataPropertyOrThrow A __x11__ E)
        if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        __x12__
        n = (+ n 1i)
      }
    }
    app __x13__ = (Set A "length" n true)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    __x13__
    app __x14__ = (WrapCompletion A)
    return __x14__
  }"""), this)
}
