package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object InitializeBoundName {
  val length: Int = 3
  val func: Func = Func("""InitializeBoundName""", List(Id("""name"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""name"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""environment"""))), EUndef)), ISeq(List(ILet(Id("""env"""), ERef(RefProp(RefId(Id("""environment""")), EStr("""EnvironmentRecord""")))), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""env"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""value"""))))), IExpr(ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""name"""))))), ILet(Id("""lhs"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""value"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))), IReturn(ERef(RefId(Id("""__x6__"""))))))))))
  /* Beautified form:
  "InitializeBoundName" (name, value, environment) => {
    app __x0__ = (Type name)
    assert (= __x0__ String)
    if (! (= environment undefined)) {
      let env = environment["EnvironmentRecord"]
      app __x1__ = (env["InitializeBinding"] env name value)
      __x1__
      app __x2__ = (NormalCompletion undefined)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {
      app __x4__ = (ResolveBinding name)
      let lhs = __x4__
      app __x5__ = (PutValue lhs value)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    }
  }
  */
}
