package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MakeArgSetter extends Algorithm {
  val name: String = "MakeArgSetter"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MakeArgSetter" (name, env) => {
    let steps = (new algorithm ("step" -> ArgSetter))
    app __x0__ = (CreateBuiltinFunction steps (new ["Name", "Env"]))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let setter = __x0__
    setter["Name"] = name
    setter["Env"] = env
    app __x1__ = (WrapCompletion setter)
    return __x1__
  }"""), this)
}
