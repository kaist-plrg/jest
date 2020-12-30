package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncGeneratorYield extends Algorithm {
  val name: String = "AsyncGeneratorYield"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncGeneratorYield" (value) => {
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    app __x0__ = (GetGeneratorKind )
    assert (= __x0__ CONST_async)
    app __x1__ = (Await value)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    value = __x1__
    generator["AsyncGeneratorState"] = CONST_suspendedYield
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x2__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x2__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      if (! (= resumptionValue["Type"] CONST_return)) {
        app __x3__ = (Completion resumptionValue)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      app __x5__ = (Await resumptionValue["Value"])
      let awaited = __x5__
      if (= awaited["Type"] CONST_throw) {
        app __x6__ = (Completion awaited)
        app __x7__ = (WrapCompletion __x6__)
        return __x7__
      } else {}
      assert (= awaited["Type"] CONST_normal)
      app __x8__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> awaited["Value"], "Target" -> CONST_empty)))
      return __x8__
    }
    app __x9__ = (AsyncGeneratorResolve generator value false)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    app __x10__ = ((pop genContext["ReturnCont"] 0i) __x9__)
  }"""), this)
}
