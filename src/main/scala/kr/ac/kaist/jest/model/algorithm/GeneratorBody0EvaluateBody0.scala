package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GeneratorBody0EvaluateBody0 extends Algorithm {
  val name: String = "GeneratorBody0EvaluateBody0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorBody0EvaluateBody0" (this, FunctionBody, functionObject, argumentsList) => {
    app __x0__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (OrdinaryCreateFromConstructor functionObject "%Generator.prototype%" (new ["GeneratorState", "GeneratorContext"]))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let G = __x1__
    app __x2__ = (GeneratorStart G FunctionBody)
    __x2__
    app __x3__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> G, "Target" -> CONST_empty)))
    return __x3__
  }"""), this)
}
