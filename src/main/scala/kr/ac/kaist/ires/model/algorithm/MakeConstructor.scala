package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeConstructor {
  val length: Int = 1
  val func: Func = Func("""MakeConstructor""", List(Id("""F"""), Id("""writablePrototype"""), Id("""prototype""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""F"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IIf(EBOp(OEq, ERef(RefId(Id("""writablePrototype"""))), EAbsent), IAssign(RefId(Id("""writablePrototype""")), EBool(true)), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""prototype"""))), EAbsent), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))), IAssign(RefId(Id("""prototype""")), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""prototype"""))), EStr("""constructor"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""F""")))), (EStr("""Writable"""), ERef(RefId(Id("""writablePrototype""")))), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), ERef(RefId(Id("""writablePrototype""")))), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "MakeConstructor" (F, writablePrototype, prototype) => {
    app __x0__ = (IsConstructor F)
    assert (= __x0__ true)
    if (= writablePrototype absent) writablePrototype = true else {}
    if (= prototype absent) {
      app __x1__ = (ObjectCreate INTRINSIC_ObjectPrototype)
      prototype = __x1__
      app __x2__ = (DefinePropertyOrThrow prototype "constructor" (new PropertyDescriptor("Value" -> F, "Writable" -> writablePrototype, "Enumerable" -> false, "Configurable" -> true)))
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
    } else {}
    app __x3__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> writablePrototype, "Enumerable" -> false, "Configurable" -> false)))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (NormalCompletion undefined)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
