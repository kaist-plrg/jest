package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFunctionDOTprototypeDOTtoString extends Algorithm {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Function.prototype.toString" (this, argumentsList, NewTarget) => {
    let func = this
    if (|| (= (typeof func) "BoundFunctionExoticObject") (= (typeof func) "BuiltinFunctionObject")) {
      app __x0__ = (WrapCompletion "")
      return __x0__
    } else {}
    app __x1__ = (Type func)
    let __x2__ = (= __x1__ Object)
    if __x2__ {
      let __x3__ = (! (= func["SourceText"] absent))
      if __x3__ {
        app __x4__ = (Type func["SourceText"])
        let __x5__ = (= __x4__ String)
        if __x5__ {
          app __x6__ = (HostHasSourceTextAvailable func)
          if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          __x5__ = (= __x6__ true)
        } else {}
        __x3__ = __x5__
      } else {}
      __x2__ = __x3__
    } else {}
    if __x2__ {
      app __x7__ = (WrapCompletion func["SourceText"])
      return __x7__
    } else {}
    app __x8__ = (Type func)
    let __x9__ = (= __x8__ Object)
    if __x9__ {
      app __x10__ = (IsCallable func)
      __x9__ = (= __x10__ true)
    } else {}
    if __x9__ {
      app __x11__ = (WrapCompletion "")
      return __x11__
    } else {}
    app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x12__
  }"""))
}
