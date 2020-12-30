package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MakeConstructor extends Algorithm {
  val name: String = "MakeConstructor"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MakeConstructor" (F, writablePrototype, prototype) => {
    app __x0__ = (IsConstructor F)
    assert (= __x0__ false)
    F["Construct"] = ECMAScriptFunctionObjectDOTConstruct
    F["ConstructorKind"] = CONST_base
    if (= writablePrototype absent) writablePrototype = true else {}
    if (= prototype absent) {
      app prototype = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
      app __x1__ = (DefinePropertyOrThrow prototype "constructor" (new PropertyDescriptor("Value" -> F, "Writable" -> writablePrototype, "Enumerable" -> false, "Configurable" -> true)))
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      __x1__
    } else {}
    app __x2__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> writablePrototype, "Enumerable" -> false, "Configurable" -> false)))
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (NormalCompletion undefined)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
