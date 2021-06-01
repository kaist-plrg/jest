package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTnext extends Algorithm {
  val name: String = "GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTnext"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let O = this
    app __x1__ = (Type O)
    assert (&& (= __x1__ Object) (! (= O["SyncIteratorRecord"] absent)))
    app __x2__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let promiseCapability = __x2__
    let syncIteratorRecord = O["SyncIteratorRecord"]
    app __x3__ = (IteratorNext syncIteratorRecord value)
    let result = __x3__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x4__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x4__) (! (= __x4__["Type"] CONST_normal))) return __x4__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x5__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
