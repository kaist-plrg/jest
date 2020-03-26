package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object thisStringValue {
  val length: Int = 0
  val func: Func = Func("""thisStringValue""", List(Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""StringData"""))), EAbsent))), ISeq(List(ILet(Id("""s"""), ERef(RefProp(RefId(Id("""value""")), EStr("""StringData""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""s"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""String"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""s"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "thisStringValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ String) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["StringData"] absent))) {
      let s = value["StringData"]
      app __x3__ = (Type s)
      assert (= __x3__ String)
      app __x4__ = (WrapCompletion s)
      return __x4__
    } else {}
    app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x5__
  }
  */
}
