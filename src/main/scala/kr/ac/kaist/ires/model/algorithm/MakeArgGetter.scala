package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeArgGetter extends Algorithm {
  val name: String = "MakeArgGetter"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MakeArgGetter" (name, env) => {
    let steps = ArgGetter
    app __x0__ = (CreateBuiltinFunction steps (new ["Name", "Env"]))
    let getter = __x0__
    getter["Name"] = name
    getter["Env"] = env
    app __x1__ = (WrapCompletion getter)
    return __x1__
  }"""), this)
}
