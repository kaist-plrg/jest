package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.BUG_FIX
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ForInOfHeadEvaluation extends Algorithm {
  val name: String = "ForInOfHeadEvaluation"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(if (BUG_FIX) fixed else es11), this)
  private def es11 = """"ForInOfHeadEvaluation" (uninitializedBoundNames, expr, iterationKind) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    if (< 0i uninitializedBoundNames["length"]) {
      app __x0__ = (NewDeclarativeEnvironment oldEnv)
      let newEnv = __x0__
      let newEnvRec = newEnv["EnvironmentRecord"]
      let __x1__ = uninitializedBoundNames
      let __x2__ = 0i
      while (< __x2__ __x1__["length"]) {
        let name = __x1__[__x2__]
        app __x3__ = (newEnvRec["CreateMutableBinding"] newEnvRec name false)
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        __x3__
        __x2__ = (+ __x2__ 1i)
      }
      GLOBAL_context["LexicalEnvironment"] = newEnv
    } else {}
    access __x4__ = (expr "Evaluation")
    let exprRef = __x4__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x5__ = (GetValue exprRef)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let exprValue = __x5__
    if (= iterationKind CONST_enumerate) {
      if (|| (= exprValue undefined) (= exprValue null)) {
        app __x6__ = (WrapCompletion (new Completion("Type" -> CONST_break, "Value" -> CONST_empty, "Target" -> CONST_empty)))
        return __x6__
      } else {}
      app __x7__ = (ToObject exprValue)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let obj = __x7__
      app __x8__ = (EnumerateObjectProperties obj)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      __x8__.NextMethod = absent
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {
      assert (|| (= iterationKind CONST_iterate) (= iterationKind CONST_asynciterate))
      if (= iterationKind CONST_asynciterate) let iteratorHint = CONST_async else let iteratorHint = CONST_sync
      app __x10__ = (GetIterator exprValue iteratorHint)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    }
  }"""
  private def fixed = """"ForInOfHeadEvaluation" (uninitializedBoundNames, expr, iterationKind) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    if (< 0i uninitializedBoundNames["length"]) {
      app __x0__ = (NewDeclarativeEnvironment oldEnv)
      let newEnv = __x0__
      let newEnvRec = newEnv["EnvironmentRecord"]
      let __x1__ = uninitializedBoundNames
      let __x2__ = 0i
      while (< __x2__ __x1__["length"]) {
        let name = __x1__[__x2__]
        app __x3__ = (newEnvRec["CreateMutableBinding"] newEnvRec name false)
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        __x3__
        __x2__ = (+ __x2__ 1i)
      }
      GLOBAL_context["LexicalEnvironment"] = newEnv
    } else {}
    access __x4__ = (expr "Evaluation")
    let exprRef = __x4__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x5__ = (GetValue exprRef)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let exprValue = __x5__
    if (= iterationKind CONST_enumerate) {
      if (|| (= exprValue undefined) (= exprValue null)) {
        app __x6__ = (WrapCompletion (new Completion("Type" -> CONST_break, "Value" -> CONST_empty, "Target" -> CONST_empty)))
        return __x6__
      } else {}
      app __x7__ = (ToObject exprValue)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let obj = __x7__
      app __x8__ = (EnumerateObjectProperties obj)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {
      assert (|| (= iterationKind CONST_iterate) (= iterationKind CONST_asynciterate))
      if (= iterationKind CONST_asynciterate) let iteratorHint = CONST_async else let iteratorHint = CONST_sync
      app __x10__ = (GetIterator exprValue iteratorHint)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    }
  }"""
}
