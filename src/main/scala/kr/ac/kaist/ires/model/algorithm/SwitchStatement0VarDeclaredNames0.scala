package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0VarDeclaredNames0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SwitchStatement0VarDeclaredNames0" (this, Expression, CaseBlock) => {
    access __x0__ = (CaseBlock "VarDeclaredNames")
    return __x0__
  }"""))
}
