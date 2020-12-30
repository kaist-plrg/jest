package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTFunctionDOTprototypeDOTtoString extends Algorithm {
  val name: String = "GLOBALDOTFunctionDOTprototypeDOTtoString"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Function.prototype.toString" (this, argumentsList, NewTarget) => {
    let func = this
    if (|| (= (typeof func) "BoundFunctionExoticObject") (= (typeof func) "BuiltinFunctionObject")) {
      ??? "TODO: toString of built-in functions"
      app __x0__ = (WrapCompletion "")
      return __x0__
    } else {}
    app T = (Type func)
    if (&& (= T "Object") (! (= func.SourceText absent))) {
      app T = (Type func.SourceText)
      app available = (HostHasSourceTextAvailable func)
      ! available
      if (&& (= T "String") available) {
        app wrapped = (WrapCompletion func.SourceText)
        return wrapped
      } else {}
    } else {}
    app __x1__ = (Type func)
    let __x2__ = (= __x1__ Object)
    if __x2__ {
      app __x3__ = (IsCallable func)
      __x2__ = (= __x3__ true)
    } else {}
    if __x2__ {
      app __x4__ = (WrapCompletion "")
      return __x4__
    } else {}
    app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x5__
  }"""), this)
}
