package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorDeclaration1InstantiateFunctionObject0 extends Algorithm {
  val name: String = "GeneratorDeclaration1InstantiateFunctionObject0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorDeclaration1InstantiateFunctionObject0" (this, FormalParameters, GeneratorBody, scope) => {
    app __x0__ = (OrdinaryFunctionCreate INTRINSIC_Generator FormalParameters GeneratorBody CONST_nonlexicalthis scope)
    let F = __x0__
    !!! "Let id:{prototype} be OrdinaryObjectCreate ( % Generator . prototype % ) ."
    app __x1__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x1__
    app __x2__ = (SetFunctionName F "default")
    __x2__
    F["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion F)
    return __x3__
  }"""), this)
}
