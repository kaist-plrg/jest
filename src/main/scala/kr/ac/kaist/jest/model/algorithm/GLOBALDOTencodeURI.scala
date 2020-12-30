package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTencodeURI extends Algorithm {
  val name: String = "GLOBALDOTencodeURI"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.encodeURI" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.encodeURI"

    app __x0__ = (GetArgument argumentsList 0i)
    let uri = __x0__
    app __x1__ = (ToString uri)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let uriString = __x1__
    !!! "Let id:{unescapedURISet} be a String containing one instance of each code unit valid in nt:{urjesterved} and nt:{uriUnescaped} plus value:{\"#\"} ."
    app __x2__ = (Encode uriString unescapedURISet)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
