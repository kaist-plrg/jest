package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CopyDataProperties {
  val length: Int = 3
  val func: Func = Func("""CopyDataProperties""", List(Id("""target"""), Id("""source"""), Id("""excludedItems""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""target"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""source"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""source"""))), ENull)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""target"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""source"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""from"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""from""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""from"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""keys"""), ERef(RefId(Id("""__x3__""")))), ILet(Id("""__x4__"""), ERef(RefId(Id("""keys""")))), ILet(Id("""__x5__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""nextKey"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))), ILet(Id("""excluded"""), EBool(false)), ILet(Id("""__x6__"""), ERef(RefId(Id("""excludedItems""")))), ILet(Id("""__x7__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x6__""")), ERef(RefId(Id("""__x7__""")))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""nextKey"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true)), IAssign(RefId(Id("""excluded""")), EBool(true)), ISeq(List())), IAssign(RefId(Id("""__x7__""")), EBOp(OPlus, ERef(RefId(Id("""__x7__"""))), EINum(1L)))))), IIf(EBOp(OEq, ERef(RefId(Id("""excluded"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefProp(RefId(Id("""from""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""from"""))), ERef(RefId(Id("""nextKey"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""desc"""), ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Enumerable"""))), EBool(true))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""from"""))), ERef(RefId(Id("""nextKey"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), ILet(Id("""propValue"""), ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""nextKey"""))), ERef(RefId(Id("""propValue"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x11__""")))))), ISeq(List())))), ISeq(List())), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L)))))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""target"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "CopyDataProperties" (target, source, excludedItems) => {
    app __x0__ = (Type target)
    assert (= __x0__ Object)
    if (|| (= source undefined) (= source null)) {
      app __x1__ = (WrapCompletion target)
      return __x1__
    } else {}
    app __x2__ = (ToObject source)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let from = __x2__
    app __x3__ = (from["OwnPropertyKeys"] from)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let keys = __x3__
    let __x4__ = keys
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let nextKey = __x4__[__x5__]
      let excluded = false
      let __x6__ = excludedItems
      let __x7__ = 0i
      while (< __x7__ __x6__["length"]) {
        let e = __x6__[__x7__]
        app __x8__ = (SameValue e nextKey)
        if (= __x8__ true) excluded = true else {}
        __x7__ = (+ __x7__ 1i)
      }
      if (= excluded false) {
        app __x9__ = (from["GetOwnProperty"] from nextKey)
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        let desc = __x9__
        if (&& (! (= desc undefined)) (= desc["Enumerable"] true)) {
          app __x10__ = (Get from nextKey)
          if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          let propValue = __x10__
          app __x11__ = (CreateDataProperty target nextKey propValue)
          if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          __x11__
        } else {}
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x12__ = (WrapCompletion target)
    return __x12__
  }
  */
}
