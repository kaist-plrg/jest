package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTpop {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.pop""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""len"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""len"""))), EINum(0L)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), EStr("""length"""), EINum(0L), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List(IAssert(EBOp(OLt, EINum(0L), ERef(RefId(Id("""len"""))))), ILet(Id("""newLen"""), EBOp(OSub, ERef(RefId(Id("""len"""))), EINum(1L))), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""newLen"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""index"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""index"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""element"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""index"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), EStr("""length"""), ERef(RefId(Id("""newLen"""))), EBool(true))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x7__""")))), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""element"""))))), IReturn(ERef(RefId(Id("""__x8__"""))))))))))
  /* Beautified form:
  "GLOBAL.Array.prototype.pop" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (LengthOfArrayLike O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let len = __x1__
    if (= len 0i) {
      app __x2__ = (Set O "length" 0i true)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (WrapCompletion undefined)
      return __x3__
    } else {
      assert (< 0i len)
      let newLen = (- len 1i)
      app __x4__ = (ToString newLen)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let index = __x4__
      app __x5__ = (Get O index)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let element = __x5__
      app __x6__ = (DeletePropertyOrThrow O index)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      __x6__
      app __x7__ = (Set O "length" newLen true)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      __x7__
      app __x8__ = (WrapCompletion element)
      return __x8__
    }
  }
  */
}
