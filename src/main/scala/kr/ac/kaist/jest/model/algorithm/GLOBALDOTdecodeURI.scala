package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTdecodeURI extends Algorithm {
  val name: String = "GLOBALDOTdecodeURI"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.decodeURI" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.decodeURI"

    app __x0__ = (GetArgument argumentsList 0i)
    let encodedURI = __x0__
    app __x1__ = (ToString encodedURI)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let uriString = __x1__
    !!! "Let id:{reservedURISet} be a String containing one instance of each code unit valid in nt:{urjesterved} plus value:{\"#\"} ."
    app __x2__ = (Decode uriString reservedURISet)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
