package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition5HasDirectSuper0 {
  val length: Int = 0
  val func: Func = parseFunc(""""MethodDefinition5HasDirectSuper0" (this, PropertyName, PropertySetParameterList, FunctionBody) => {
    access __x0__ = (PropertySetParameterList "Contains")
    app __x1__ = (__x0__ "SuperCall")
    if (= __x1__ true) return true else {}
    access __x2__ = (FunctionBody "Contains")
    app __x3__ = (__x2__ "SuperCall")
    return __x3__
  }""")
}
