package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AbstractRelationalComparison extends Algorithm {
  val name: String = "AbstractRelationalComparison"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AbstractRelationalComparison" (x, y, LeftFirst) => {
    if (= LeftFirst absent) let LeftFirst = true else {}
    if (= LeftFirst true) {
      app __x0__ = (ToPrimitive x Number)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let px = __x0__
      app __x1__ = (ToPrimitive y Number)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let py = __x1__
    } else {
      app __x2__ = (ToPrimitive y Number)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let py = __x2__
      app __x3__ = (ToPrimitive x Number)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let px = __x3__
    }
    app __x4__ = (Type px)
    let __x5__ = (= __x4__ String)
    if __x5__ {
      app __x6__ = (Type py)
      __x5__ = (= __x6__ String)
    } else {}
    if __x5__ return (< px py) else {
      app __x7__ = (Type px)
      let __x8__ = (= __x7__ BigInt)
      if __x8__ {
        app __x9__ = (Type py)
        __x8__ = (= __x9__ String)
      } else {}
      if __x8__ {
        app __x10__ = (StringToBigInt py)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let ny = __x10__
        if (= ny NaN) {
          app __x11__ = (WrapCompletion undefined)
          return __x11__
        } else {}
        app result = (PRIMITIVES.BigInt.lessThan px ny)
        app wrapped = (WrapCompletion result)
        return wrapped
      } else {}
      app __x12__ = (Type px)
      let __x13__ = (= __x12__ String)
      if __x13__ {
        app __x14__ = (Type py)
        __x13__ = (= __x14__ BigInt)
      } else {}
      if __x13__ {
        app __x15__ = (StringToBigInt px)
        if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        let nx = __x15__
        if (= nx NaN) {
          app __x16__ = (WrapCompletion undefined)
          return __x16__
        } else {}
        app result = (PRIMITIVES.BigInt.lessThan nx py)
        app wrapped = (WrapCompletion result)
        return wrapped
      } else {}
      app __x17__ = (ToNumeric px)
      if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
      let nx = __x17__
      app __x18__ = (ToNumeric py)
      if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
      let ny = __x18__
      app nxT = (Type nx)
      app nyT = (Type ny)
      if (= nxT nyT) {
        app result = (PRIMITIVES[nxT].lessThan nx ny)
        app wrapped = (WrapCompletion result)
        return wrapped
      } else {}
      assert (|| (&& (= nxT BigInt) (= nyT Number)) (&& (= nxT Number) (= nyT BigInt)))
      if (|| (= nx NaN) (= ny NaN)) {
        app __x26__ = (WrapCompletion undefined)
        return __x26__
      } else {}
      if (|| (= nx -Infinity) (= ny Infinity)) {
        app __x27__ = (WrapCompletion true)
        return __x27__
      } else {}
      if (|| (= nx Infinity) (= ny -Infinity)) {
        app __x28__ = (WrapCompletion false)
        return __x28__
      } else {}
      return (< nx ny)
    }
  }"""), this)
}
