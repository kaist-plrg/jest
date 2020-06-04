package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorDeclaration1InstantiateFunctionObject0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AsyncGeneratorDeclaration1InstantiateFunctionObject0" (this, FormalParameters, AsyncGeneratorBody, scope) => {
    if true let strict = true else let strict = false
    app __x0__ = (AsyncGeneratorFunctionCreate CONST_Normal FormalParameters AsyncGeneratorBody scope strict)
    let F = __x0__
    app __x1__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
    let prototype = __x1__
    app __x2__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x2__
    app __x3__ = (SetFunctionName F "default")
    __x3__
    F["SourceText"] = (get-syntax this)
    app __x4__ = (WrapCompletion F)
    return __x4__
  }""")
}
