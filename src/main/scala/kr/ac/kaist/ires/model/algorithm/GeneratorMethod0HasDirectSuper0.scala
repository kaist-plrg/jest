package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorMethod0HasDirectSuper0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""GeneratorMethod0HasDirectSuper0" (this, PropertyName, UniqueFormalParameters, GeneratorBody) => {
    access __x0__ = (UniqueFormalParameters "Contains")
    app __x1__ = (__x0__ "SuperCall")
    if (= __x1__ true) return true else {}
    access __x2__ = (GeneratorBody "Contains")
    app __x3__ = (__x2__ "SuperCall")
    return __x3__
  }""")
}
