package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object InstanceofOperator extends Algorithm {
  val name: String = "InstanceofOperator"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""InstanceofOperator" (V, target) => {
    app __x0__ = (Type target)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (GetMethod target SYMBOL_hasInstance)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let instOfHandler = __x2__
    if (! (= instOfHandler undefined)) {
      app __x3__ = (Call instOfHandler target (new [V]))
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (ToBoolean __x3__)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (IsCallable target)
    if (= __x6__ false) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    app __x8__ = (OrdinaryHasInstance target V)
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }"""), this)
}
