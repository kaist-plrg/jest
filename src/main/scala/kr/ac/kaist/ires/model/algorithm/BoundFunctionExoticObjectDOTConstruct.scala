package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BoundFunctionExoticObjectDOTConstruct {
  val length: Int = 2
  val func: Func = Func("""BoundFunctionExoticObject.Construct""", List(Id("""F"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""target"""), ERef(RefProp(RefId(Id("""F""")), EStr("""BoundTargetFunction""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""target"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), ILet(Id("""boundArgs"""), ERef(RefProp(RefId(Id("""F""")), EStr("""BoundArguments""")))), ILet(Id("""__x1__"""), ECopy(ERef(RefId(Id("""boundArgs"""))))), ILet(Id("""__x2__"""), ERef(RefId(Id("""argumentsList""")))), ILet(Id("""__x3__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""__x1__""")))), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L)))))), ILet(Id("""args"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""newTarget"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), IAssign(RefId(Id("""newTarget""")), ERef(RefId(Id("""target""")))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""args"""))), ERef(RefId(Id("""newTarget"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "BoundFunctionExoticObject.Construct" (F, argumentsList, newTarget) => {
    let target = F["BoundTargetFunction"]
    app __x0__ = (IsConstructor target)
    assert (= __x0__ true)
    let boundArgs = F["BoundArguments"]
    let __x1__ = (copy-obj boundArgs)
    let __x2__ = argumentsList
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> __x1__
      __x3__ = (+ __x3__ 1i)
    }
    let args = __x1__
    app __x5__ = (SameValue F newTarget)
    if (= __x5__ true) newTarget = target else {}
    app __x6__ = (Construct target args newTarget)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
