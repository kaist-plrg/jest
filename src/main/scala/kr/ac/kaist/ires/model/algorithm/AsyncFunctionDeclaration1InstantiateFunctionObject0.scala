package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionDeclaration1InstantiateFunctionObject0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AsyncFunctionDeclaration1InstantiateFunctionObject0" (this, FormalParameters, AsyncFunctionBody, scope) => {
    if true let strict = true else let strict = false
    app __x0__ = (AsyncFunctionCreate CONST_Normal FormalParameters AsyncFunctionBody scope strict)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let F = __x0__
    app __x1__ = (SetFunctionName F "default")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    F["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion F)
    return __x2__
  }""")
}
