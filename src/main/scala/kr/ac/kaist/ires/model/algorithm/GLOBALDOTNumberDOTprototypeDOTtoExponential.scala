package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoExponential {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.prototype.toExponential""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""fractionDigits"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""fractionDigits"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""f"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), ILet(Id("""s"""), EStr("""""")), IIf(EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(IAssign(RefId(Id("""s""")), EStr("""-""")), IAssign(RefId(Id("""x""")), EUOp(ONeg, ERef(RefId(Id("""x"""))))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), EStr("""Infinity""")))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""f"""))), EINum(0L)), EBOp(OLt, EINum(100L), ERef(RefId(Id("""f"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(ILet(Id("""m"""), ENotSupported("""StringOp""")), ILet(Id("""e"""), EINum(0L)))), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""fractionDigits"""))), EUndef)), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc"""))), ILet(Id("""m"""), ENotSupported("""StringOp"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""f"""))), EINum(0L))), ISeq(List(IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""a"""))), EStr(""".""")), ERef(RefId(Id("""b"""))))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""e"""))), EINum(0L)), ISeq(List(ILet(Id("""c"""), EStr("""+""")), ILet(Id("""d"""), EStr("""0""")))), ISeq(List(IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""e""")))), ILet(Id("""c"""), EStr("""+""")), ISeq(List(IAssert(EBOp(OLt, ERef(RefId(Id("""e"""))), EINum(0L))), ILet(Id("""c"""), EStr("""-""")), IAssign(RefId(Id("""e""")), EUOp(ONeg, ERef(RefId(Id("""e""")))))))), ILet(Id("""d"""), ENotSupported("""StringOp"""))))), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""m"""))), EStr("""e""")), ERef(RefId(Id("""c""")))), ERef(RefId(Id("""d"""))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "GLOBAL.Number.prototype.toExponential" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let fractionDigits = __x0__
    app __x1__ = (thisNumberValue this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    app __x2__ = (ToInteger fractionDigits)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let f = __x2__
    if (= x NaN) {
      app __x3__ = (WrapCompletion "NaN")
      return __x3__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (= x Infinity) {
      app __x4__ = (WrapCompletion (+ s "Infinity"))
      return __x4__
    } else {}
    if (|| (< f 0i) (< 100i f)) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (= x 0i) {
      let m = !!! "StringOp"
      let e = 0i
    } else {
      if (! (= fractionDigits undefined)) !!! "Etc" else !!! "Etc"
      let m = !!! "StringOp"
    }
    if (! (= f 0i)) {
      !!! "Etc"
      m = (+ (+ a ".") b)
    } else {}
    if (= e 0i) {
      let c = "+"
      let d = "0"
    } else {
      if (< 0i e) let c = "+" else {
        assert (< e 0i)
        let c = "-"
        e = (- e)
      }
      let d = !!! "StringOp"
    }
    m = (+ (+ (+ m "e") c) d)
    app __x6__ = (WrapCompletion (+ s m))
    return __x6__
  }
  */
}
