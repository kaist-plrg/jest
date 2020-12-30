package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTparseInt extends Algorithm {
  val name: String = "GLOBALDOTparseInt"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.parseInt" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.parseInt"

    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let radix = __x1__
    app __x2__ = (ToString string)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let inputString = __x2__
    app __x3__ = (TrimString inputString CONST_start)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    let sign = 1i
    !!! "Etc"
    !!! "Etc"
    app __x4__ = (ToInt32 radix)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let R = __x4__
    let stripPrefix = true
    if (! (== R 0i)) {
      if (|| (< R 2i) (< 36i R)) {
        app __x5__ = (WrapCompletion NaN)
        return __x5__
      } else {}
      if (! (== R 16i)) stripPrefix = false else {}
    } else R = 10i
    if (= stripPrefix true) !!! "If the length of id:{S} is at least 2 and the first two code units of id:{S} are either value:{\"0x\"} or value:{\"0X\"} , then step-list:{...}" else {}
    !!! "StringOp"
    if (= Z["length"] 0i) {
      app __x6__ = (WrapCompletion NaN)
      return __x6__
    } else {}
    let mathInt = !!! "NumberOp"
    !!! "Etc"
    !!! "Etc"
    app __x7__ = (WrapCompletion (* sign number))
    return __x7__
  }"""), this)
}
