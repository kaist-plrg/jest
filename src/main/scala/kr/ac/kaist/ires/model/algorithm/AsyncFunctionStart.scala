package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionStart {
  val length: Int = 2
  val func: Func = Func("""AsyncFunctionStart""", List(Id("""promiseCapability"""), Id("""asyncFunctionBody""")), None, ISeq(List(ILet(Id("""runningContext"""), ERef(RefId(Id("""GLOBAL_context""")))), ILet(Id("""asyncContext"""), ECopy(ERef(RefId(Id("""runningContext"""))))), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont""")), ECont(List(), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""asyncFunctionBody"""))), EStr("""Evaluation""")), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__ret__"""), ERef(RefId(Id("""asyncContext"""))), EStr("""ReturnCont""")), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""asyncContext""")))), ISeq(List(IAssign(RefId(Id("""__x1__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x1__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(EUndef)))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x2__""")))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x3__""")))))), ISeq(List(IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x4__""")))))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IApp(Id("""__x6__"""), ERef(RefId(Id("""__ret__"""))), List(ERef(RefId(Id("""__x5__"""))))))))), IAppend(ERef(RefId(Id("""asyncContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IWithCont(Id("""__x7__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")), EList(List())), ISeq(List())), IAppend(ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")))), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont"""))), List())))), IApp(Id("""__x9__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x9__""")))))))
  /* Beautified form:
  "AsyncFunctionStart" (promiseCapability, asyncFunctionBody) => {
    let runningContext = GLOBAL_context
    let asyncContext = (copy-obj runningContext)
    asyncContext["ResumeCont"] = () [=>] {
      access __x0__ = (asyncFunctionBody "Evaluation")
      let result = __x0__
      access __ret__ = (asyncContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] asyncContext) {
        __x1__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x1__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      if (= result["Type"] CONST_normal) {
        app __x2__ = (Call promiseCapability["Resolve"] undefined (new [undefined]))
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        __x2__
      } else if (= result["Type"] CONST_return) {
        app __x3__ = (Call promiseCapability["Resolve"] undefined (new [result["Value"]]))
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        __x3__
      } else {
        assert (= result["Type"] CONST_throw)
        app __x4__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        __x4__
      }
      app __x5__ = (NormalCompletion undefined)
      app __x6__ = (__ret__ __x5__)
    }
    append asyncContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x7__ (result) ={
      if (= asyncContext["ReturnCont"] absent) asyncContext["ReturnCont"] = (new []) else {}
      append __x7__ -> asyncContext["ReturnCont"]
      app __x8__ = (asyncContext["ResumeCont"] )
    }
    app __x9__ = (NormalCompletion undefined)
    return __x9__
  }
  */
}
