package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SameValueNonNumeric {
  val length: Int = 2
  val func: Func = parseFunc(""""SameValueNonNumeric" (x, y) => {
    app __x0__ = (Type x)
    assert (! (|| (= __x0__ Number) (= __x0__ BigInt)))
    app __x1__ = (Type x)
    if (= __x1__ Undefined) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (Type x)
    if (= __x3__ Null) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    app __x5__ = (Type x)
    if (= __x5__ String) if (= x y) {
      app __x6__ = (WrapCompletion true)
      return __x6__
    } else {
      app __x7__ = (WrapCompletion false)
      return __x7__
    } else {}
    app __x8__ = (Type x)
    if (= __x8__ Boolean) if (|| (&& (= x true) (= y true)) (&& (= x false) (= y false))) {
      app __x9__ = (WrapCompletion true)
      return __x9__
    } else {
      app __x10__ = (WrapCompletion false)
      return __x10__
    } else {}
    app __x11__ = (Type x)
    if (= __x11__ Symbol) if (= x y) {
      app __x12__ = (WrapCompletion true)
      return __x12__
    } else {
      app __x13__ = (WrapCompletion false)
      return __x13__
    } else {}
    if (= x y) {
      app __x14__ = (WrapCompletion true)
      return __x14__
    } else {
      app __x15__ = (WrapCompletion false)
      return __x15__
    }
  }""")
}
