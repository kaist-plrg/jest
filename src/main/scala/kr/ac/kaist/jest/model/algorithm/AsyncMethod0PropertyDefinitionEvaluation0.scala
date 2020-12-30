package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncMethod0PropertyDefinitionEvaluation0 extends Algorithm {
  val name: String = "AsyncMethod0PropertyDefinitionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncMethod0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, AsyncFunctionBody, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (is-completion propKey) if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    access __x1__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x1__
    app closure = (OrdinaryFunctionCreate INTRINSIC_AsyncFunctionPrototype UniqueFormalParameters AsyncFunctionBody CONST_nonlexicalthis scope)
    ! closure
    app __x2__ = (MakeMethod closure object)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (SetFunctionName closure propKey)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    closure["SourceText"] = (get-syntax this)
    let desc = (new PropertyDescriptor("Value" -> closure, "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x4__ = (DefinePropertyOrThrow object propKey desc)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
