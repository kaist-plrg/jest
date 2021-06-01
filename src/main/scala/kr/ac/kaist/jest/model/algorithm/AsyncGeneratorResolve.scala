package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncGeneratorResolve extends Algorithm {
  val name: String = "AsyncGeneratorResolve"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncGeneratorResolve" (generator, value, done) => {
    let queue = generator["AsyncGeneratorQueue"]
    assert (< 0i queue["length"])
    let next = (pop queue 0i)
    let promiseCapability = next["Capability"]
    app __x0__ = (CreateIterResultObject value done)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorResult = __x0__
    app __x1__ = (Call promiseCapability["Resolve"] undefined (new [iteratorResult]))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (AsyncGeneratorResumeNext generator)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }"""), this)
}
