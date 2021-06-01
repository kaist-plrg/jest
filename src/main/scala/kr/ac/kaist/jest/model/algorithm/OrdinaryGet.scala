package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryGet extends Algorithm {
  val name: String = "OrdinaryGet"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryGet" (O, P, Receiver) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (O["GetOwnProperty"] O P)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let desc = __x1__
    if (= desc undefined) {
      app __x2__ = (O["GetPrototypeOf"] O)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let parent = __x2__
      if (= parent null) {
        app __x3__ = (WrapCompletion undefined)
        return __x3__
      } else {}
      app __x4__ = (parent["Get"] parent P Receiver)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (IsDataDescriptor desc)
    if (= __x6__ true) {
      app __x7__ = (WrapCompletion desc["Value"])
      return __x7__
    } else {}
    app __x8__ = (IsAccessorDescriptor desc)
    assert (= __x8__ true)
    let getter = desc["Get"]
    if (= getter undefined) {
      app __x9__ = (WrapCompletion undefined)
      return __x9__
    } else {}
    app __x10__ = (Call getter Receiver)
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }"""), this)
}
