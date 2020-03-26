package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SameValueNonNumber {
  val length: Int = 2
  val func: Func = Func("""SameValueNonNumber""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IAssert(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Number""")))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Undefined""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Null""")))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""String""")))), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x7__"""))))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Boolean""")))), IIf(EBOp(OOr, EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""y"""))), EBool(true))), EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EBool(false)), EBOp(OEq, ERef(RefId(Id("""y"""))), EBool(false)))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x10__"""))))))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x11__"""))), ERef(RefId(Id("""Symbol""")))), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x13__"""))))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x15__"""))))))))))
  /* Beautified form:
  "SameValueNonNumber" (x, y) => {
    app __x0__ = (Type x)
    assert (! (= __x0__ Number))
    app __x1__ = (Type x)
    if (= __x1__ Undefined) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (Type x)
    if (= __x3__ Null) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    app __x5__ = (Type x)
    if (= __x5__ String) if (= x y) {
      app __x6__ = (WrapCompletion true)
      return __x6__
    } else {
      app __x7__ = (WrapCompletion false)
      return __x7__
    } else {}
    app __x8__ = (Type x)
    if (= __x8__ Boolean) if (|| (&& (= x true) (= y true)) (&& (= x false) (= y false))) {
      app __x9__ = (WrapCompletion true)
      return __x9__
    } else {
      app __x10__ = (WrapCompletion false)
      return __x10__
    } else {}
    app __x11__ = (Type x)
    if (= __x11__ Symbol) if (= x y) {
      app __x12__ = (WrapCompletion true)
      return __x12__
    } else {
      app __x13__ = (WrapCompletion false)
      return __x13__
    } else {}
    if (= x y) {
      app __x14__ = (WrapCompletion true)
      return __x14__
    } else {
      app __x15__ = (WrapCompletion false)
      return __x15__
    }
  }
  */
}
