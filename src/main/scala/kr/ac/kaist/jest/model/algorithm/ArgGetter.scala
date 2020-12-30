package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArgGetter extends Algorithm {
  val name: String = "ArgGetter"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArgGetter" (_0, _1, _2, f) => {
    let f = GLOBAL_context["Function"]
    let name = f["Name"]
    let env = f["Env"]
    app __x0__ = (env["GetBindingValue"] env name false)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
