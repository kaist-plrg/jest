package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTsplice extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTsplice"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.splice" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let start = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let deleteCount = __x1__
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (Get O "length")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (ToLength __x3__)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let len = __x4__
    app __x5__ = (ToInteger start)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let relativeStart = __x5__
    if (< relativeStart 0i) {
      app __x6__ = (max (+ len relativeStart) 0i)
      let actualStart = __x6__
    } else {
      app __x7__ = (min relativeStart len)
      let actualStart = __x7__
    }
    if (= argumentsList["length"] 0i) {
      let insertCount = 0i
      let actualDeleteCount = 0i
    } else if (= argumentsList["length"] 1i) {
      let insertCount = 0i
      let actualDeleteCount = (- len actualStart)
    } else {
      let insertCount = (- argumentsList["length"] 2i)
      app __x8__ = (ToInteger deleteCount)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let dc = __x8__
      app __x9__ = (max dc 0i)
      app __x10__ = (min __x9__ (- len actualStart))
      let actualDeleteCount = __x10__
    }
    if (< (- 9007199254740992i 1i) (- (+ len insertCount) actualDeleteCount)) {
      app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x11__
    } else {}
    app __x12__ = (ArraySpeciesCreate O actualDeleteCount)
    if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let A = __x12__
    let k = 0i
    while (< k actualDeleteCount) {
      app __x13__ = (ToString (+ actualStart k))
      if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      let from = __x13__
      app __x14__ = (HasProperty O from)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let fromPresent = __x14__
      if (= fromPresent true) {
        app __x15__ = (Get O from)
        if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        let fromValue = __x15__
        app __x16__ = (ToString k)
        if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        app __x17__ = (CreateDataPropertyOrThrow A __x16__ fromValue)
        if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
        __x17__
      } else {}
      k = (+ k 1i)
    }
    app __x18__ = (Set A "length" actualDeleteCount true)
    if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
    __x18__
    if (< 2i argumentsList["length"]) {
      (pop argumentsList 0i)
      (pop argumentsList 0i)
    } else argumentsList = (new [])
    let items = argumentsList
    let itemCount = items["length"]
    if (< itemCount actualDeleteCount) {
      k = actualStart
      while (< k (- len actualDeleteCount)) {
        app __x19__ = (ToString (+ k actualDeleteCount))
        if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        let from = __x19__
        app __x20__ = (ToString (+ k itemCount))
        if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        let to = __x20__
        app __x21__ = (HasProperty O from)
        if (is-completion __x21__) if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
        let fromPresent = __x21__
        if (= fromPresent true) {
          app __x22__ = (Get O from)
          if (is-completion __x22__) if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
          let fromValue = __x22__
          app __x23__ = (Set O to fromValue true)
          if (is-completion __x23__) if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
          __x23__
        } else {
          app __x24__ = (DeletePropertyOrThrow O to)
          if (is-completion __x24__) if (= __x24__["Type"] CONST_normal) __x24__ = __x24__["Value"] else return __x24__ else {}
          __x24__
        }
        k = (+ k 1i)
      }
      k = len
      while (< (+ (- len actualDeleteCount) itemCount) k) {
        app __x25__ = (ToString (- k 1i))
        if (is-completion __x25__) if (= __x25__["Type"] CONST_normal) __x25__ = __x25__["Value"] else return __x25__ else {}
        app __x26__ = (DeletePropertyOrThrow O __x25__)
        if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
        __x26__
        k = (- k 1i)
      }
    } else if (< actualDeleteCount itemCount) {
      k = (- len actualDeleteCount)
      while (< actualStart k) {
        app __x27__ = (ToString (- (+ k actualDeleteCount) 1i))
        if (is-completion __x27__) if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
        let from = __x27__
        app __x28__ = (ToString (- (+ k itemCount) 1i))
        if (is-completion __x28__) if (= __x28__["Type"] CONST_normal) __x28__ = __x28__["Value"] else return __x28__ else {}
        let to = __x28__
        app __x29__ = (HasProperty O from)
        if (is-completion __x29__) if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
        let fromPresent = __x29__
        if (= fromPresent true) {
          app __x30__ = (Get O from)
          if (is-completion __x30__) if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
          let fromValue = __x30__
          app __x31__ = (Set O to fromValue true)
          if (is-completion __x31__) if (= __x31__["Type"] CONST_normal) __x31__ = __x31__["Value"] else return __x31__ else {}
          __x31__
        } else {
          app __x32__ = (DeletePropertyOrThrow O to)
          if (is-completion __x32__) if (= __x32__["Type"] CONST_normal) __x32__ = __x32__["Value"] else return __x32__ else {}
          __x32__
        }
        k = (- k 1i)
      }
    } else {}
    k = actualStart
    while (< 0i items["length"]) {
      let E = (pop items 0i)
      app __x33__ = (ToString k)
      if (is-completion __x33__) if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
      app __x34__ = (Set O __x33__ E true)
      if (is-completion __x34__) if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
      __x34__
      k = (+ k 1i)
    }
    app __x35__ = (Set O "length" (+ (- len actualDeleteCount) itemCount) true)
    if (is-completion __x35__) if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
    __x35__
    app __x36__ = (WrapCompletion A)
    return __x36__
  }"""), this)
}
