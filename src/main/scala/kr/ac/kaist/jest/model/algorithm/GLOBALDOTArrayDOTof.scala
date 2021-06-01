package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTof extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTof"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.of" (this, argumentsList, NewTarget) => {
    let len = argumentsList["length"]
    let items = argumentsList
    let C = this
    app __x0__ = (IsConstructor C)
    if (= __x0__ true) {
      app __x1__ = (Construct C (new [len]))
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let A = __x1__
    } else {
      app __x2__ = (ArrayCreate len)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let A = __x2__
    }
    let k = 0i
    while (< k len) {
      let kValue = items[k]
      app __x3__ = (ToString k)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let Pk = __x3__
      app __x4__ = (CreateDataPropertyOrThrow A Pk kValue)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      k = (+ k 1i)
    }
    app __x5__ = (Set A "length" len true)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion A)
    return __x6__
  }"""), this)
}
