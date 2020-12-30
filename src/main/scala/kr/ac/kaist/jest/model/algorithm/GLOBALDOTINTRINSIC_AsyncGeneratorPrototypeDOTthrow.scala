package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncGeneratorPrototypeDOTthrow extends Algorithm {
  val name: String = "GLOBALDOTINTRINSIC_AsyncGeneratorPrototypeDOTthrow"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.INTRINSIC_AsyncGeneratorPrototype.throw" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let exception = __x0__
    let generator = this
    app __x1__ = (ThrowCompletion exception)
    let completion = __x1__
    app __x2__ = (AsyncGeneratorEnqueue generator completion)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
