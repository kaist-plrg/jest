package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ConciseBody0VarDeclaredNames0 extends Algorithm {
  val name: String = "ConciseBody0VarDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ConciseBody0VarDeclaredNames0" (this, ExpressionBody) => return (new [])"""), this)
}
