package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncGeneratorStart extends Algorithm {
  val name: String = "AsyncGeneratorStart"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncGeneratorStart" (generator, generatorBody) => {
    assert (= generator["AsyncGeneratorState"] undefined)
    let genContext = GLOBAL_context
    genContext["Generator"] = generator
    genContext["ResumeCont"] = () [=>] {
      access __x0__ = (generatorBody "Evaluation")
      let result = __x0__
      access __ret__ = (genContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
        __x1__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x1__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      generator["AsyncGeneratorState"] = CONST_completed
      if (&& (is-completion result) (= result["Type"] CONST_normal)) let resultValue = undefined else {
        let resultValue = result["Value"]
        if (! (= result["Type"] CONST_return)) {
          app __x2__ = (AsyncGeneratorReject generator resultValue)
          if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
          app __x3__ = (__ret__ __x2__)
        } else {}
      }
      app __x4__ = (AsyncGeneratorResolve generator resultValue true)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (__ret__ __x4__)
    }
    generator["AsyncGeneratorContext"] = genContext
    generator["AsyncGeneratorState"] = CONST_suspendedStart
    generator["AsyncGeneratorQueue"] = (new [])
    app __x6__ = (WrapCompletion undefined)
    return __x6__
  }"""), this)
}
