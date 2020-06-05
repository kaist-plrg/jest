package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryGetPrototypeOf extends Algorithm {
  val name: String = "OrdinaryGetPrototypeOf"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryGetPrototypeOf" (O) => {
    app __x0__ = (WrapCompletion O["Prototype"])
    return __x0__
  }"""), this)
}
