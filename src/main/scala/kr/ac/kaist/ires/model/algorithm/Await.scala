package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Await {
  val length: Int = 0
  val func: Func = Func("""Await""", List(Id("""value""")), None, ISeq(List(ILet(Id("""asyncContext"""), ERef(RefId(Id("""GLOBAL_context""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))), ERef(RefId(Id("""value"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""promise"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""stepsFulfilled"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTAwaitFulfilledFunctions"""))))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsFulfilled"""))), EList(List(EStr("""AsyncContext"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""onFulfilled""")), EStr("""AsyncContext""")), ERef(RefId(Id("""asyncContext""")))), ILet(Id("""stepsRejected"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTAwaitRejectedFunctions"""))))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsRejected"""))), EList(List(EStr("""AsyncContext"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""onRejected"""), ERef(RefId(Id("""__x2__""")))), IAssign(RefProp(RefId(Id("""onRejected""")), EStr("""AsyncContext""")), ERef(RefId(Id("""asyncContext""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""PerformPromiseThen"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""onFulfilled"""))), ERef(RefId(Id("""onRejected"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""asyncContext""")))), ISeq(List(IAssign(RefId(Id("""__x4__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x4__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IAccess(Id("""__ret__"""), ERef(RefId(Id("""asyncContext"""))), EStr("""ReturnCont""")), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont""")), ECont(List(Id("""completion""")), IReturn(ERef(RefId(Id("""completion""")))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IApp(Id("""__x6__"""), ERef(RefId(Id("""__ret__"""))), List(ERef(RefId(Id("""__x5__"""))))))))
  /* Beautified form:
  "Await" (value) => {
    let asyncContext = GLOBAL_context
    app __x0__ = (PromiseResolve INTRINSIC_Promise value)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promise = __x0__
    let stepsFulfilled = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAwaitFulfilledFunctions))
    app __x1__ = (CreateBuiltinFunction stepsFulfilled (new ["AsyncContext"]))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let onFulfilled = __x1__
    onFulfilled["AsyncContext"] = asyncContext
    let stepsRejected = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAwaitRejectedFunctions))
    app __x2__ = (CreateBuiltinFunction stepsRejected (new ["AsyncContext"]))
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let onRejected = __x2__
    onRejected["AsyncContext"] = asyncContext
    app __x3__ = (PerformPromiseThen promise onFulfilled onRejected)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] asyncContext) {
      __x4__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x4__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    access __ret__ = (asyncContext "ReturnCont")
    __ret__ = (pop __ret__ 0i)
    asyncContext["ResumeCont"] = (completion) [=>] return completion
    app __x5__ = (NormalCompletion undefined)
    app __x6__ = (__ret__ __x5__)
  }
  */
}
