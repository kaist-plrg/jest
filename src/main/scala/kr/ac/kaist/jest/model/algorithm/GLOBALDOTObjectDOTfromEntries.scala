package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTObjectDOTfromEntries extends Algorithm {
  val name: String = "GLOBALDOTObjectDOTfromEntries"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Object.fromEntries" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    app __x1__ = (RequireObjectCoercible iterable)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app obj = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
    let stepsDefine = (new algorithm ("name" -> "", "length" -> 1i, "step" -> GLOBALDOTCreateDataPropertyOnObjectFunctions))
    app __x2__ = (CreateBuiltinFunction stepsDefine (new []))
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let adder = __x2__
    app __x3__ = (AddEntriesFromIterable obj iterable adder)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
