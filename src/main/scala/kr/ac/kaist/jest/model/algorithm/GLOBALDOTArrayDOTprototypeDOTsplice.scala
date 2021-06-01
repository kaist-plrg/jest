package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

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
    app __x3__ = (LengthOfArrayLike O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (ToInteger start)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let relativeStart = __x4__
    if (< relativeStart 0i) {
      app __x5__ = (max (+ len relativeStart) 0i)
      let actualStart = __x5__
    } else {
      app __x6__ = (min relativeStart len)
      let actualStart = __x6__
    }
    if (= argumentsList["length"] 0i) {
      let insertCount = 0i
      let actualDeleteCount = 0i
    } else if (= argumentsList["length"] 1i) {
      let insertCount = 0i
      let actualDeleteCount = (- len actualStart)
    } else {
      let insertCount = (- argumentsList["length"] 2i)
      app __x7__ = (ToInteger deleteCount)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let dc = __x7__
      app __x8__ = (max dc 0i)
      app __x9__ = (min __x8__ (- len actualStart))
      let actualDeleteCount = __x9__
    }
    if (< (- 9007199254740992i 1i) (- (+ len insertCount) actualDeleteCount)) {
      app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x10__
    } else {}
    app __x11__ = (ArraySpeciesCreate O actualDeleteCount)
    if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    let A = __x11__
    let k = 0i
    while (< k actualDeleteCount) {
      app __x12__ = (ToString (+ actualStart k))
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let from = __x12__
      app __x13__ = (HasProperty O from)
      if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      let fromPresent = __x13__
      if (= fromPresent true) {
        app __x14__ = (Get O from)
        if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        let fromValue = __x14__
        app __x15__ = (ToString k)
        if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        app __x16__ = (CreateDataPropertyOrThrow A __x15__ fromValue)
        if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        __x16__
      } else {}
      k = (+ k 1i)
    }
    app __x17__ = (Set A "length" actualDeleteCount true)
    if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
    __x17__
    if (< 2i argumentsList["length"]) {
      (pop argumentsList 0i)
      (pop argumentsList 0i)
    } else argumentsList = (new [])
    let items = argumentsList
    let itemCount = items["length"]
    if (< itemCount actualDeleteCount) {
      k = actualStart
      while (< k (- len actualDeleteCount)) {
        app __x18__ = (ToString (+ k actualDeleteCount))
        if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
        let from = __x18__
        app __x19__ = (ToString (+ k itemCount))
        if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        let to = __x19__
        app __x20__ = (HasProperty O from)
        if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        let fromPresent = __x20__
        if (= fromPresent true) {
          app __x21__ = (Get O from)
          if (is-completion __x21__) if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
          let fromValue = __x21__
          app __x22__ = (Set O to fromValue true)
          if (is-completion __x22__) if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
          __x22__
        } else {
          assert (= fromPresent false)
          app __x23__ = (DeletePropertyOrThrow O to)
          if (is-completion __x23__) if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
          __x23__
        }
        k = (+ k 1i)
      }
      k = len
      while (< (+ (- len actualDeleteCount) itemCount) k) {
        app __x24__ = (ToString (- k 1i))
        if (is-completion __x24__) if (= __x24__["Type"] CONST_normal) __x24__ = __x24__["Value"] else return __x24__ else {}
        app __x25__ = (DeletePropertyOrThrow O __x24__)
        if (is-completion __x25__) if (= __x25__["Type"] CONST_normal) __x25__ = __x25__["Value"] else return __x25__ else {}
        __x25__
        k = (- k 1i)
      }
    } else if (< actualDeleteCount itemCount) {
      k = (- len actualDeleteCount)
      while (< actualStart k) {
        app __x26__ = (ToString (- (+ k actualDeleteCount) 1i))
        if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
        let from = __x26__
        app __x27__ = (ToString (- (+ k itemCount) 1i))
        if (is-completion __x27__) if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
        let to = __x27__
        app __x28__ = (HasProperty O from)
        if (is-completion __x28__) if (= __x28__["Type"] CONST_normal) __x28__ = __x28__["Value"] else return __x28__ else {}
        let fromPresent = __x28__
        if (= fromPresent true) {
          app __x29__ = (Get O from)
          if (is-completion __x29__) if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
          let fromValue = __x29__
          app __x30__ = (Set O to fromValue true)
          if (is-completion __x30__) if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
          __x30__
        } else {
          assert (= fromPresent false)
          app __x31__ = (DeletePropertyOrThrow O to)
          if (is-completion __x31__) if (= __x31__["Type"] CONST_normal) __x31__ = __x31__["Value"] else return __x31__ else {}
          __x31__
        }
        k = (- k 1i)
      }
    } else {}
    k = actualStart
    while (< 0i items["length"]) {
      let E = (pop items 0i)
      app __x32__ = (ToString k)
      if (is-completion __x32__) if (= __x32__["Type"] CONST_normal) __x32__ = __x32__["Value"] else return __x32__ else {}
      app __x33__ = (Set O __x32__ E true)
      if (is-completion __x33__) if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
      __x33__
      k = (+ k 1i)
    }
    app __x34__ = (Set O "length" (+ (- len actualDeleteCount) itemCount) true)
    if (is-completion __x34__) if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
    __x34__
    app __x35__ = (WrapCompletion A)
    return __x35__
  }"""), this)
}
