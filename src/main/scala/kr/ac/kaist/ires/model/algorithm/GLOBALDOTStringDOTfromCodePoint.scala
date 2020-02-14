package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTfromCodePoint {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.fromCodePoint""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""codePoints""")), EStr("""length""")))), ILet(Id("""elements"""), EList(List())), ILet(Id("""nextIndex"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""nextIndex"""))), ERef(RefId(Id("""length""")))), ISeq(List(ILet(Id("""next"""), ERef(RefProp(RefId(Id("""codePoints""")), ERef(RefId(Id("""nextIndex""")))))), IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""next"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""nextCP"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""nextCP"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""nextCP"""))), EINum(0L)), EBOp(OLt, EINum(1114111L), ERef(RefId(Id("""nextCP"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IAccess(Id("""__x4__"""), ERef(RefId(Id("""nextCP"""))), EStr("""UTF16Encoding""")), ILet(Id("""__x5__"""), ERef(RefId(Id("""__x4__""")))), ILet(Id("""__x6__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x6__"""))), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x7__"""), ERef(RefProp(RefId(Id("""__x5__""")), ERef(RefId(Id("""__x6__""")))))), IAppend(ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""elements""")))), IAssign(RefId(Id("""__x6__""")), EBOp(OPlus, ERef(RefId(Id("""__x6__"""))), EINum(1L)))))), IAssign(RefId(Id("""nextIndex""")), EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L)))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""StringOp"""))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "GLOBAL.String.fromCodePoint" (this, argumentsList, NewTarget) => {
    !!! "Etc"
    let length = codePoints["length"]
    let elements = (new [])
    let nextIndex = 0i
    while (< nextIndex length) {
      let next = codePoints[nextIndex]
      app __x0__ = (ToNumber next)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let nextCP = __x0__
      app __x1__ = (IsInteger nextCP)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      if (= __x1__ false) {
        app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x2__
      } else {}
      if (|| (< nextCP 0i) (< 1114111i nextCP)) {
        app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x3__
      } else {}
      access __x4__ = (nextCP "UTF16Encoding")
      let __x5__ = __x4__
      let __x6__ = 0i
      while (< __x6__ __x5__["length"]) {
        let __x7__ = __x5__[__x6__]
        append __x7__ -> elements
        __x6__ = (+ __x6__ 1i)
      }
      nextIndex = (+ nextIndex 1i)
    }
    app __x8__ = (WrapCompletion !!! "StringOp")
    return __x8__
  }
  */
}
