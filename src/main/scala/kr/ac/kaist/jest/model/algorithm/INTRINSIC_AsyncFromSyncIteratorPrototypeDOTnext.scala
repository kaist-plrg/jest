package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object INTRINSIC_AsyncFromSyncIteratorPrototypeDOTnext extends Algorithm {
  val name: String = "INTRINSIC_AsyncFromSyncIteratorPrototypeDOTnext"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""INTRINSIC_AsyncFromSyncIteratorPrototype.next" (value) => {
    let O = this
    app __x0__ = (Type O)
    assert (&& (= __x0__ Object) (! (= O["SyncIteratorRecord"] absent)))
    app __x1__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    let syncIteratorRecord = O["SyncIteratorRecord"]
    app __x2__ = (IteratorNext syncIteratorRecord value)
    let result = __x2__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x3__) (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x4__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
