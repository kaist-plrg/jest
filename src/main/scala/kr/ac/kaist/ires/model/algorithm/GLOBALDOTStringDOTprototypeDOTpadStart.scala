package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTpadStart extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTpadStart"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.padStart" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let maxLength = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let fillString = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    app __x4__ = (ToLength maxLength)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let intMaxLength = __x4__
    let stringLength = S["length"]
    !!! "Etc"
    if (= fillString undefined) let filler = !!! "StringOp" else {
      app __x5__ = (ToString fillString)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let filler = __x5__
    }
    if (= filler "") {
      app __x6__ = (WrapCompletion S)
      return __x6__
    } else {}
    let fillLen = (- intMaxLength stringLength)
    let truncatedStringFiller = !!! "StringOp"
    app __x7__ = (WrapCompletion (+ truncatedStringFiller S))
    return __x7__
  }"""), this)
}
