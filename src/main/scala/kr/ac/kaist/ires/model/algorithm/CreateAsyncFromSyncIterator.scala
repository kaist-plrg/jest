package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateAsyncFromSyncIterator {
  val length: Int = 1
  val func: Func = parseFunc(""""CreateAsyncFromSyncIterator" (syncIteratorRecord) => {
    app __x0__ = (ObjectCreate INTRINSIC_AsyncFromSyncIteratorPrototype (new ["SyncIteratorRecord"]))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let asyncIterator = __x0__
    asyncIterator["SyncIteratorRecord"] = syncIteratorRecord
    app __x1__ = (GetIterator asyncIterator CONST_async)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
