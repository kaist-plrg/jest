package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SameValueNonNumber {
  val length: Int = 2
  val func: Func = Func("""SameValueNonNumber""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Undefined""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Null""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""String""")))), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x6__"""))))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Boolean""")))), IIf(EBOp(OOr, EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""y"""))), EBool(true))), EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EBool(false)), EBOp(OEq, ERef(RefId(Id("""y"""))), EBool(false)))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x9__"""))))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), ERef(RefId(Id("""Symbol""")))), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x12__"""))))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x13__""")))))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x14__"""))))))))))
  /* Beautified form:
  "SameValueNonNumber" (x, y) => {
    app __x0__ = (Type x)
    if (= __x0__ Undefined) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    app __x2__ = (Type x)
    if (= __x2__ Null) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (Type x)
    if (= __x4__ String) if (= x y) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    app __x7__ = (Type x)
    if (= __x7__ Boolean) if (|| (&& (= x true) (= y true)) (&& (= x false) (= y false))) {
      app __x8__ = (WrapCompletion true)
      return __x8__
    } else {
      app __x9__ = (WrapCompletion false)
      return __x9__
    } else {}
    app __x10__ = (Type x)
    if (= __x10__ Symbol) if (= x y) {
      app __x11__ = (WrapCompletion true)
      return __x11__
    } else {
      app __x12__ = (WrapCompletion false)
      return __x12__
    } else {}
    if (= x y) {
      app __x13__ = (WrapCompletion true)
      return __x13__
    } else {
      app __x14__ = (WrapCompletion false)
      return __x14__
    }
  }
  */
}
