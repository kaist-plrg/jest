package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreatePerIterationEnvironment extends Algorithm {
  val name: String = "CreatePerIterationEnvironment"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreatePerIterationEnvironment" (perIterationBindings) => {
    if (< 0i perIterationBindings["length"]) {
      let lastIterationEnv = GLOBAL_context["LexicalEnvironment"]
      let lastIterationEnvRec = lastIterationEnv["EnvironmentRecord"]
      let outer = lastIterationEnv["Outer"]
      assert (! (= outer null))
      app __x0__ = (NewDeclarativeEnvironment outer)
      let thisIterationEnv = __x0__
      let thisIterationEnvRec = thisIterationEnv["EnvironmentRecord"]
      let __x1__ = perIterationBindings
      let __x2__ = 0i
      while (< __x2__ __x1__["length"]) {
        let bn = __x1__[__x2__]
        app __x3__ = (thisIterationEnvRec["CreateMutableBinding"] thisIterationEnvRec bn false)
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        __x3__
        app __x4__ = (lastIterationEnvRec["GetBindingValue"] lastIterationEnvRec bn true)
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let lastValue = __x4__
        app __x5__ = (thisIterationEnvRec["InitializeBinding"] thisIterationEnvRec bn lastValue)
        __x5__
        __x2__ = (+ __x2__ 1i)
      }
      GLOBAL_context["LexicalEnvironment"] = thisIterationEnv
    } else {}
    app __x6__ = (WrapCompletion undefined)
    return __x6__
  }"""), this)
}
