package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FromPropertyDescriptor {
  val length: Int = 1
  val func: Func = Func("""FromPropertyDescriptor""", List(Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""Desc"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))), ILet(Id("""obj"""), ERef(RefId(Id("""__x1__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""value"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))), IExpr(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""writable"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))))), IExpr(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), EAbsent)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""get"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))))), IExpr(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), EAbsent)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""set"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))))), IExpr(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EAbsent)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""enumerable"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))))), IExpr(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EAbsent)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""configurable"""), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))), IExpr(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))), IReturn(ERef(RefId(Id("""__x8__""")))))))
  /* Beautified form:
  "FromPropertyDescriptor" (Desc) => {
    if (= Desc undefined) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    app __x1__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x1__
    if (! (= Desc["Value"] absent)) {
      app __x2__ = (CreateDataProperty obj "value" Desc["Value"])
      __x2__
    } else {}
    if (! (= Desc["Writable"] absent)) {
      app __x3__ = (CreateDataProperty obj "writable" Desc["Writable"])
      __x3__
    } else {}
    if (! (= Desc["Get"] absent)) {
      app __x4__ = (CreateDataProperty obj "get" Desc["Get"])
      __x4__
    } else {}
    if (! (= Desc["Set"] absent)) {
      app __x5__ = (CreateDataProperty obj "set" Desc["Set"])
      __x5__
    } else {}
    if (! (= Desc["Enumerable"] absent)) {
      app __x6__ = (CreateDataProperty obj "enumerable" Desc["Enumerable"])
      __x6__
    } else {}
    if (! (= Desc["Configurable"] absent)) {
      app __x7__ = (CreateDataProperty obj "configurable" Desc["Configurable"])
      __x7__
    } else {}
    app __x8__ = (WrapCompletion obj)
    return __x8__
  }
  */
}
