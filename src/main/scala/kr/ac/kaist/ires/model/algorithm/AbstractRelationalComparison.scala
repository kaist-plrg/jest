package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AbstractRelationalComparison {
  val length: Int = 0
  val func: Func = Func("""AbstractRelationalComparison""", List(Id("""x"""), Id("""y"""), Id("""LeftFirst""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""LeftFirst"""))), EAbsent), ILet(Id("""LeftFirst"""), EBool(true)), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""LeftFirst"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""Number"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""px"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""y"""))), ERef(RefId(Id("""Number"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""py"""), ERef(RefId(Id("""__x1__""")))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""y"""))), ERef(RefId(Id("""Number"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""py"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""Number"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""px"""), ERef(RefId(Id("""__x3__"""))))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""px"""))))), ILet(Id("""__x5__"""), EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""String"""))))), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""py"""))))), IAssign(RefId(Id("""__x5__""")), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""String"""))))))), ISeq(List())), IIf(ERef(RefId(Id("""__x5__"""))), IReturn(EBOp(OLt, ERef(RefId(Id("""px"""))), ERef(RefId(Id("""py"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""px"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""nx"""), ERef(RefId(Id("""__x7__""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""py"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""ny"""), ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""nx"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""ny"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""nx"""))), ERef(RefId(Id("""ny""")))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""nx"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""ny"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""nx"""))), ENum(-0.0)), EBOp(OEq, ERef(RefId(Id("""ny"""))), EINum(0L))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x13__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""nx"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""ny"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x15__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""ny"""))), ENum(Double.NegativeInfinity)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""nx"""))), ENum(Double.NegativeInfinity)), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x17__""")))))), ISeq(List())), IReturn(EBOp(OLt, ERef(RefId(Id("""nx"""))), ERef(RefId(Id("""ny""")))))))))))
  /* Beautified form:
  "AbstractRelationalComparison" (x, y, LeftFirst) => {
    if (= LeftFirst absent) let LeftFirst = true else {}
    if (= LeftFirst true) {
      app __x0__ = (ToPrimitive x Number)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let px = __x0__
      app __x1__ = (ToPrimitive y Number)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let py = __x1__
    } else {
      app __x2__ = (ToPrimitive y Number)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let py = __x2__
      app __x3__ = (ToPrimitive x Number)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let px = __x3__
    }
    app __x4__ = (Type px)
    let __x5__ = (= __x4__ String)
    if __x5__ {
      app __x6__ = (Type py)
      __x5__ = (= __x6__ String)
    } else {}
    if __x5__ return (< px py) else {
      app __x7__ = (ToNumber px)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let nx = __x7__
      app __x8__ = (ToNumber py)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let ny = __x8__
      if (= nx NaN) {
        app __x9__ = (WrapCompletion undefined)
        return __x9__
      } else {}
      if (= ny NaN) {
        app __x10__ = (WrapCompletion undefined)
        return __x10__
      } else {}
      if (= nx ny) {
        app __x11__ = (WrapCompletion false)
        return __x11__
      } else {}
      if (&& (= nx 0i) (= ny -0.0)) {
        app __x12__ = (WrapCompletion false)
        return __x12__
      } else {}
      if (&& (= nx -0.0) (= ny 0i)) {
        app __x13__ = (WrapCompletion false)
        return __x13__
      } else {}
      if (= nx Infinity) {
        app __x14__ = (WrapCompletion false)
        return __x14__
      } else {}
      if (= ny Infinity) {
        app __x15__ = (WrapCompletion true)
        return __x15__
      } else {}
      if (= ny -Infinity) {
        app __x16__ = (WrapCompletion false)
        return __x16__
      } else {}
      if (= nx -Infinity) {
        app __x17__ = (WrapCompletion true)
        return __x17__
      } else {}
      return (< nx ny)
    }
  }
  */
}
