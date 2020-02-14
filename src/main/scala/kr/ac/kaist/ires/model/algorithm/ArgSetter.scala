package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgSetter {
  val length: Int = 2
  val func: Func = Func("""ArgSetter""", List(Id("""_0"""), Id("""argumentsList"""), Id("""_1"""), Id("""f""")), None, ISeq(List(ILet(Id("""value"""), ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L)))), ILet(Id("""f"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))), ILet(Id("""name"""), ERef(RefProp(RefId(Id("""f""")), EStr("""Name""")))), ILet(Id("""env"""), ERef(RefProp(RefId(Id("""f""")), EStr("""Env""")))), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""env"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""value"""))), EBool(false))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "ArgSetter" (_0, argumentsList, _1, f) => {
    let value = argumentsList[0i]
    let f = GLOBAL_context["Function"]
    let name = f["Name"]
    let env = f["Env"]
    app __x0__ = (env["SetMutableBinding"] env name value false)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
