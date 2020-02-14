package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArraySetLength {
  val length: Int = 2
  val func: Func = Func("""ArraySetLength""", List(Id("""A"""), Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""Desc"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), ILet(Id("""newLenDesc"""), ECopy(ERef(RefId(Id("""Desc"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""newLen"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""numberLen"""), ERef(RefId(Id("""__x3__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""newLen"""))), ERef(RefId(Id("""numberLen"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Value""")), ERef(RefId(Id("""newLen""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""))), ILet(Id("""oldLenDesc"""), ERef(RefId(Id("""__x5__""")))), ILet(Id("""oldLen"""), ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Value""")))), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""newLen"""))), ERef(RefId(Id("""oldLen"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""newLenDesc"""))))), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IIf(EBOp(OOr, EBOp(OEq, ERef(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable"""))), EBool(true))), ILet(Id("""newWritable"""), EBool(true)), ISeq(List(ILet(Id("""newWritable"""), EBool(false)), IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable""")), EBool(true))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""newLenDesc"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""succeeded"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IWhile(EBOp(OLt, ERef(RefId(Id("""newLen"""))), ERef(RefId(Id("""oldLen""")))), ISeq(List(IAssign(RefId(Id("""oldLen""")), EBOp(OSub, ERef(RefId(Id("""oldLen"""))), EINum(1L))), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""oldLen"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""A""")), EStr("""Delete"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x11__"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), ILet(Id("""deleteSucceeded"""), ERef(RefId(Id("""__x12__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""deleteSucceeded"""))), EBool(false)), ISeq(List(IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Value""")), EBOp(OPlus, ERef(RefId(Id("""oldLen"""))), EINum(1L))), IIf(EBOp(OEq, ERef(RefId(Id("""newWritable"""))), EBool(false)), IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable""")), EBool(false)), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""newLenDesc"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x13__""")))), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List()))))), IIf(EBOp(OEq, ERef(RefId(Id("""newWritable"""))), EBool(false)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Writable"""), EBool(false)))))), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x17__""")))))))
  /* Beautified form:
  "ArraySetLength" (A, Desc) => {
    if (= Desc["Value"] absent) {
      app __x0__ = (OrdinaryDefineOwnProperty A "length" Desc)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    let newLenDesc = (copy-obj Desc)
    app __x2__ = (ToUint32 Desc["Value"])
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let newLen = __x2__
    app __x3__ = (ToNumber Desc["Value"])
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let numberLen = __x3__
    if (! (= newLen numberLen)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    newLenDesc["Value"] = newLen
    app __x5__ = (OrdinaryGetOwnProperty A "length")
    let oldLenDesc = __x5__
    let oldLen = oldLenDesc["Value"]
    if (! (< newLen oldLen)) {
      app __x6__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    if (= oldLenDesc["Writable"] false) {
      app __x8__ = (WrapCompletion false)
      return __x8__
    } else {}
    if (|| (= newLenDesc["Writable"] absent) (= newLenDesc["Writable"] true)) let newWritable = true else {
      let newWritable = false
      newLenDesc["Writable"] = true
    }
    app __x9__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let succeeded = __x9__
    if (= succeeded false) {
      app __x10__ = (WrapCompletion false)
      return __x10__
    } else {}
    while (< newLen oldLen) {
      oldLen = (- oldLen 1i)
      app __x11__ = (ToString oldLen)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (A["Delete"] A __x11__)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let deleteSucceeded = __x12__
      if (= deleteSucceeded false) {
        newLenDesc["Value"] = (+ oldLen 1i)
        if (= newWritable false) newLenDesc["Writable"] = false else {}
        app __x13__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
        app __x14__ = (WrapCompletion false)
        return __x14__
      } else {}
    }
    if (= newWritable false) {
      app __x15__ = (OrdinaryDefineOwnProperty A "length" (new PropertyDescriptor("Writable" -> false)))
      app __x16__ = (WrapCompletion __x15__)
      return __x16__
    } else {}
    app __x17__ = (WrapCompletion true)
    return __x17__
  }
  */
}
