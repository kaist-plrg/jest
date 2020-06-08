package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IdentifierReference0AssignmentTargetType0 extends Algorithm {
  val name: String = "IdentifierReference0AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IdentifierReference0AssignmentTargetType0" (this, Identifier) => {
    let __x0__ = true
    if __x0__ {
      access __x1__ = (Identifier "StringValue")
      __x0__ = (|| (= __x1__ "eval") (= __x1__ "arguments"))
    } else {}
    if __x0__ return CONST_invalid else {}
    return CONST_simple
  }"""), this)
}
