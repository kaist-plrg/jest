package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledStatement0VarScopedDeclarations0 extends Algorithm {
  val name: String = "LabelledStatement0VarScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelledStatement0VarScopedDeclarations0" (this, LabelIdentifier, LabelledItem) => {
    access __x0__ = (LabelledItem "VarScopedDeclarations")
    return __x0__
  }"""), this)
}
