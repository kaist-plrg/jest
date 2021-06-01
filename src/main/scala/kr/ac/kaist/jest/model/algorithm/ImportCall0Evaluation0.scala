package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ImportCall0Evaluation0 extends Algorithm {
  val name: String = "ImportCall0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ImportCall0Evaluation0" (this, AssignmentExpression) => {
    app __x0__ = (GetActiveScriptOrModule )
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let referencingScriptOrModule = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let argRef = __x1__
    app __x2__ = (GetValue argRef)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let specifier = __x2__
    app __x3__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let promiseCapability = __x3__
    app __x4__ = (ToString specifier)
    let specifierString = __x4__
    if (is-completion specifierString) if (= specifierString["Type"] CONST_normal) specifierString = specifierString["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [specifierString["Value"]]))
      if (&& (is-completion __x5__) (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    specifierString
    app __x6__ = (HostImportModuleDynamically referencingScriptOrModule specifierString promiseCapability)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    __x6__
    app __x7__ = (WrapCompletion promiseCapability["Promise"])
    return __x7__
  }"""), this)
}
