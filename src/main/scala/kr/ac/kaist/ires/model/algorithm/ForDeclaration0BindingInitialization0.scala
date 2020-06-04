package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ForDeclaration0BindingInitialization0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ForDeclaration0BindingInitialization0" (this, LetOrConst, ForBinding, value, environment) => {
    access __x0__ = (ForBinding "BindingInitialization")
    app __x1__ = (__x0__ value environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
