package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTraw {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.String.raw" (this, argumentsList, NewTarget) => {
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
    app __x4__ = (Get raw "length")
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (ToLength __x4__)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let literalSegments = __x5__
    if (! (< 0i literalSegments)) {
      app __x6__ = (WrapCompletion "")
      return __x6__
    } else {}
    let stringElements = (new [])
    let nextIndex = 0i
    while true {
      app __x7__ = (ToString nextIndex)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let nextKey = __x7__
      app __x8__ = (Get raw nextKey)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (ToString __x8__)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let nextSeg = __x9__
      !!! "Etc"
      if (== (+ nextIndex 1i) literalSegments) {
        app __x10__ = (WrapCompletion !!! "StringOp")
        return __x10__
      } else {}
      if (< nextIndex numberOfSubstitutions) let next = substitutions[nextIndex] else let next = ""
      app __x11__ = (ToString next)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let nextSub = __x11__
      !!! "Etc"
      nextIndex = (+ nextIndex 1i)
    }
  }""")
}
