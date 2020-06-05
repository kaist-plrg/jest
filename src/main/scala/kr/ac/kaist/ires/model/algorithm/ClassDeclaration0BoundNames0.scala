package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassDeclaration0BoundNames0 extends Algorithm {
  val name: String = "ClassDeclaration0BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassDeclaration0BoundNames0" (this, BindingIdentifier, ClassTail) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }"""), this)
}
