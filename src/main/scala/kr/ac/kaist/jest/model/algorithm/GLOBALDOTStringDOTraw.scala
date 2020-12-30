package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTraw extends Algorithm {
  val name: String = "GLOBALDOTStringDOTraw"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.raw" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.raw"

    app __x0__ = (GetArgument argumentsList 0i)
    let template = __x0__
    !!! "Etc"
    let numberOfSubstitutions = substitutions["length"]
    app __x1__ = (ToObject template)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let cooked = __x1__
    app __x2__ = (Get cooked "raw")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (ToObject __x2__)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let raw = __x3__
    app __x4__ = (LengthOfArrayLike raw)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let literalSegments = __x4__
    if (! (< 0i literalSegments)) {
      app __x5__ = (WrapCompletion "")
      return __x5__
    } else {}
    let stringElements = (new [])
    let nextIndex = 0i
    while true {
      app __x6__ = (ToString nextIndex)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let nextKey = __x6__
      app __x7__ = (Get raw nextKey)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      app __x8__ = (ToString __x7__)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let nextSeg = __x8__
      !!! "Etc"
      if (== (+ nextIndex 1i) literalSegments) {
        app __x9__ = (WrapCompletion !!! "StringOp")
        return __x9__
      } else {}
      if (< nextIndex numberOfSubstitutions) let next = substitutions[nextIndex] else let next = ""
      app __x10__ = (ToString next)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let nextSub = __x10__
      !!! "Etc"
      nextIndex = (+ nextIndex 1i)
    }
  }"""), this)
}
