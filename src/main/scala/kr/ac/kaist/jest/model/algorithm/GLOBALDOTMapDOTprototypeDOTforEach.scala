package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTMapDOTprototypeDOTforEach extends Algorithm {
  val name: String = "GLOBALDOTMapDOTprototypeDOTforEach"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Map.prototype.forEach" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    let M = this
    app __x2__ = (RequireInternalSlot M "MapData")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (IsCallable callbackfn)
    if (= __x3__ false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    let entries = M["MapData"]
    let idx = 0i
    while (< idx entries.length) {
      let e = entries[idx]
      if (! (= e.Key CONST_empty)) {
        app result = (Call callbackfn thisArg (new [e.Value, e.Key, M]))
        ? result
      } else {}
      idx = (+ idx 1i)
    }
    app __x5__ = (WrapCompletion undefined)
    return __x5__
  }"""), this)
}
