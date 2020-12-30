package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GeneratorExpression0Evaluation0 extends Algorithm {
  val name: String = "GeneratorExpression0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorExpression0Evaluation0" (this, FormalParameters, GeneratorBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (OrdinaryFunctionCreate INTRINSIC_Generator FormalParameters GeneratorBody CONST_nonlexicalthis scope)
    let closure = __x1__
    app prototype = (OrdinaryObjectCreate INTRINSIC_GeneratorPrototype)
    app __x2__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x2__
    closure["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion closure)
    return __x3__
  }"""), this)
}
