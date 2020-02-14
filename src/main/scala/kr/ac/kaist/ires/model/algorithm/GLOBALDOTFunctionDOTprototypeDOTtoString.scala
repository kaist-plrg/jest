package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFunctionDOTprototypeDOTtoString {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Function.prototype.toString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""func"""), ERef(RefId(Id("""this""")))), IIf(EBOp(OOr, EBOp(OEq, ETypeOf(ERef(RefId(Id("""func""")))), EStr("""BoundFunctionExoticObject""")), EBOp(OEq, ETypeOf(ERef(RefId(Id("""func""")))), EStr("""BuiltinFunctionObject"""))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr(""""""))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""func"""))))), ILet(Id("""__x2__"""), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(ILet(Id("""__x3__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""func""")), EStr("""SourceText"""))), EAbsent))), IIf(ERef(RefId(Id("""__x3__"""))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""func""")), EStr("""SourceText"""))))), ILet(Id("""__x5__"""), EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""String"""))))), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""HostHasSourceTextAvailable"""))), List(ERef(RefId(Id("""func"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IAssign(RefId(Id("""__x5__""")), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true))))), ISeq(List())), IAssign(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IAssign(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""func""")), EStr("""SourceText"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""func"""))))), ILet(Id("""__x9__"""), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Object"""))))), IIf(ERef(RefId(Id("""__x9__"""))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""func"""))))), IAssign(RefId(Id("""__x9__""")), EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(true))))), ISeq(List())), IIf(ERef(RefId(Id("""__x9__"""))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr(""""""))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "GLOBAL.Function.prototype.toString" (this, argumentsList, NewTarget) => {
    let func = this
    if (|| (= (typeof func) "BoundFunctionExoticObject") (= (typeof func) "BuiltinFunctionObject")) {
      app __x0__ = (WrapCompletion "")
      return __x0__
    } else {}
    app __x1__ = (Type func)
    let __x2__ = (= __x1__ Object)
    if __x2__ {
      let __x3__ = (! (= func["SourceText"] absent))
      if __x3__ {
        app __x4__ = (Type func["SourceText"])
        let __x5__ = (= __x4__ String)
        if __x5__ {
          app __x6__ = (HostHasSourceTextAvailable func)
          if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          __x5__ = (= __x6__ true)
        } else {}
        __x3__ = __x5__
      } else {}
      __x2__ = __x3__
    } else {}
    if __x2__ {
      app __x7__ = (WrapCompletion func["SourceText"])
      return __x7__
    } else {}
    app __x8__ = (Type func)
    let __x9__ = (= __x8__ Object)
    if __x9__ {
      app __x10__ = (IsCallable func)
      __x9__ = (= __x10__ true)
    } else {}
    if __x9__ {
      app __x11__ = (WrapCompletion "")
      return __x11__
    } else {}
    app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x12__
  }
  */
}
