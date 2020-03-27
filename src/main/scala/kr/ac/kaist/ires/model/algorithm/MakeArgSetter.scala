package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeArgSetter {
  val length: Int = 2
  val func: Func = Func("""MakeArgSetter""", List(Id("""name"""), Id("""env""")), None, ISeq(List(ILet(Id("""steps"""), ERef(RefId(Id("""ArgSetter""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""Name"""), EStr("""Env"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""setter"""), ERef(RefId(Id("""__x0__""")))), IAssign(RefProp(RefId(Id("""setter""")), EStr("""Name""")), ERef(RefId(Id("""name""")))), IAssign(RefProp(RefId(Id("""setter""")), EStr("""Env""")), ERef(RefId(Id("""env""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""setter"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "MakeArgSetter" (name, env) => {
    let steps = ArgSetter
    app __x0__ = (CreateBuiltinFunction steps (new ["Name", "Env"]))
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let setter = __x0__
    setter["Name"] = name
    setter["Env"] = env
    app __x1__ = (WrapCompletion setter)
    return __x1__
  }
  */
}
