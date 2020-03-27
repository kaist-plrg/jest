package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetValue {
  val length: Int = 1
  val func: Func = Func("""GetValue""", List(Id("""V""")), None, ISeq(List(IIf(EIsCompletion(ERef(RefId(Id("""V""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""V""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""V"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""V""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""V"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Reference"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""V"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""V"""))))), ILet(Id("""base"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsUnresolvableReference"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""HasPrimitiveBase"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""base"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), IAssign(RefId(Id("""base""")), ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""GetThisValue"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x10__"""), ERef(RefProp(RefId(Id("""base""")), EStr("""Get"""))), List(ERef(RefId(Id("""base"""))), ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""__x9__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x13__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x14__"""), ERef(RefProp(RefId(Id("""base""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""base"""))), ERef(RefId(Id("""__x12__"""))), ERef(RefId(Id("""__x13__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x14__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x14__"""))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x14__"""))))), IReturn(ERef(RefId(Id("""__x15__"""))))))))))
  /* Beautified form:
  "GetValue" (V) => {
    if (is-completion V) if (= V["Type"] CONST_normal) V = V["Value"] else return V else {}
    V
    app __x0__ = (Type V)
    if (! (= __x0__ Reference)) {
      app __x1__ = (WrapCompletion V)
      return __x1__
    } else {}
    app __x2__ = (GetBase V)
    let base = __x2__
    app __x3__ = (IsUnresolvableReference V)
    if (= __x3__ true) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (IsPropertyReference V)
    if (= __x5__ true) {
      app __x6__ = (HasPrimitiveBase V)
      if (= __x6__ true) {
        app __x7__ = (ToObject base)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        base = __x7__
      } else {}
      app __x8__ = (GetReferencedName V)
      app __x9__ = (GetThisValue V)
      app __x10__ = (base["Get"] base __x8__ __x9__)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {
      app __x12__ = (GetReferencedName V)
      app __x13__ = (IsStrictReference V)
      app __x14__ = (base["GetBindingValue"] base __x12__ __x13__)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      app __x15__ = (WrapCompletion __x14__)
      return __x15__
    }
  }
  */
}
