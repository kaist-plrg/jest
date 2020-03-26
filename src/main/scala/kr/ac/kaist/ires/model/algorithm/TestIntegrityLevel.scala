package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TestIntegrityLevel {
  val length: Int = 2
  val func: Func = Func("""TestIntegrityLevel""", List(Id("""O"""), Id("""level""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IAssert(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""level"""))), EStr("""sealed""")), EBOp(OEq, ERef(RefId(Id("""level"""))), EStr("""frozen""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""extensible"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""keys"""), ERef(RefId(Id("""__x3__""")))), ILet(Id("""__x4__"""), ERef(RefId(Id("""keys""")))), ILet(Id("""__x5__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""k"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""k"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""currentDesc"""), ERef(RefId(Id("""__x6__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""currentDesc"""))), EUndef)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""currentDesc""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), ILet(Id("""__x8__"""), EBOp(OEq, ERef(RefId(Id("""level"""))), EStr("""frozen"""))), IIf(ERef(RefId(Id("""__x8__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""currentDesc"""))))), IAssign(RefId(Id("""__x8__""")), EBOp(OEq, ERef(RefId(Id("""__x9__"""))), EBool(true))))), ISeq(List())), IIf(ERef(RefId(Id("""__x8__"""))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""currentDesc""")), EStr("""Writable"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), ISeq(List())))), ISeq(List())), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L)))))), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x11__""")))))))
  /* Beautified form:
  "TestIntegrityLevel" (O, level) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    assert (|| (= level "sealed") (= level "frozen"))
    app __x1__ = (IsExtensible O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let extensible = __x1__
    if (= extensible true) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (O["OwnPropertyKeys"] O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let keys = __x3__
    let __x4__ = keys
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let k = __x4__[__x5__]
      app __x6__ = (O["GetOwnProperty"] O k)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let currentDesc = __x6__
      if (! (= currentDesc undefined)) {
        if (= currentDesc["Configurable"] true) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        let __x8__ = (= level "frozen")
        if __x8__ {
          app __x9__ = (IsDataDescriptor currentDesc)
          __x8__ = (= __x9__ true)
        } else {}
        if __x8__ if (= currentDesc["Writable"] true) {
          app __x10__ = (WrapCompletion false)
          return __x10__
        } else {} else {}
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x11__ = (WrapCompletion true)
    return __x11__
  }
  */
}
