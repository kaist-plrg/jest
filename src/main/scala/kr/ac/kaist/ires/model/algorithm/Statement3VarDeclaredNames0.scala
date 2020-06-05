package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement3VarDeclaredNames0 extends Algorithm {
  val name: String = "Statement3VarDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement3VarDeclaredNames0" (this, ExpressionStatement) => return (new [])"""), this)
}
