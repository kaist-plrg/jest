package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoPrecision {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.prototype.toPrecision""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""precision"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""precision"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""precision"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""p"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), ILet(Id("""s"""), EStr("""""")), IIf(EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(IAssign(RefId(Id("""s""")), EStr("""-""")), IAssign(RefId(Id("""x""")), EUOp(ONeg, ERef(RefId(Id("""x"""))))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), EStr("""Infinity""")))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""p"""))), EINum(1L)), EBOp(OLt, EINum(100L), ERef(RefId(Id("""p"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(ILet(Id("""m"""), ENotSupported("""StringOp""")), ILet(Id("""e"""), EINum(0L)))), ISeq(List(IExpr(ENotSupported("""Etc""")), ILet(Id("""m"""), ENotSupported("""StringOp""")), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""e"""))), EUOp(ONeg, EINum(6L))), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""p""")))))), ISeq(List(IAssert(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), EINum(0L)))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""p"""))), EINum(1L))), ISeq(List(IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""a"""))), EStr(""".""")), ERef(RefId(Id("""b"""))))))), ISeq(List())), IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""e""")))), ILet(Id("""c"""), EStr("""+""")), ISeq(List(IAssert(EBOp(OLt, ERef(RefId(Id("""e"""))), EINum(0L))), ILet(Id("""c"""), EStr("""-""")), IAssign(RefId(Id("""e""")), EUOp(ONeg, ERef(RefId(Id("""e""")))))))), ILet(Id("""d"""), ENotSupported("""StringOp""")), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))), EStr("""e""")), ERef(RefId(Id("""c""")))), ERef(RefId(Id("""d""")))))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List()))))), IIf(EBOp(OEq, ERef(RefId(Id("""e"""))), EBOp(OSub, ERef(RefId(Id("""p"""))), EINum(1L))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""e"""))), EINum(0L))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc"""))), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))), IReturn(ERef(RefId(Id("""__x10__""")))))))
  /* Beautified form:
  "GLOBAL.Number.prototype.toPrecision" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let precision = __x0__
    app __x1__ = (thisNumberValue this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    if (= precision undefined) {
      app __x2__ = (ToString x)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (ToInteger precision)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let p = __x4__
    if (= x NaN) {
      app __x5__ = (WrapCompletion "NaN")
      return __x5__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (= x Infinity) {
      app __x6__ = (WrapCompletion (+ s "Infinity"))
      return __x6__
    } else {}
    if (|| (< p 1i) (< 100i p)) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    if (= x 0i) {
      let m = !!! "StringOp"
      let e = 0i
    } else {
      !!! "Etc"
      let m = !!! "StringOp"
      if (|| (< e (- 6i)) (! (< e p))) {
        assert (! (= e 0i))
        if (! (= p 1i)) {
          !!! "Etc"
          m = (+ (+ a ".") b)
        } else {}
        if (< 0i e) let c = "+" else {
          assert (< e 0i)
          let c = "-"
          e = (- e)
        }
        let d = !!! "StringOp"
        app __x8__ = (WrapCompletion (+ (+ (+ (+ s m) "e") c) d))
        return __x8__
      } else {}
    }
    if (= e (- p 1i)) {
      app __x9__ = (WrapCompletion (+ s m))
      return __x9__
    } else {}
    if (! (< e 0i)) !!! "Etc" else !!! "Etc"
    app __x10__ = (WrapCompletion (+ s m))
    return __x10__
  }
  */
}
