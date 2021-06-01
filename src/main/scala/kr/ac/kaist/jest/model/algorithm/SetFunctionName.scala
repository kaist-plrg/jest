package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SetFunctionName extends Algorithm {
  val name: String = "SetFunctionName"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SetFunctionName" (F, name, prefix) => {
    app __x0__ = (Type name)
    assert (|| (= __x0__ Symbol) (= __x0__ String))
    app __x1__ = (Type name)
    if (= __x1__ Symbol) {
      let description = name["Description"]
      if (= description undefined) name = "" else name = (+ (+ "[" description) "]")
    } else {}
    if (! (= prefix absent)) name = (+ (+ prefix " ") name) else {}
    app __x2__ = (DefinePropertyOrThrow F "name" (new PropertyDescriptor("Value" -> name, "Writable" -> false, "Enumerable" -> false, "Configurable" -> true)))
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
