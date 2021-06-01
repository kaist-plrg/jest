package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AdditiveExpression1Evaluation0 extends Algorithm {
  val name: String = "AdditiveExpression1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AdditiveExpression1Evaluation0" (this, AdditiveExpression, MultiplicativeExpression) => {
    access __x0__ = (AdditiveExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (MultiplicativeExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (ToPrimitive lval)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let lprim = __x4__
    app __x5__ = (ToPrimitive rval)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let rprim = __x5__
    app __x6__ = (Type lprim)
    let __x7__ = (= __x6__ String)
    if __x7__ {} else {
      app __x8__ = (Type rprim)
      __x7__ = (= __x8__ String)
    }
    if __x7__ {
      app __x9__ = (ToString lprim)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let lstr = __x9__
      app __x10__ = (ToString rprim)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let rstr = __x10__
      app __x11__ = (WrapCompletion (+ lstr rstr))
      return __x11__
    } else {}
    app __x12__ = (ToNumeric lprim)
    if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let lnum = __x12__
    app __x13__ = (ToNumeric rprim)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let rnum = __x13__
    app __x14__ = (Type lnum)
    app __x15__ = (Type rnum)
    if (! (= __x14__ __x15__)) {
      app __x16__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x16__
    } else {}
    app __x17__ = (Type lnum)
    let T = __x17__
    app __x18__ = (PRIMITIVES[T].add lnum rnum)
    app __x19__ = (WrapCompletion __x18__)
    return __x19__

  }"""), this)
}
