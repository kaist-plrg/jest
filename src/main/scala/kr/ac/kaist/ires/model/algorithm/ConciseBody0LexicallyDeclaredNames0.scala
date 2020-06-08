package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ConciseBody0LexicallyDeclaredNames0 extends Algorithm {
  val name: String = "ConciseBody0LexicallyDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ConciseBody0LexicallyDeclaredNames0" (this, ExpressionBody) => return (new [])"""), this)
}
