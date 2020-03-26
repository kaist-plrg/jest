package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetMethod {
  val length: Int = 2
  val func: Func = Func("""GetMethod""", List(Id("""V"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""V"""))), ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""func"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""func"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""func"""))), ENull)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""func"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""func"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "GetMethod" (V, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (GetV V P)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let func = __x1__
    if (|| (= func undefined) (= func null)) {
      app __x2__ = (WrapCompletion undefined)
      return __x2__
    } else {}
    app __x3__ = (IsCallable func)
    if (= __x3__ false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion func)
    return __x5__
  }
  */
}
