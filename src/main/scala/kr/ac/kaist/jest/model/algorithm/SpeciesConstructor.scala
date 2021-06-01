package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SpeciesConstructor extends Algorithm {
  val name: String = "SpeciesConstructor"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SpeciesConstructor" (O, defaultConstructor) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    app __x1__ = (Get O "constructor")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let C = __x1__
    if (= C undefined) {
      app __x2__ = (WrapCompletion defaultConstructor)
      return __x2__
    } else {}
    app __x3__ = (Type C)
    if (! (= __x3__ Object)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (Get C SYMBOL_species)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let S = __x5__
    if (|| (= S undefined) (= S null)) {
      app __x6__ = (WrapCompletion defaultConstructor)
      return __x6__
    } else {}
    app __x7__ = (IsConstructor S)
    if (= __x7__ true) {
      app __x8__ = (WrapCompletion S)
      return __x8__
    } else {}
    app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x9__
  }"""), this)
}
