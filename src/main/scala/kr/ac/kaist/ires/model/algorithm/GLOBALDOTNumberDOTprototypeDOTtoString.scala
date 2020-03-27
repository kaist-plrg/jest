package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoString {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.prototype.toString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""radix"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), EAbsent), ILet(Id("""radixNumber"""), EINum(10L)), IIf(EBOp(OEq, ERef(RefId(Id("""radix"""))), EUndef), ILet(Id("""radixNumber"""), EINum(10L)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""radix"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""radixNumber"""), ERef(RefId(Id("""__x2__""")))))))), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""radixNumber"""))), EINum(2L)), EBOp(OLt, EINum(36L), ERef(RefId(Id("""radixNumber"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""radixNumber"""))), EINum(10L)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""x"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""0"""))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IIf(EBOp(OLt, ERef(RefId(Id("""x"""))), ENum(0.0)), ISeq(List(IAssign(RefId(Id("""x""")), EUOp(ONeg, ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""-Infinity"""))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""__x6__"""), EBOp(OPlus, EStr("""-"""), EConvert(ERef(RefId(Id("""x"""))), CNumToStr, List(ERef(RefId(Id("""radixNumber"""))))))))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""Infinity"""))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""__x6__"""), EConvert(ERef(RefId(Id("""x"""))), CNumToStr, List(ERef(RefId(Id("""radixNumber"""))))))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "GLOBAL.Number.prototype.toString" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let radix = __x0__
    app __x1__ = (thisNumberValue this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    if (= argumentsList[0i] absent) let radixNumber = 10i else if (= radix undefined) let radixNumber = 10i else {
      app __x2__ = (ToInteger radix)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let radixNumber = __x2__
    }
    if (|| (< radixNumber 2i) (< 36i radixNumber)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    if (= radixNumber 10i) {
      app __x4__ = (ToString x)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    if (= x NaN) {
      app __x6__ = (WrapCompletion "NaN")
      return __x6__
    } else {}
    if (|| (= x 0i) (= x -0.0)) {
      app __x6__ = (WrapCompletion "0")
      return __x6__
    } else {}
    if (< x 0.0) {
      x = (- x)
      if (= x Infinity) {
        app __x6__ = (WrapCompletion "-Infinity")
        return __x6__
      } else {}
      let __x6__ = (+ "-" (convert x num2str radixNumber))
    } else {
      if (= x Infinity) {
        app __x6__ = (WrapCompletion "Infinity")
        return __x6__
      } else {}
      let __x6__ = (convert x num2str radixNumber)
    }
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
