package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTraw {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.raw""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""template"""), ERef(RefId(Id("""__x0__""")))), IExpr(ENotSupported("""Etc""")), ILet(Id("""numberOfSubstitutions"""), ERef(RefProp(RefId(Id("""substitutions""")), EStr("""length""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""template"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""cooked"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""cooked"""))), EStr("""raw"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""__x2__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""raw"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""raw"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""literalSegments"""), ERef(RefId(Id("""__x4__""")))), IIf(EUOp(ONot, EBOp(OLt, EINum(0L), ERef(RefId(Id("""literalSegments"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr(""""""))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), ILet(Id("""stringElements"""), EList(List())), ILet(Id("""nextIndex"""), EINum(0L)), IWhile(EBool(true), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""nextIndex"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""nextKey"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""raw"""))), ERef(RefId(Id("""nextKey"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""__x7__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""nextSeg"""), ERef(RefId(Id("""__x8__""")))), IExpr(ENotSupported("""Etc""")), IIf(EBOp(OEq, EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L)), ERef(RefId(Id("""literalSegments""")))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""StringOp"""))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IIf(EBOp(OLt, ERef(RefId(Id("""nextIndex"""))), ERef(RefId(Id("""numberOfSubstitutions""")))), ILet(Id("""next"""), ERef(RefProp(RefId(Id("""substitutions""")), ERef(RefId(Id("""nextIndex""")))))), ILet(Id("""next"""), EStr(""""""))), IApp(Id("""__x10__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""next"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), ILet(Id("""nextSub"""), ERef(RefId(Id("""__x10__""")))), IExpr(ENotSupported("""Etc""")), IAssign(RefId(Id("""nextIndex""")), EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L)))))))))
  /* Beautified form:
  "GLOBAL.String.raw" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let template = __x0__
    !!! "Etc"
    let numberOfSubstitutions = substitutions["length"]
    app __x1__ = (ToObject template)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let cooked = __x1__
    app __x2__ = (Get cooked "raw")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (ToObject __x2__)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let raw = __x3__
    app __x4__ = (LengthOfArrayLike raw)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let literalSegments = __x4__
    if (! (< 0i literalSegments)) {
      app __x5__ = (WrapCompletion "")
      return __x5__
    } else {}
    let stringElements = (new [])
    let nextIndex = 0i
    while true {
      app __x6__ = (ToString nextIndex)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let nextKey = __x6__
      app __x7__ = (Get raw nextKey)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      app __x8__ = (ToString __x7__)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let nextSeg = __x8__
      !!! "Etc"
      if (= (+ nextIndex 1i) literalSegments) {
        app __x9__ = (WrapCompletion !!! "StringOp")
        return __x9__
      } else {}
      if (< nextIndex numberOfSubstitutions) let next = substitutions[nextIndex] else let next = ""
      app __x10__ = (ToString next)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let nextSub = __x10__
      !!! "Etc"
      nextIndex = (+ nextIndex 1i)
    }
  }
  */
}
