package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTCatchFinallyFunctions {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.CatchFinallyFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))), ILet(Id("""onFinally"""), ERef(RefProp(RefId(Id("""F""")), EStr("""OnFinally""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onFinally"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""onFinally"""))), EUndef)), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""result"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""C"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Constructor""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true))), IApp(Id("""__x3__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""result"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""promise"""), ERef(RefId(Id("""__x3__""")))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x4__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""promise"""))), EStr("""then"""), EList(List(ERef(RefId(Id("""thrower"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "GLOBAL.CatchFinallyFunctions" (this, argumentsList, NewTarget) => {
    let F = GLOBAL_context["Function"]
    let onFinally = F["OnFinally"]
    app __x0__ = (IsCallable onFinally)
    assert (= __x0__ true)
    app __x1__ = (Call onFinally undefined)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let result = __x1__
    let C = F["Constructor"]
    app __x2__ = (IsConstructor C)
    assert (= __x2__ true)
    app __x3__ = (PromiseResolve C result)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let promise = __x3__
    !!! "Etc"
    app __x4__ = (Invoke promise "then" (new [thrower]))
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
