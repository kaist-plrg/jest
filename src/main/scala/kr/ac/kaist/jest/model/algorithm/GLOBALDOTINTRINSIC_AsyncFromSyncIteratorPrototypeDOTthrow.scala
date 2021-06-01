package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTthrow extends Algorithm {
  val name: String = "GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTthrow"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.throw" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let O = this
    app __x1__ = (Type O)
    assert (&& (= __x1__ Object) (! (= O["SyncIteratorRecord"] absent)))
    app __x2__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let promiseCapability = __x2__
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x3__ = (GetMethod syncIterator "throw")
    let throw = __x3__
    if (is-completion throw) if (= throw["Type"] CONST_normal) throw = throw["Value"] else {
      app __x4__ = (Call promiseCapability["Reject"] undefined (new [throw["Value"]]))
      if (&& (is-completion __x4__) (! (= __x4__["Type"] CONST_normal))) return __x4__ else {}
      return promiseCapability["Promise"]
    } else {}
    throw
    if (= throw undefined) {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [value]))
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      __x5__
      app __x6__ = (WrapCompletion promiseCapability["Promise"])
      return __x6__
    } else {}
    app __x7__ = (Call throw syncIterator (new [value]))
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
