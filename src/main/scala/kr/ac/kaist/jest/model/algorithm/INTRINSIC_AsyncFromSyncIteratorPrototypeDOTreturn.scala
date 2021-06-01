package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object INTRINSIC_AsyncFromSyncIteratorPrototypeDOTreturn extends Algorithm {
  val name: String = "INTRINSIC_AsyncFromSyncIteratorPrototypeDOTreturn"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""INTRINSIC_AsyncFromSyncIteratorPrototype.return" (value) => {
    let O = this
    app __x0__ = (Type O)
    assert (&& (= __x0__ Object) (! (= O["SyncIteratorRecord"] absent)))
    app __x1__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x2__ = (GetMethod syncIterator "return")
    let return = __x2__
    if (is-completion return) if (= return["Type"] CONST_normal) return = return["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [return["Value"]]))
      if (&& (is-completion __x3__) (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    return
    if (= return undefined) {
      app __x4__ = (CreateIterResultObject value true)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let iterResult = __x4__
      app __x5__ = (Call promiseCapability["Resolve"] undefined (new [iterResult]))
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      __x5__
      app __x6__ = (WrapCompletion promiseCapability["Promise"])
      return __x6__
    } else {}
    app __x7__ = (Call return syncIterator (new [value]))
    let result = __x7__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x8__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x8__) (! (= __x8__["Type"] CONST_normal))) return __x8__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x9__ = (Type result)
    if (! (= __x9__ Object)) {
      app __x10__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      __x10__
      app __x11__ = (WrapCompletion promiseCapability["Promise"])
      return __x11__
    } else {}
    app __x12__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }"""), this)
}
