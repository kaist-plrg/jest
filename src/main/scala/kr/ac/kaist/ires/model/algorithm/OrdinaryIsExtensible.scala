package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryIsExtensible extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryIsExtensible" (O) => {
    app __x0__ = (WrapCompletion O["Extensible"])
    return __x0__
  }"""))
}
