package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object thisSymbolValue extends Algorithm {
  val name: String = "thisSymbolValue"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""thisSymbolValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ Symbol) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["SymbolData"] absent))) {
      let s = value["SymbolData"]
      app __x3__ = (Type s)
      assert (= __x3__ Symbol)
      app __x4__ = (WrapCompletion s)
      return __x4__
    } else {}
    app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x5__
  }"""), this)
}
