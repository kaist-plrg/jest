package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionCreate {
  val length: Int = 4
  val func: Func = Func("""FunctionCreate""", List(Id("""kind"""), Id("""ParameterList"""), Id("""Body"""), Id("""Scope"""), Id("""prototype""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""prototype"""))), EAbsent), IAssign(RefId(Id("""prototype""")), ERef(RefId(Id("""INTRINSIC_FunctionPrototype""")))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""CONST_Normal"""))))), ILet(Id("""allocKind"""), EStr("""non-constructor""")), ILet(Id("""allocKind"""), EStr("""normal"""))), IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionAllocate"""))), List(ERef(RefId(Id("""prototype"""))), ERef(RefId(Id("""allocKind"""))))), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionInitialize"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""ParameterList"""))), ERef(RefId(Id("""Body"""))), ERef(RefId(Id("""Scope"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "FunctionCreate" (kind, ParameterList, Body, Scope, prototype) => {
    if (= prototype absent) prototype = INTRINSIC_FunctionPrototype else {}
    if (! (= kind CONST_Normal)) let allocKind = "non-constructor" else let allocKind = "normal"
    app __x0__ = (FunctionAllocate prototype allocKind)
    let F = __x0__
    app __x1__ = (FunctionInitialize F kind ParameterList Body Scope)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
