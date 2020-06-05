package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsAnonymousFunctionDefinition extends Algorithm {
  val name: String = "IsAnonymousFunctionDefinition"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IsAnonymousFunctionDefinition" (expr) => {
    access __x0__ = (expr "IsFunctionDefinition")
    if (= __x0__ false) return false else {}
    access __x1__ = (expr "HasName")
    let hasName = __x1__
    if (= hasName true) return false else {}
    return true
  }"""), this)
}
