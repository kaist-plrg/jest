package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGeneratorYield extends Algorithm {
  val name: String = "GLOBALDOTGeneratorYield"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.GeneratorYield" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterNextObj = __x0__
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    app __x1__ = (GetGeneratorKind )
    assert (= __x1__ CONST_sync)
    generator["GeneratorState"] = CONST_suspendedYield
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x2__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x2__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      app __x3__ = (WrapCompletion resumptionValue)
      return __x3__
    }
    app __x4__ = (NormalCompletion iterNextObj)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
