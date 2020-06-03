package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeArgSetter {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""MakeArgSetter" (name, env) => {
    let steps = ArgSetter
    app __x0__ = (CreateBuiltinFunction steps (new ["Name", "Env"]))
    let setter = __x0__
    setter["Name"] = name
    setter["Env"] = env
    app __x1__ = (WrapCompletion setter)
    return __x1__
  }""")
}
