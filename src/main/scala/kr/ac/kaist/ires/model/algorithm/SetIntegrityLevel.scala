package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetIntegrityLevel {
  val length: Int = 2
  val func: Func = Func("""SetIntegrityLevel""", List(Id("""O"""), Id("""level""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IAssert(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""level"""))), EStr("""sealed""")), EBOp(OEq, ERef(RefId(Id("""level"""))), EStr("""frozen""")))), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""PreventExtensions"""))), List(ERef(RefId(Id("""O"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""status"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""status"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""keys"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""level"""))), EStr("""sealed""")), ISeq(List(ILet(Id("""__x4__"""), ERef(RefId(Id("""keys""")))), ILet(Id("""__x5__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""k"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""k"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Configurable"""), EBool(false)))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x6__""")))), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L)))))))), ISeq(List(IAssert(EBOp(OEq, ERef(RefId(Id("""level"""))), EStr("""frozen"""))), ILet(Id("""__x7__"""), ERef(RefId(Id("""keys""")))), ILet(Id("""__x8__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x8__"""))), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""length""")))), ISeq(List(ILet(Id("""k"""), ERef(RefProp(RefId(Id("""__x7__""")), ERef(RefId(Id("""__x8__""")))))), IApp(Id("""__x9__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""k"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x9__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""currentDesc"""), ERef(RefId(Id("""__x9__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""currentDesc"""))), EUndef)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""currentDesc"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(true)), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Configurable"""), EBool(false))))), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Configurable"""), EBool(false)), (EStr("""Writable"""), EBool(false)))))), IApp(Id("""__x11__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""desc"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IAssign(RefId(Id("""__x8__""")), EBOp(OPlus, ERef(RefId(Id("""__x8__"""))), EINum(1L))))))))), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "SetIntegrityLevel" (O, level) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    assert (|| (= level "sealed") (= level "frozen"))
    app __x1__ = (O["PreventExtensions"] O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let status = __x1__
    if (= status false) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (O["OwnPropertyKeys"] O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let keys = __x3__
    if (= level "sealed") {
      let __x4__ = keys
      let __x5__ = 0i
      while (< __x5__ __x4__["length"]) {
        let k = __x4__[__x5__]
        app __x6__ = (DefinePropertyOrThrow O k (new PropertyDescriptor("Configurable" -> false)))
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        __x6__
        __x5__ = (+ __x5__ 1i)
      }
    } else {
      assert (= level "frozen")
      let __x7__ = keys
      let __x8__ = 0i
      while (< __x8__ __x7__["length"]) {
        let k = __x7__[__x8__]
        app __x9__ = (O["GetOwnProperty"] O k)
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        let currentDesc = __x9__
        if (! (= currentDesc undefined)) {
          app __x10__ = (IsAccessorDescriptor currentDesc)
          if (= __x10__ true) let desc = (new PropertyDescriptor("Configurable" -> false)) else let desc = (new PropertyDescriptor("Configurable" -> false, "Writable" -> false))
          app __x11__ = (DefinePropertyOrThrow O k desc)
          if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          __x11__
        } else {}
        __x8__ = (+ __x8__ 1i)
      }
    }
    app __x12__ = (WrapCompletion true)
    return __x12__
  }
  */
}
