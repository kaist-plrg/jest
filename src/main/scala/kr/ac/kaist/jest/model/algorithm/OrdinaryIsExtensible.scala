package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryIsExtensible extends Algorithm {
  val name: String = "OrdinaryIsExtensible"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryIsExtensible" (O) => {
    app __x0__ = (WrapCompletion O["Extensible"])
    return __x0__
  }"""), this)
}
