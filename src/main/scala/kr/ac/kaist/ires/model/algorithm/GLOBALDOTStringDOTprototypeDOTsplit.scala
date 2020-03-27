package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTsplit {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.String.prototype.split""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""separator"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""limit"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""separator"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""separator"""))), ENull))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""separator"""))), ERef(RefId(Id("""SYMBOL_split"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""splitter"""), ERef(RefId(Id("""__x3__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""splitter"""))), EUndef)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""splitter"""))), ERef(RefId(Id("""separator"""))), EList(List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""limit"""))))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""S"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""A"""), ERef(RefId(Id("""__x7__""")))), ILet(Id("""lengthA"""), EINum(0L)), IIf(EBOp(OEq, ERef(RefId(Id("""limit"""))), EUndef), ILet(Id("""lim"""), EBOp(OSub, EINum(4294967296L), EINum(1L))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""limit"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""lim"""), ERef(RefId(Id("""__x8__"""))))))), ILet(Id("""s"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))), ILet(Id("""p"""), EINum(0L)), IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""separator"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""R"""), ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""lim"""))), EINum(0L)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""separator"""))), EUndef), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""0"""), ERef(RefId(Id("""S"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x11__""")))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""s"""))), EINum(0L)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""SplitMatch"""))), List(ERef(RefId(Id("""S"""))), EINum(0L), ERef(RefId(Id("""R"""))))), ILet(Id("""z"""), ERef(RefId(Id("""__x13__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""z"""))), EBool(false))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""0"""), ERef(RefId(Id("""S"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x15__""")))), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), ILet(Id("""q"""), ERef(RefId(Id("""p""")))), IWhile(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""q"""))), ERef(RefId(Id("""s"""))))), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""SplitMatch"""))), List(ERef(RefId(Id("""S"""))), ERef(RefId(Id("""q"""))), ERef(RefId(Id("""R"""))))), ILet(Id("""e"""), ERef(RefId(Id("""__x17__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""e"""))), EBool(false)), IAssign(RefId(Id("""q""")), EBOp(OPlus, ERef(RefId(Id("""q"""))), EINum(1L))), IIf(EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""p""")))), IAssign(RefId(Id("""q""")), EBOp(OPlus, ERef(RefId(Id("""q"""))), EINum(1L))), ISeq(List(IExpr(ENotSupported("""Etc""")), IApp(Id("""__x18__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""lengthA"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x18__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x18__"""))))), ISeq(List())), IApp(Id("""__x19__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x18__"""))), ERef(RefId(Id("""T"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x19__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x19__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x19__""")))), IAssign(RefId(Id("""lengthA""")), EBOp(OPlus, ERef(RefId(Id("""lengthA"""))), EINum(1L))), IIf(EBOp(OEq, ERef(RefId(Id("""lengthA"""))), ERef(RefId(Id("""lim""")))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x20__""")))))), ISeq(List())), IAssign(RefId(Id("""p""")), ERef(RefId(Id("""e""")))), IAssign(RefId(Id("""q""")), ERef(RefId(Id("""p"""))))))))))), IExpr(ENotSupported("""Etc""")), IApp(Id("""__x21__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""lengthA"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x21__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x21__""")), ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x21__"""))))), ISeq(List())), IApp(Id("""__x22__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x21__"""))), ERef(RefId(Id("""T"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x22__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x22__""")), ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x22__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x22__""")))), IApp(Id("""__x23__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))), IReturn(ERef(RefId(Id("""__x23__""")))))))
  /* Beautified form:
  "GLOBAL.String.prototype.split" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let separator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let limit = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    if (! (|| (= separator undefined) (= separator null))) {
      app __x3__ = (GetMethod separator SYMBOL_split)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let splitter = __x3__
      if (! (= splitter undefined)) {
        app __x4__ = (Call splitter separator (new [O, limit]))
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
    } else {}
    app __x6__ = (ToString O)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let S = __x6__
    app __x7__ = (ArrayCreate 0i)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let A = __x7__
    let lengthA = 0i
    if (= limit undefined) let lim = (- 4294967296i 1i) else {
      app __x8__ = (ToUint32 limit)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let lim = __x8__
    }
    let s = S["length"]
    let p = 0i
    app __x9__ = (ToString separator)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let R = __x9__
    if (= lim 0i) {
      app __x10__ = (WrapCompletion A)
      return __x10__
    } else {}
    if (= separator undefined) {
      app __x11__ = (CreateDataProperty A "0" S)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      app __x12__ = (WrapCompletion A)
      return __x12__
    } else {}
    if (= s 0i) {
      app __x13__ = (SplitMatch S 0i R)
      let z = __x13__
      if (! (= z false)) {
        app __x14__ = (WrapCompletion A)
        return __x14__
      } else {}
      app __x15__ = (CreateDataProperty A "0" S)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x15__
      app __x16__ = (WrapCompletion A)
      return __x16__
    } else {}
    let q = p
    while (! (= q s)) {
      app __x17__ = (SplitMatch S q R)
      let e = __x17__
      if (= e false) q = (+ q 1i) else if (= e p) q = (+ q 1i) else {
        !!! "Etc"
        app __x18__ = (ToString lengthA)
        if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
        app __x19__ = (CreateDataProperty A __x18__ T)
        if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        __x19__
        lengthA = (+ lengthA 1i)
        if (= lengthA lim) {
          app __x20__ = (WrapCompletion A)
          return __x20__
        } else {}
        p = e
        q = p
      }
    }
    !!! "Etc"
    app __x21__ = (ToString lengthA)
    if (is-completion __x21__) if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
    app __x22__ = (CreateDataProperty A __x21__ T)
    if (is-completion __x22__) if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
    __x22__
    app __x23__ = (WrapCompletion A)
    return __x23__
  }
  */
}
