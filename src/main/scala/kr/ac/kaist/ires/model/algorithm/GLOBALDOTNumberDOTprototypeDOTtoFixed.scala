package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoFixed {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.prototype.toFixed""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""fractionDigits"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""fractionDigits"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""f"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""f"""))), EINum(0L)), EBOp(OLt, EINum(100L), ERef(RefId(Id("""f"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), ILet(Id("""s"""), EStr("""""")), IIf(EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(IAssign(RefId(Id("""s""")), EStr("""-""")), IAssign(RefId(Id("""x""")), EUOp(ONeg, ERef(RefId(Id("""x"""))))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(9223372036854775807L))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""x"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""m"""), ERef(RefId(Id("""__x5__""")))))), ISeq(List(IExpr(ENotSupported("""Etc""")), IIf(EBOp(OEq, ERef(RefId(Id("""n"""))), EINum(0L)), ILet(Id("""m"""), EStr("""0""")), ILet(Id("""m"""), ENotSupported("""StringOp"""))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""f"""))), EINum(0L))), ISeq(List(ILet(Id("""k"""), ERef(RefProp(RefId(Id("""m""")), EStr("""length""")))), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""f"""))), ERef(RefId(Id("""k"""))))), ISeq(List(ILet(Id("""z"""), ENotSupported("""StringOp""")), IAssign(RefId(Id("""m""")), EBOp(OPlus, ERef(RefId(Id("""z"""))), ERef(RefId(Id("""m"""))))), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""f"""))), EINum(1L))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""a"""))), EStr(""".""")), ERef(RefId(Id("""b"""))))))), ISeq(List()))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "GLOBAL.Number.prototype.toFixed" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let fractionDigits = __x0__
    app __x1__ = (thisNumberValue this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    app __x2__ = (ToInteger fractionDigits)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let f = __x2__
    if (|| (< f 0i) (< 100i f)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    if (= x NaN) {
      app __x4__ = (WrapCompletion "NaN")
      return __x4__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (! (< x 9223372036854775807i)) {
      app __x5__ = (ToString x)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let m = __x5__
    } else {
      !!! "Etc"
      if (= n 0i) let m = "0" else let m = !!! "StringOp"
      if (! (= f 0i)) {
        let k = m["length"]
        if (! (< f k)) {
          let z = !!! "StringOp"
          m = (+ z m)
          k = (+ f 1i)
        } else {}
        !!! "Etc"
        m = (+ (+ a ".") b)
      } else {}
    }
    app __x6__ = (WrapCompletion (+ s m))
    return __x6__
  }
  */
}
