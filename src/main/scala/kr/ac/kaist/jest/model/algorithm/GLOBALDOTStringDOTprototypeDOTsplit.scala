package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTsplit extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTsplit"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.split" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let separator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let limit = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    if (! (|| (= separator undefined) (= separator null))) {
      app __x3__ = (GetMethod separator SYMBOL_split)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let splitter = __x3__
      if (! (= splitter undefined)) {
        app __x4__ = (Call splitter separator (new [O, limit]))
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
    } else {}
    app __x6__ = (ToString O)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let S = __x6__
    app __x7__ = (ArrayCreate 0i)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let A = __x7__
    let lengthA = 0i
    if (= limit undefined) let lim = (- 4294967296i 1i) else {
      app __x8__ = (ToUint32 limit)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let lim = __x8__
    }
    let s = S["length"]
    let p = 0i
    app __x9__ = (ToString separator)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let R = __x9__
    if (== lim 0i) {
      app __x10__ = (WrapCompletion A)
      return __x10__
    } else {}
    if (= separator undefined) {
      app __x11__ = (CreateDataPropertyOrThrow A "0" S)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      app __x12__ = (WrapCompletion A)
      return __x12__
    } else {}
    if (== s 0i) {
      app __x13__ = (SplitMatch S 0i R)
      let z = __x13__
      if (! (= z false)) {
        app __x14__ = (WrapCompletion A)
        return __x14__
      } else {}
      app __x15__ = (CreateDataPropertyOrThrow A "0" S)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x15__
      app __x16__ = (WrapCompletion A)
      return __x16__
    } else {}
    let q = p
    while (! (== q s)) {
      app __x17__ = (SplitMatch S q R)
      let e = __x17__
      if (= e false) q = (+ q 1i) else {
        if (== e p) q = (+ q 1i) else {
          let T = ""
          let idx = p
          while (< idx q) {
            T = (+ T S[idx])
            idx = (+ idx 1i)
          }
          app __x18__ = (ToString lengthA)
          if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
          app __x19__ = (CreateDataPropertyOrThrow A __x18__ T)
          if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
          __x19__
          lengthA = (+ lengthA 1i)
          if (== lengthA lim) {
            app __x20__ = (WrapCompletion A)
            return __x20__
          } else {}
          p = e
          q = p
        }
      }
    }
    let T = ""
    let idx = p
    while (< idx s) {
      T = (+ T S[idx])
      idx = (+ idx 1i)
    }
    app __x21__ = (ToString lengthA)
    if (is-completion __x21__) if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
    app __x22__ = (CreateDataPropertyOrThrow A __x21__ T)
    if (is-completion __x22__) if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
    __x22__
    app __x23__ = (WrapCompletion A)
    return __x23__
  }"""), this)
}
