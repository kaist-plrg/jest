package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0VarDeclaredNames0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""Catch0VarDeclaredNames0" (this, CatchParameter, Block) => {
    access __x0__ = (Block "VarDeclaredNames")
    return __x0__
  }""")
}
