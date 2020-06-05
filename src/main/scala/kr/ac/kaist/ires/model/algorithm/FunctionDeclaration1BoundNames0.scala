package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionDeclaration1BoundNames0 extends Algorithm {
  val name: String = "FunctionDeclaration1BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionDeclaration1BoundNames0" (this, FormalParameters, FunctionBody) => return (new ["*default*"])"""), this)
}
