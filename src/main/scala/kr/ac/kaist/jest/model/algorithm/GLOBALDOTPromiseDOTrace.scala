package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTPromiseDOTrace extends Algorithm {
  val name: String = "GLOBALDOTPromiseDOTrace"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Promise.race" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    let C = this
    app __x1__ = (NewPromiseCapability C)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    app __x2__ = (GetIterator iterable)
    let iteratorRecord = __x2__
    if (is-completion iteratorRecord) if (= iteratorRecord["Type"] CONST_normal) iteratorRecord = iteratorRecord["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [iteratorRecord["Value"]]))
      if (&& (is-completion __x3__) (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    iteratorRecord
    app __x4__ = (PerformPromiseRace iteratorRecord C promiseCapability)
    let result = __x4__
    app __x5__ = (IsAbruptCompletion result)
    if __x5__ {
      if (= iteratorRecord["Done"] false) {
        app __x6__ = (IteratorClose iteratorRecord result)
        result = __x6__
      } else {}
      if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
        app __x7__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
        if (&& (is-completion __x7__) (! (= __x7__["Type"] CONST_normal))) return __x7__ else {}
        return promiseCapability["Promise"]
      } else {}
      result
    } else {}
    app __x8__ = (Completion result)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }"""), this)
}
