package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeArgGetter {
  val length: Int = 2
  val func: Func = parseFunc(""""MakeArgGetter" (name, env) => {
    let steps = ArgGetter
    app __x0__ = (CreateBuiltinFunction steps (new ["Name", "Env"]))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let getter = __x0__
    getter["Name"] = name
    getter["Env"] = env
    app __x1__ = (WrapCompletion getter)
    return __x1__
  }""")
}
