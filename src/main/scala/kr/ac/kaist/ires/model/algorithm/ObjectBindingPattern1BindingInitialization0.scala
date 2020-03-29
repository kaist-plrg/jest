package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectBindingPattern1BindingInitialization0 {
  val length: Int = 0
  val func: Func = parseFunc(""""ObjectBindingPattern1BindingInitialization0" (this, BindingRestProperty, value, environment) => {
    let excludedNames = (new [])
    access __x0__ = (BindingRestProperty "RestBindingInitialization")
    app __x1__ = (__x0__ value environment excludedNames)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
