package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringPad {
  val length: Int = 4
  val func: Func = Func("""StringPad""", List(Id("""O"""), Id("""maxLength"""), Id("""fillString"""), Id("""placement""")), None, ISeq(List(IAssert(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""placement"""))), EStr("""start""")), EBOp(OEq, ERef(RefId(Id("""placement"""))), EStr("""end""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""S"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToLength"""))), List(ERef(RefId(Id("""maxLength"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""intMaxLength"""), ERef(RefId(Id("""__x1__""")))), ILet(Id("""stringLength"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))), IExpr(ENotSupported("""Etc""")), IIf(EBOp(OEq, ERef(RefId(Id("""fillString"""))), EUndef), ILet(Id("""filler"""), ENotSupported("""StringOp""")), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""fillString"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""filler"""), ERef(RefId(Id("""__x2__"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""filler"""))), EStr("""""")), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), ILet(Id("""fillLen"""), EBOp(OSub, ERef(RefId(Id("""intMaxLength"""))), ERef(RefId(Id("""stringLength"""))))), ILet(Id("""truncatedStringFiller"""), ENotSupported("""StringOp""")), IIf(EBOp(OEq, ERef(RefId(Id("""placement"""))), EStr("""start""")), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""truncatedStringFiller"""))), ERef(RefId(Id("""S""")))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""S"""))), ERef(RefId(Id("""truncatedStringFiller""")))))), IReturn(ERef(RefId(Id("""__x5__"""))))))))))
  /* Beautified form:
  "StringPad" (O, maxLength, fillString, placement) => {
    assert (|| (= placement "start") (= placement "end"))
    app __x0__ = (ToString O)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let S = __x0__
    app __x1__ = (ToLength maxLength)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let intMaxLength = __x1__
    let stringLength = S["length"]
    !!! "Etc"
    if (= fillString undefined) let filler = !!! "StringOp" else {
      app __x2__ = (ToString fillString)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let filler = __x2__
    }
    if (= filler "") {
      app __x3__ = (WrapCompletion S)
      return __x3__
    } else {}
    let fillLen = (- intMaxLength stringLength)
    let truncatedStringFiller = !!! "StringOp"
    if (= placement "start") {
      app __x4__ = (WrapCompletion (+ truncatedStringFiller S))
      return __x4__
    } else {
      app __x5__ = (WrapCompletion (+ S truncatedStringFiller))
      return __x5__
    }
  }
  */
}
