package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

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
    app __x2__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x2__
    let stepsDefine = !!! "Algorithms"
    app __x3__ = (CreateBuiltinFunction stepsDefine (new []))
    let adder = __x3__
    app __x4__ = (AddEntriesFromIterable obj iterable adder)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
