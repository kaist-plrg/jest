package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTthrow {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.throw" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let O = this
    app __x1__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    app __x2__ = (Type O)
    if (|| (! (= __x2__ Object)) (= O["SyncIteratorRecord"] absent)) {
      let invalidIteratorError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [invalidIteratorError]))
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
      app __x4__ = (WrapCompletion promiseCapability["Promise"])
      return __x4__
    } else {}
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x5__ = (GetMethod syncIterator "throw")
    let throw = __x5__
    if (is-completion throw) if (= throw["Type"] CONST_normal) throw = throw["Value"] else {
      app __x6__ = (Call promiseCapability["Reject"] undefined (new [throw["Value"]]))
      if (&& (is-completion __x6__) (! (= __x6__["Type"] CONST_normal))) return __x6__ else {}
      return promiseCapability["Promise"]
    } else {}
    throw
    if (= throw undefined) {
      app __x7__ = (Call promiseCapability["Reject"] undefined (new [value]))
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      __x7__
      app __x8__ = (WrapCompletion promiseCapability["Promise"])
      return __x8__
    } else {}
    app __x9__ = (Call throw syncIterator (new [value]))
    let result = __x9__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x10__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x10__) (! (= __x10__["Type"] CONST_normal))) return __x10__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x11__ = (Type result)
    if (! (= __x11__ Object)) {
      app __x12__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      __x12__
      app __x13__ = (WrapCompletion promiseCapability["Promise"])
      return __x13__
    } else {}
    app __x14__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
    app __x15__ = (WrapCompletion __x14__)
    return __x15__
  }""")
}
