package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArraySpeciesCreate extends Algorithm {
  val name: String = "ArraySpeciesCreate"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArraySpeciesCreate" (originalArray, length) => {
    app __x0__ = (IsNonNegativeInteger length)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    assert (= __x0__ true)
    if (= length -0.0) length = 0i else {}
    app __x1__ = (IsArray originalArray)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let isArray = __x1__
    if (= isArray false) {
      app __x2__ = (ArrayCreate length)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Get originalArray "constructor")
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let C = __x4__
    app __x5__ = (IsConstructor C)
    if (= __x5__ true) {
      let thisRealm = REALM
      app __x6__ = (GetFunctionRealm C)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let realmC = __x6__
      if (! (= thisRealm realmC)) {
        app __x7__ = (SameValue C realmC["Intrinsics"]["INTRINSIC_Array"])
        if (= __x7__ true) C = undefined else {}
      } else {}
    } else {}
    app __x8__ = (Type C)
    if (= __x8__ Object) {
      app __x9__ = (Get C SYMBOL_species)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      C = __x9__
      if (= C null) C = undefined else {}
    } else {}
    if (= C undefined) {
      app __x10__ = (ArrayCreate length)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (IsConstructor C)
    if (= __x12__ false) {
      app __x13__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x13__
    } else {}
    app __x14__ = (Construct C (new [length]))
    if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
    app __x15__ = (WrapCompletion __x14__)
    return __x15__
  }"""), this)
}
