package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTparseInt {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.parseInt""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""string"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""radix"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""string"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""inputString"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""TrimString"""))), List(ERef(RefId(Id("""inputString"""))), EStr("""start"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))), ILet(Id("""sign"""), EINum(1L)), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""radix"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""R"""), ERef(RefId(Id("""__x4__""")))), ILet(Id("""stripPrefix"""), EBool(true)), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""R"""))), EINum(0L))), ISeq(List(IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""R"""))), EINum(2L)), EBOp(OLt, EINum(36L), ERef(RefId(Id("""R"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENum(Double.NaN))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""R"""))), EINum(16L))), IAssign(RefId(Id("""stripPrefix""")), EBool(false)), ISeq(List())))), IAssign(RefId(Id("""R""")), EINum(10L))), IIf(EBOp(OEq, ERef(RefId(Id("""stripPrefix"""))), EBool(true)), IExpr(ENotSupported("""Etc""")), ISeq(List())), IExpr(ENotSupported("""StringOp""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Z""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENum(Double.NaN))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""mathInt"""), ENotSupported("""NumberOp""")), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OMul, ERef(RefId(Id("""sign"""))), ERef(RefId(Id("""number""")))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "GLOBAL.parseInt" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let radix = __x1__
    app __x2__ = (ToString string)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let inputString = __x2__
    app __x3__ = (TrimString inputString "start")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    let sign = 1i
    !!! "Etc"
    !!! "Etc"
    app __x4__ = (ToInt32 radix)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let R = __x4__
    let stripPrefix = true
    if (! (= R 0i)) {
      if (|| (< R 2i) (< 36i R)) {
        app __x5__ = (WrapCompletion NaN)
        return __x5__
      } else {}
      if (! (= R 16i)) stripPrefix = false else {}
    } else R = 10i
    if (= stripPrefix true) !!! "Etc" else {}
    !!! "StringOp"
    if (= Z["length"] 0i) {
      app __x6__ = (WrapCompletion NaN)
      return __x6__
    } else {}
    let mathInt = !!! "NumberOp"
    !!! "Etc"
    !!! "Etc"
    app __x7__ = (WrapCompletion (* sign number))
    return __x7__
  }
  */
}
