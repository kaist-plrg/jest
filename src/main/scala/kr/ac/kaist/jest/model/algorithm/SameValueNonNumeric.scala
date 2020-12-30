package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SameValueNonNumeric extends Algorithm {
  val name: String = "SameValueNonNumeric"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SameValueNonNumeric" (x, y) => {
    app __x0__ = (Type x)
    assert (! (|| (= __x0__ Number) (= __x0__ BigInt)))
    app __x1__ = (Type x)
    app __x2__ = (Type y)
    assert (= __x1__ __x2__)
    app __x3__ = (Type x)
    if (= __x3__ Undefined) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    app __x5__ = (Type x)
    if (= __x5__ Null) {
      app __x6__ = (WrapCompletion true)
      return __x6__
    } else {}
    app __x7__ = (Type x)
    if (= __x7__ String) if (= x y) {
      app __x8__ = (WrapCompletion true)
      return __x8__
    } else {
      app __x9__ = (WrapCompletion false)
      return __x9__
    } else {}
    app __x10__ = (Type x)
    if (= __x10__ Boolean) if (|| (&& (= x true) (= y true)) (&& (= x false) (= y false))) {
      app __x11__ = (WrapCompletion true)
      return __x11__
    } else {
      app __x12__ = (WrapCompletion false)
      return __x12__
    } else {}
    app __x13__ = (Type x)
    if (= __x13__ Symbol) if (= x y) {
      app __x14__ = (WrapCompletion true)
      return __x14__
    } else {
      app __x15__ = (WrapCompletion false)
      return __x15__
    } else {}
    if (= x y) {
      app __x16__ = (WrapCompletion true)
      return __x16__
    } else {
      app __x17__ = (WrapCompletion false)
      return __x17__
    }
  }"""), this)
}
