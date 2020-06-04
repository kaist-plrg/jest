package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionCreate extends Algorithm {
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionCreate" (kind, ParameterList, Body, Scope, Strict, prototype) => {
    if (= prototype absent) prototype = INTRINSIC_FunctionPrototype else {}
    if (! (= kind CONST_Normal)) let allocKind = "non-constructor" else let allocKind = "normal"
    app __x0__ = (FunctionAllocate prototype Strict allocKind)
    let F = __x0__
    app __x1__ = (FunctionInitialize F kind ParameterList Body Scope)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""))
}
