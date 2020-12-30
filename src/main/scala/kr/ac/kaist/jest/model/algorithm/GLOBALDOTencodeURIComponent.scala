package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTencodeURIComponent extends Algorithm {
  val name: String = "GLOBALDOTencodeURIComponent"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.encodeURIComponent" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.encodeURIComponent"

    app __x0__ = (GetArgument argumentsList 0i)
    let uriComponent = __x0__
    app __x1__ = (ToString uriComponent)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let componentString = __x1__
    !!! "Etc"
    app __x2__ = (Encode componentString unescapedURIComponentSet)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
