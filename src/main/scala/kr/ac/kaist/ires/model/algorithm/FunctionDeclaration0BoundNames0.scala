package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionDeclaration0BoundNames0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""FunctionDeclaration0BoundNames0" (this, BindingIdentifier, FormalParameters, FunctionBody) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }""")
}
