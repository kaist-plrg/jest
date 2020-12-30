package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GeneratorStart extends Algorithm {
  val name: String = "GeneratorStart"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorStart" (generator, generatorBody) => {
    assert (= generator["GeneratorState"] undefined)
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
      generator["GeneratorState"] = CONST_completed
      if (= result["Type"] CONST_normal) let resultValue = undefined else if (= result["Type"] CONST_return) let resultValue = result["Value"] else {
        assert (= result["Type"] CONST_throw)
        app __x2__ = (Completion result)
        app __x3__ = (__ret__ __x2__)
      }
      app __x4__ = (CreateIterResultObject resultValue true)
      app __x5__ = (__ret__ __x4__)
    }
    generator["GeneratorContext"] = genContext
    generator["GeneratorState"] = CONST_suspendedStart
    app __x6__ = (NormalCompletion undefined)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""), this)
}
