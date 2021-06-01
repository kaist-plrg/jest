package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetOwnPropertyKeys extends Algorithm {
  val name: String = "GetOwnPropertyKeys"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GetOwnPropertyKeys" (O, type) => {
    app __x0__ = (ToObject O)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let obj = __x0__
    app __x1__ = (obj["OwnPropertyKeys"] obj)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let keys = __x1__
    let nameList = (new [])
    let __x2__ = keys
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let nextKey = __x2__[__x3__]
      app T = (Type nextKey)
      let valid = (|| (&& (= T "Symbol") (= type CONST_symbol)) (&& (= T "String") (= type CONST_string)))
      if valid append nextKey -> nameList else {}
      __x3__ = (+ __x3__ 1i)
    }
    app __x8__ = (CreateArrayFromList nameList)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }"""), this)
}
