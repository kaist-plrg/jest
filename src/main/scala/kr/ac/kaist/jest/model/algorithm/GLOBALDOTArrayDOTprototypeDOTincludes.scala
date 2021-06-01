package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTincludes extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTincludes"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.includes" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchElement = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let fromIndex = __x1__
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    if (= len 0i) {
      app __x4__ = (WrapCompletion false)
      return __x4__
    } else {}
    app __x5__ = (ToInteger fromIndex)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let n = __x5__
    if (! (< n 0i)) let k = n else {
      let k = (+ len n)
      if (< k 0i) k = 0i else {}
    }
    while (< k len) {
      app __x6__ = (ToString k)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (Get O __x6__)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let elementK = __x7__
      app __x8__ = (SameValueZero searchElement elementK)
      if (= __x8__ true) {
        app __x9__ = (WrapCompletion true)
        return __x9__
      } else {}
      k = (+ k 1i)
    }
    app __x10__ = (WrapCompletion false)
    return __x10__
  }"""), this)
}
