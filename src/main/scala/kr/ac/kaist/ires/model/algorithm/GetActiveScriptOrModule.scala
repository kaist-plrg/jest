package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetActiveScriptOrModule {
  val length: Int = 0
  val func: Func = Func("""GetActiveScriptOrModule""", List(), None, ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENull)), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), ILet(Id("""__x1__"""), ERef(RefId(Id("""GLOBAL_executionStack""")))), ILet(Id("""__x2__"""), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""__x2__""")))), ISeq(List(IAssign(RefId(Id("""__x2__""")), EBOp(OSub, ERef(RefId(Id("""__x2__"""))), EINum(1L))), ILet(Id("""ec"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""ec""")), EStr("""ScriptOrModule"""))), ENull)), IReturn(ERef(RefProp(RefId(Id("""ec""")), EStr("""ScriptOrModule""")))), ISeq(List()))))), IReturn(ENull))))
  /* Beautified form:
  "GetActiveScriptOrModule" () => {
    if (= GLOBAL_executionStack["length"] 0i) {
      app __x0__ = (WrapCompletion null)
      return __x0__
    } else {}
    let __x1__ = GLOBAL_executionStack
    let __x2__ = __x1__["length"]
    while (< 0i __x2__) {
      __x2__ = (- __x2__ 1i)
      let ec = __x1__[__x2__]
      if (! (= ec["ScriptOrModule"] null)) return ec["ScriptOrModule"] else {}
    }
    return null
  }
  */
}
