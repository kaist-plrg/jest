package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorDeclaration1InstantiateFunctionObject0 extends Algorithm {
  val name: String = "GeneratorDeclaration1InstantiateFunctionObject0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorDeclaration1InstantiateFunctionObject0" (this, FormalParameters, GeneratorBody, scope) => {
    app __x0__ = (GeneratorFunctionCreate CONST_Normal FormalParameters GeneratorBody scope true)
    let F = __x0__
    app __x1__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
    let prototype = __x1__
    app __x2__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x2__
    app __x3__ = (SetFunctionName F "default")
    __x3__
    F["SourceText"] = (get-syntax this)
    app __x4__ = (WrapCompletion F)
    return __x4__
  }"""), this)
}
