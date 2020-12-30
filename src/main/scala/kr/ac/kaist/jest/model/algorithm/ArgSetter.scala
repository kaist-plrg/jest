package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArgSetter extends Algorithm {
  val name: String = "ArgSetter"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArgSetter" (_0, argumentsList, _1, f) => {
    let value = argumentsList[0i]
    let f = GLOBAL_context["Function"]
    let name = f["Name"]
    let env = f["Env"]
    app __x0__ = (env["SetMutableBinding"] env name value false)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
