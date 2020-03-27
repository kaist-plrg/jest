package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTparseFloat {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.parseFloat""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""string"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""string"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""inputString"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""TrimString"""))), List(ERef(RefId(Id("""inputString"""))), EStr("""start"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""trimmedString"""), ERef(RefId(Id("""__x2__""")))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IAccess(Id("""__x3__"""), ERef(RefId(Id("""numberString"""))), EStr("""MV""")), ILet(Id("""mathFloat"""), ERef(RefId(Id("""__x3__""")))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")))))
  /* Beautified form:
  "GLOBAL.parseFloat" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (ToString string)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let inputString = __x1__
    app __x2__ = (TrimString inputString "start")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let trimmedString = __x2__
    !!! "Etc"
    !!! "Etc"
    access __x3__ = (numberString "MV")
    let mathFloat = __x3__
    !!! "Etc"
    !!! "Etc"
  }
  */
}
