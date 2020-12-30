package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MakeArgGetter extends Algorithm {
  val name: String = "MakeArgGetter"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MakeArgGetter" (name, env) => {
    let steps = (new algorithm ("step" -> ArgGetter))
    app __x0__ = (CreateBuiltinFunction steps (new ["Name", "Env"]))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let getter = __x0__
    getter["Name"] = name
    getter["Env"] = env
    app __x1__ = (WrapCompletion getter)
    return __x1__
  }"""), this)
}
