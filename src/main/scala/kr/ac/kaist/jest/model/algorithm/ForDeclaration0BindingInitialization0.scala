package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ForDeclaration0BindingInitialization0 extends Algorithm {
  val name: String = "ForDeclaration0BindingInitialization0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ForDeclaration0BindingInitialization0" (this, LetOrConst, ForBinding, value, environment) => {
    access __x0__ = (ForBinding "BindingInitialization")
    app __x1__ = (__x0__ value environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
