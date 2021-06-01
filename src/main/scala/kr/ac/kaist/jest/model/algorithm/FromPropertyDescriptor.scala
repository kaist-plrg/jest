package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FromPropertyDescriptor extends Algorithm {
  val name: String = "FromPropertyDescriptor"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FromPropertyDescriptor" (Desc) => {
    if (= Desc undefined) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    app obj = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
    if (! (= Desc["Value"] absent)) {
      app __x1__ = (CreateDataPropertyOrThrow obj "value" Desc["Value"])
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      __x1__
    } else {}
    if (! (= Desc["Writable"] absent)) {
      app __x2__ = (CreateDataPropertyOrThrow obj "writable" Desc["Writable"])
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
    } else {}
    if (! (= Desc["Get"] absent)) {
      app __x3__ = (CreateDataPropertyOrThrow obj "get" Desc["Get"])
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {}
    if (! (= Desc["Set"] absent)) {
      app __x4__ = (CreateDataPropertyOrThrow obj "set" Desc["Set"])
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
    } else {}
    if (! (= Desc["Enumerable"] absent)) {
      app __x5__ = (CreateDataPropertyOrThrow obj "enumerable" Desc["Enumerable"])
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      __x5__
    } else {}
    if (! (= Desc["Configurable"] absent)) {
      app __x6__ = (CreateDataPropertyOrThrow obj "configurable" Desc["Configurable"])
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      __x6__
    } else {}
    app __x7__ = (WrapCompletion obj)
    return __x7__
  }"""), this)
}
