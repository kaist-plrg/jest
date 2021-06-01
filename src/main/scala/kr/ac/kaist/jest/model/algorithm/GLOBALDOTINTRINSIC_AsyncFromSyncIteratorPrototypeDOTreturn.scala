package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTreturn extends Algorithm {
  val name: String = "GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTreturn"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.return" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let O = this
    app __x1__ = (Type O)
    assert (&& (= __x1__ Object) (! (= O["SyncIteratorRecord"] absent)))
    app __x2__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let promiseCapability = __x2__
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x3__ = (GetMethod syncIterator "return")
    let return = __x3__
    if (is-completion return) if (= return["Type"] CONST_normal) return = return["Value"] else {
      app __x4__ = (Call promiseCapability["Reject"] undefined (new [return["Value"]]))
      if (&& (is-completion __x4__) (! (= __x4__["Type"] CONST_normal))) return __x4__ else {}
      return promiseCapability["Promise"]
    } else {}
    return
    if (= return undefined) {
      app __x5__ = (CreateIterResultObject value true)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let iterResult = __x5__
      app __x6__ = (Call promiseCapability["Resolve"] undefined (new [iterResult]))
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      __x6__
      app __x7__ = (WrapCompletion promiseCapability["Promise"])
      return __x7__
    } else {}
    app __x8__ = (Call return syncIterator (new [value]))
    let result = __x8__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x9__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x9__) (! (= __x9__["Type"] CONST_normal))) return __x9__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x10__ = (Type result)
    if (! (= __x10__ Object)) {
      app __x11__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      app __x12__ = (WrapCompletion promiseCapability["Promise"])
      return __x12__
    } else {}
    app __x13__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    app __x14__ = (WrapCompletion __x13__)
    return __x14__
  }"""), this)
}
