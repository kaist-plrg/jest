package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorFunctionCreate extends Algorithm {
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = parseFunc(""""GeneratorFunctionCreate" (kind, ParameterList, Body, Scope, Strict) => {
    let functionPrototype = INTRINSIC_Generator
    app __x0__ = (FunctionAllocate functionPrototype Strict "generator")
    let F = __x0__
    app __x1__ = (FunctionInitialize F kind ParameterList Body Scope)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
