package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncGeneratorStart extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.AsyncGeneratorStart" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let generatorBody = __x1__
    assert (= generator["AsyncGeneratorState"] undefined)
    let genContext = GLOBAL_context
    genContext["Generator"] = generator
    genContext["ResumeCont"] = () [=>] {
      access __x2__ = (generatorBody "Evaluation")
      let result = __x2__
      access __ret__ = (genContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
        __x3__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x3__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      generator["AsyncGeneratorState"] = "completed"
      if (&& (is-completion result) (= result["Type"] CONST_normal)) let resultValue = undefined else {
        let resultValue = result["Value"]
        if (! (= result["Type"] CONST_return)) {
          app __x4__ = (AsyncGeneratorReject generator resultValue)
          if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
          app __x5__ = (WrapCompletion __x4__)
          return __x5__
        } else {}
      }
      app __x6__ = (AsyncGeneratorResolve generator resultValue true)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    }
    generator["AsyncGeneratorContext"] = genContext
    generator["AsyncGeneratorState"] = "suspendedStart"
    generator["AsyncGeneratorQueue"] = (new [])
    app __x8__ = (WrapCompletion undefined)
    return __x8__
  }""")
}
