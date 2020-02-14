package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CompletePropertyDescriptor {
  val length: Int = 1
  val func: Func = Func("""CompletePropertyDescriptor""", List(Id("""Desc""")), None, ISeq(List(ILet(Id("""like"""), EMap(Ty("""Record"""), List((EStr("""Value"""), EUndef), (EStr("""Writable"""), EBool(false)), (EStr("""Get"""), EUndef), (EStr("""Set"""), EUndef), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false))))), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsGenericDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), ILet(Id("""__x1__"""), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List()), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))), IAssign(RefId(Id("""__x1__""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)))))), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Value""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Value""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Writable""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Writable""")))), ISeq(List())))), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Get""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Get""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Set""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Set""")))), ISeq(List()))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Enumerable""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EAbsent), IAssign(RefProp(RefId(Id("""Desc""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""like""")), EStr("""Configurable""")))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""Desc"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "CompletePropertyDescriptor" (Desc) => {
    let like = (new Record("Value" -> undefined, "Writable" -> false, "Get" -> undefined, "Set" -> undefined, "Enumerable" -> false, "Configurable" -> false))
    app __x0__ = (IsGenericDescriptor Desc)
    let __x1__ = (= __x0__ true)
    if __x1__ {} else {
      app __x2__ = (IsDataDescriptor Desc)
      __x1__ = (= __x2__ true)
    }
    if __x1__ {
      if (= Desc["Value"] absent) Desc["Value"] = like["Value"] else {}
      if (= Desc["Writable"] absent) Desc["Writable"] = like["Writable"] else {}
    } else {
      if (= Desc["Get"] absent) Desc["Get"] = like["Get"] else {}
      if (= Desc["Set"] absent) Desc["Set"] = like["Set"] else {}
    }
    if (= Desc["Enumerable"] absent) Desc["Enumerable"] = like["Enumerable"] else {}
    if (= Desc["Configurable"] absent) Desc["Configurable"] = like["Configurable"] else {}
    app __x3__ = (WrapCompletion Desc)
    return __x3__
  }
  */
}
