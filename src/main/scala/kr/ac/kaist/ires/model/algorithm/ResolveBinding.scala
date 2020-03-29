package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ResolveBinding {
  val length: Int = 1
  val func: Func = parseFunc(""""ResolveBinding" (name, env) => {
    if (|| (= env absent) (= env undefined)) env = GLOBAL_context["LexicalEnvironment"] else {}
    assert (= (typeof env) "LexicalEnvironment")
    if true let strict = true else let strict = false
    app __x0__ = (GetIdentifierReference env name strict)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
