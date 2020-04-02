package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncGeneratorPrototypeDOTnext {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.INTRINSIC_AsyncGeneratorPrototype.next" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let generator = this
    app __x1__ = (NormalCompletion value)
    let completion = __x1__
    app __x2__ = (AsyncGeneratorEnqueue generator completion)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}