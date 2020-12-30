package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTfromCharCode extends Algorithm {
  val name: String = "GLOBALDOTStringDOTfromCharCode"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.fromCharCode" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.fromCharCode"

    !!! "Etc"
    let length = codeUnits["length"]
    let elements = (new [])
    let nextIndex = 0i
    while (< nextIndex length) {
      let next = codeUnits[nextIndex]
      app __x0__ = (ToUint16 next)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let nextCU = __x0__
      append nextCU -> elements
      nextIndex = (+ nextIndex 1i)
    }
    app __x1__ = (WrapCompletion !!! "StringOp")
    return __x1__
  }"""), this)
}
