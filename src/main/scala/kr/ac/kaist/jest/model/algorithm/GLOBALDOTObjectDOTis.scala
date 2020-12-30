package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTObjectDOTis extends Algorithm {
  val name: String = "GLOBALDOTObjectDOTis"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Object.is" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value1 = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value2 = __x1__
    app __x2__ = (SameValue value1 value2)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
