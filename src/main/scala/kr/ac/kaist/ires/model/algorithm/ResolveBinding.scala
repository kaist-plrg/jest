package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ResolveBinding {
  val length: Int = 1
  val func: Func = Func("""ResolveBinding""", List(Id("""name"""), Id("""env""")), None, ISeq(List(IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""env"""))), EAbsent), EBOp(OEq, ERef(RefId(Id("""env"""))), EUndef)), IAssign(RefId(Id("""env""")), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))), ISeq(List())), IAssert(EBOp(OEq, ETypeOf(ERef(RefId(Id("""env""")))), EStr("""LexicalEnvironment"""))), IIf(EBool(true), ILet(Id("""strict"""), EBool(true)), ILet(Id("""strict"""), EBool(false))), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetIdentifierReference"""))), List(ERef(RefId(Id("""env"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""strict"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "ResolveBinding" (name, env) => {
    if (|| (= env absent) (= env undefined)) env = GLOBAL_context["LexicalEnvironment"] else {}
    assert (= (typeof env) "LexicalEnvironment")
    if true let strict = true else let strict = false
    app __x0__ = (GetIdentifierReference env name strict)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
