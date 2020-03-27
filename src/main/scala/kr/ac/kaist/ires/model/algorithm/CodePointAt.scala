package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CodePointAt {
  val length: Int = 2
  val func: Func = Func("""CodePointAt""", List(Id("""string"""), Id("""position""")), None, ISeq(List(ILet(Id("""size"""), ERef(RefProp(RefId(Id("""string""")), EStr("""length""")))), IAssert(EBOp(OAnd, EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""position"""))), EINum(0L))), EBOp(OLt, ERef(RefId(Id("""position"""))), ERef(RefId(Id("""size""")))))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x0__"""), ERef(RefId(Id("""UTF16Decode"""))), List(ERef(RefId(Id("""first"""))), ERef(RefId(Id("""second"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IAssign(RefId(Id("""cp""")), ERef(RefId(Id("""__x0__""")))), IReturn(EMap(Ty("""Record"""), List((EStr("""CodePoint"""), ERef(RefId(Id("""cp""")))), (EStr("""CodeUnitCount"""), EINum(2L)), (EStr("""IsUnpairedSurrogate"""), EBool(false))))))))
  /* Beautified form:
  "CodePointAt" (string, position) => {
    let size = string["length"]
    assert (&& (! (< position 0i)) (< position size))
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (UTF16Decode first second)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    cp = __x0__
    return (new Record("CodePoint" -> cp, "CodeUnitCount" -> 2i, "IsUnpairedSurrogate" -> false))
  }
  */
}
