package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetFunctionLength {
  val length: Int = 2
  val func: Func = Func("""SetFunctionLength""", List(Id("""F"""), Id("""length""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""length"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Number"""))))), ILet(Id("""__x1__"""), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""length"""))), EINum(0L)))), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""length"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IAssign(RefId(Id("""__x1__""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true))))), ISeq(List())), IAssert(ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""length""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "SetFunctionLength" (F, length) => {
    app __x0__ = (Type length)
    assert (= __x0__ Number)
    let __x1__ = (! (< length 0i))
    if __x1__ {
      app __x2__ = (IsInteger length)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x1__ = (= __x2__ true)
    } else {}
    assert __x1__
    app __x3__ = (DefinePropertyOrThrow F "length" (new PropertyDescriptor("Value" -> length, "Writable" -> false, "Enumerable" -> false, "Configurable" -> true)))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
