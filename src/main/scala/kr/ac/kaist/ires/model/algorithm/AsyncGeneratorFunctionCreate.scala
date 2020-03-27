package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorFunctionCreate {
  val length: Int = 4
  val func: Func = Func("""AsyncGeneratorFunctionCreate""", List(Id("""kind"""), Id("""ParameterList"""), Id("""Body"""), Id("""Scope""")), None, ISeq(List(ILet(Id("""functionPrototype"""), ERef(RefId(Id("""INTRINSIC_AsyncGenerator""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionAllocate"""))), List(ERef(RefId(Id("""functionPrototype"""))), EStr("""generator"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionInitialize"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""ParameterList"""))), ERef(RefId(Id("""Body"""))), ERef(RefId(Id("""Scope"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "AsyncGeneratorFunctionCreate" (kind, ParameterList, Body, Scope) => {
    let functionPrototype = INTRINSIC_AsyncGenerator
    app __x0__ = (FunctionAllocate functionPrototype "generator")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let F = __x0__
    app __x1__ = (FunctionInitialize F kind ParameterList Body Scope)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
