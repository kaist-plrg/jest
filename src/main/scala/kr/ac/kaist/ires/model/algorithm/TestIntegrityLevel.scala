package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TestIntegrityLevel {
  val length: Int = 2
  val func: Func = Func("""TestIntegrityLevel""", List(Id("""O"""), Id("""level""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), ILet(Id("""extensible"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""keys"""), ERef(RefId(Id("""__x2__""")))), ILet(Id("""__x3__"""), ERef(RefId(Id("""keys""")))), ILet(Id("""__x4__"""), EINum(0L)), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""k"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))), IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""k"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""currentDesc"""), ERef(RefId(Id("""__x5__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""currentDesc"""))), EUndef)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""currentDesc""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""__x7__"""), EBOp(OEq, ERef(RefId(Id("""level"""))), EStr("""frozen"""))), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""currentDesc"""))))), IAssign(RefId(Id("""__x7__""")), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true))))), ISeq(List())), IIf(ERef(RefId(Id("""__x7__"""))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""currentDesc""")), EStr("""Writable"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), ISeq(List())))), ISeq(List())), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L)))))), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x10__""")))))))
  /* Beautified form:
  "TestIntegrityLevel" (O, level) => {
    app __x0__ = (IsExtensible O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let extensible = __x0__
    if (= extensible true) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (O["OwnPropertyKeys"] O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let keys = __x2__
    let __x3__ = keys
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let k = __x3__[__x4__]
      app __x5__ = (O["GetOwnProperty"] O k)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let currentDesc = __x5__
      if (! (= currentDesc undefined)) {
        if (= currentDesc["Configurable"] true) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        let __x7__ = (= level "frozen")
        if __x7__ {
          app __x8__ = (IsDataDescriptor currentDesc)
          __x7__ = (= __x8__ true)
        } else {}
        if __x7__ if (= currentDesc["Writable"] true) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {} else {}
      } else {}
      __x4__ = (+ __x4__ 1i)
    }
    app __x10__ = (WrapCompletion true)
    return __x10__
  }
  */
}
