package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object EvaluateCall extends Algorithm {
  val name: String = "EvaluateCall"
  val length: Int = 4
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""EvaluateCall" (func, ref, arguments, tailPosition) => {
    if (is-completion ref) if (= ref["Type"] CONST_normal) ref = ref["Value"] else return ref else {}
    ref
    app __x0__ = (Type ref)
    if (= __x0__ Reference) {
      app __x1__ = (IsPropertyReference ref)
      if (= __x1__ true) {
        app __x2__ = (GetThisValue ref)
        let thisValue = __x2__
      } else {
        app __x3__ = (GetBase ref)
        let refEnv = __x3__
        app __x4__ = (refEnv["WithBaseObject"] refEnv)
        let thisValue = __x4__
      }
    } else let thisValue = undefined
    access __x5__ = (arguments "ArgumentListEvaluation")
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let argList = __x5__
    app __x6__ = (Type func)
    if (! (= __x6__ Object)) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    app __x8__ = (IsCallable func)
    if (= __x8__ false) {
      app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x9__
    } else {}
    if (= tailPosition true) {
      app __x10__ = (PrepareForTailCall )
      __x10__
    } else {}
    app __x11__ = (Call func thisValue argList)
    let result = __x11__
    app __x12__ = (WrapCompletion result)
    return __x12__
  }"""), this)
}
