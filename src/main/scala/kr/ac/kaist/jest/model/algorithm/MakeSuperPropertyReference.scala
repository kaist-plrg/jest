package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MakeSuperPropertyReference extends Algorithm {
  val name: String = "MakeSuperPropertyReference"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MakeSuperPropertyReference" (actualThis, propertyKey, strict) => {
    app __x0__ = (GetThisEnvironment )
    let env = __x0__
    app __x1__ = (env["HasSuperBinding"] env)
    assert (= __x1__ true)
    app __x2__ = (env["GetSuperBase"] env)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let baseValue = __x2__
    app __x3__ = (RequireObjectCoercible baseValue)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let bv = __x3__
    app __x4__ = (WrapCompletion (new Reference("BaseValue" -> bv, "ReferencedName" -> propertyKey, "thisValue" -> actualThis, "StrictReference" -> strict)))
    return __x4__
  }"""), this)
}
