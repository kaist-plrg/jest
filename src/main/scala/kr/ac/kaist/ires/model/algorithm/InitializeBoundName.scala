package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object InitializeBoundName {
  val length: Int = 3
  val func: Func = Func("""InitializeBoundName""", List(Id("""name"""), Id("""value"""), Id("""environment""")), None, IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""environment"""))), EUndef)), ISeq(List(ILet(Id("""env"""), ERef(RefProp(RefId(Id("""environment""")), EStr("""EnvironmentRecord""")))), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""env"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""value"""))))), IExpr(ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""name"""))))), ILet(Id("""lhs"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""value"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__"""))))))))
  /* Beautified form:
  "InitializeBoundName" (name, value, environment) => if (! (= environment undefined)) {
    let env = environment["EnvironmentRecord"]
    app __x0__ = (env["InitializeBinding"] env name value)
    __x0__
    app __x1__ = (NormalCompletion undefined)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  } else {
    app __x3__ = (ResolveBinding name)
    let lhs = __x3__
    app __x4__ = (PutValue lhs value)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
