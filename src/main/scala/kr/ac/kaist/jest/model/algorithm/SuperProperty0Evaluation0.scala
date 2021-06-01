package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SuperProperty0Evaluation0 extends Algorithm {
  val name: String = "SuperProperty0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SuperProperty0Evaluation0" (this, Expression) => {
    app __x0__ = (GetThisEnvironment )
    let env = __x0__
    app __x1__ = (env["GetThisBinding"] env)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let actualThis = __x1__
    access __x2__ = (Expression "Evaluation")
    let propertyNameReference = __x2__
    app __x3__ = (GetValue propertyNameReference)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let propertyNameValue = __x3__
    app __x4__ = (ToPropertyKey propertyNameValue)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let propertyKey = __x4__
    let strict = true
    app __x5__ = (MakeSuperPropertyReference actualThis propertyKey strict)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
