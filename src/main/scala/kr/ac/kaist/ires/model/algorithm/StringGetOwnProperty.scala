package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringGetOwnProperty {
  val length: Int = 2
  val func: Func = Func("""StringGetOwnProperty""", List(Id("""S"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""String"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""index"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), EUndef), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""index"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), ILet(Id("""str"""), ERef(RefProp(RefId(Id("""S""")), EStr("""StringData""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""str"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""String"""))))), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""str""")), EStr("""length""")))), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len""")))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), ILet(Id("""resultStr"""), ERef(RefProp(RefId(Id("""str""")), ERef(RefId(Id("""index""")))))), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""resultStr""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(false)))))), IReturn(ERef(RefId(Id("""__x10__""")))))))
  /* Beautified form:
  "StringGetOwnProperty" (S, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (! (= __x1__ String)) {
      app __x2__ = (WrapCompletion undefined)
      return __x2__
    } else {}
    app __x3__ = (CanonicalNumericIndexString P)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let index = __x3__
    if (= index undefined) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    app __x5__ = (IsInteger index)
    if (= __x5__ false) {
      app __x6__ = (WrapCompletion undefined)
      return __x6__
    } else {}
    if (= index -0.0) {
      app __x7__ = (WrapCompletion undefined)
      return __x7__
    } else {}
    let str = S["StringData"]
    app __x8__ = (Type str)
    assert (= __x8__ String)
    let len = str["length"]
    if (|| (< index 0i) (! (< index len))) {
      app __x9__ = (WrapCompletion undefined)
      return __x9__
    } else {}
    let resultStr = str[index]
    app __x10__ = (WrapCompletion (new PropertyDescriptor("Value" -> resultStr, "Writable" -> false, "Enumerable" -> true, "Configurable" -> false)))
    return __x10__
  }
  */
}
