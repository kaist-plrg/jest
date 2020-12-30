package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectBindingPattern1BindingInitialization0 extends Algorithm {
  val name: String = "ObjectBindingPattern1BindingInitialization0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectBindingPattern1BindingInitialization0" (this, BindingRestProperty, value, environment) => {
    let excludedNames = (new [])
    access __x0__ = (BindingRestProperty "RestBindingInitialization")
    app __x1__ = (__x0__ value environment excludedNames)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
