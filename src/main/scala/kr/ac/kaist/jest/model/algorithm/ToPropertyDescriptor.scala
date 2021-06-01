package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ToPropertyDescriptor extends Algorithm {
  val name: String = "ToPropertyDescriptor"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToPropertyDescriptor" (Obj) => {
    app __x0__ = (Type Obj)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    let desc = (new PropertyDescriptor("SubMap" -> (new SubMap())))
    app __x2__ = (HasProperty Obj "enumerable")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let hasEnumerable = __x2__
    if (= hasEnumerable true) {
      app __x3__ = (Get Obj "enumerable")
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (ToBoolean __x3__)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let enumerable = __x4__
      desc["Enumerable"] = enumerable
    } else {}
    app __x5__ = (HasProperty Obj "configurable")
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let hasConfigurable = __x5__
    if (= hasConfigurable true) {
      app __x6__ = (Get Obj "configurable")
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (ToBoolean __x6__)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let configurable = __x7__
      desc["Configurable"] = configurable
    } else {}
    app __x8__ = (HasProperty Obj "value")
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let hasValue = __x8__
    if (= hasValue true) {
      app __x9__ = (Get Obj "value")
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let value = __x9__
      desc["Value"] = value
    } else {}
    app __x10__ = (HasProperty Obj "writable")
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    let hasWritable = __x10__
    if (= hasWritable true) {
      app __x11__ = (Get Obj "writable")
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (ToBoolean __x11__)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let writable = __x12__
      desc["Writable"] = writable
    } else {}
    app __x13__ = (HasProperty Obj "get")
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let hasGet = __x13__
    if (= hasGet true) {
      app __x14__ = (Get Obj "get")
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let getter = __x14__
      app __x15__ = (IsCallable getter)
      if (&& (= __x15__ false) (! (= getter undefined))) {
        app __x16__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x16__
      } else {}
      desc["Get"] = getter
    } else {}
    app __x17__ = (HasProperty Obj "set")
    if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
    let hasSet = __x17__
    if (= hasSet true) {
      app __x18__ = (Get Obj "set")
      if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
      let setter = __x18__
      app __x19__ = (IsCallable setter)
      if (&& (= __x19__ false) (! (= setter undefined))) {
        app __x20__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x20__
      } else {}
      desc["Set"] = setter
    } else {}
    if (|| (! (= desc["Get"] absent)) (! (= desc["Set"] absent))) if (|| (! (= desc["Value"] absent)) (! (= desc["Writable"] absent))) {
      app __x21__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x21__
    } else {} else {}
    app __x22__ = (WrapCompletion desc)
    return __x22__
  }"""), this)
}
