package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTassign extends Algorithm {
  val name: String = "GLOBALDOTObjectDOTassign"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Object.assign" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
    app __x1__ = (ToObject target)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let to = __x1__
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x2__ = (WrapCompletion to)
    return __x2__
  }"""), this)
}
