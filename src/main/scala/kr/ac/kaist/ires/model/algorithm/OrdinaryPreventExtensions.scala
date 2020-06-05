package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryPreventExtensions extends Algorithm {
  val name: String = "OrdinaryPreventExtensions"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryPreventExtensions" (O) => {
    O["Extensible"] = false
    app __x0__ = (WrapCompletion true)
    return __x0__
  }"""), this)
}
