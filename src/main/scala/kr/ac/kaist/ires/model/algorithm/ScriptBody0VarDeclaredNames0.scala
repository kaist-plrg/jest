package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptBody0VarDeclaredNames0 extends Algorithm {
  val name: String = "ScriptBody0VarDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ScriptBody0VarDeclaredNames0" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelVarDeclaredNames")
    return __x0__
  }"""), this)
}
