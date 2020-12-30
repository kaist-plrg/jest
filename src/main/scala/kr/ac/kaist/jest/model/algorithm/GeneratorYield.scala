package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GeneratorYield extends Algorithm {
  val name: String = "GeneratorYield"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorYield" (iterNextObj) => {
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    app __x0__ = (GetGeneratorKind )
    assert (= __x0__ CONST_sync)
    generator["GeneratorState"] = CONST_suspendedYield
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x1__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x1__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      app __x2__ = (WrapCompletion resumptionValue)
      return __x2__
    }
    app __x3__ = (NormalCompletion iterNextObj)
    app __x4__ = ((pop genContext["ReturnCont"] 0i) __x3__)
  }"""), this)
}
