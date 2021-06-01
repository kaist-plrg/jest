package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTunshift extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTunshift"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.unshift" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (LengthOfArrayLike O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let len = __x1__
    let argCount = argumentsList["length"]
    if (< 0i argCount) {
      if (< (- 9007199254740992i 1i) (+ len argCount)) {
        app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x2__
      } else {}
      let k = len
      while (< 0i k) {
        app __x3__ = (ToString (- k 1i))
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        let from = __x3__
        app __x4__ = (ToString (- (+ k argCount) 1i))
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let to = __x4__
        app __x5__ = (HasProperty O from)
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        let fromPresent = __x5__
        if (= fromPresent true) {
          app __x6__ = (Get O from)
          if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          let fromValue = __x6__
          app __x7__ = (Set O to fromValue true)
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          __x7__
        } else {
          assert (= fromPresent false)
          app __x8__ = (DeletePropertyOrThrow O to)
          if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
          __x8__
        }
        k = (- k 1i)
      }
      let j = 0i
      let items = argumentsList
      while (< 0i items["length"]) {
        let E = (pop items 0i)
        app __x9__ = (ToString j)
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        app __x10__ = (Set O __x9__ E true)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        __x10__
        j = (+ j 1i)
      }
    } else {}
    app __x11__ = (Set O "length" (+ len argCount) true)
    if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    __x11__
    app __x12__ = (WrapCompletion (+ len argCount))
    return __x12__
  }"""), this)
}
