package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTSetMutableBinding {
  val length: Int = 3
  val func: Func = parseFunc(""""DeclarativeEnvironmentRecord.SetMutableBinding" (this, N, V, S) => {
    let envRec = this
    if (= absent envRec["SubMap"][N]) {
      if (= S true) {
        app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x0__
      } else {}
      app __x1__ = (envRec["CreateMutableBinding"] envRec N true)
      __x1__
      app __x2__ = (envRec["InitializeBinding"] envRec N V)
      __x2__
      app __x3__ = (NormalCompletion CONST_empty)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    if (&& (! (= absent envRec["SubMap"][N]["strict"])) envRec["SubMap"][N]["strict"]) S = true else {}
    if (&& (! (= absent envRec["SubMap"][N]["initialized"])) (! envRec["SubMap"][N]["initialized"])) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else if (= (typeof envRec["SubMap"][N]) "MutableBinding") envRec["SubMap"][N]["BoundValue"] = V else if (= S true) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    app __x7__ = (NormalCompletion CONST_empty)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }""")
}
