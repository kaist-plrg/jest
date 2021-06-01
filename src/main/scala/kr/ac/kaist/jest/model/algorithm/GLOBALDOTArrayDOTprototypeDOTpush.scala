package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTpush extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTpush"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.push" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (LengthOfArrayLike O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let len = __x1__
    let items = argumentsList
    let argCount = items["length"]
    if (< (- 9007199254740992i 1i) (+ len argCount)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    while (< 0i items["length"]) {
      let E = (pop items 0i)
      app __x3__ = (ToString len)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (Set O __x3__ E true)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      len = (+ len 1i)
    }
    app __x5__ = (Set O "length" len true)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion len)
    return __x6__
  }"""), this)
}
