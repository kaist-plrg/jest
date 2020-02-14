package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression1Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")), ILet(Id("""ref"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""ref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""ref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""ref""")), ERef(RefProp(RefId(Id("""ref""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""ref"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""ref""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Reference"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsUnresolvableReference"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IsSuperReference"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""ref"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""__x8__"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x9__"""))))), ISeq(List())), ILet(Id("""baseObj"""), ERef(RefId(Id("""__x9__""")))), IApp(Id("""__x10__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""ref"""))))), IApp(Id("""__x11__"""), ERef(RefProp(RefId(Id("""baseObj""")), EStr("""Delete"""))), List(ERef(RefId(Id("""baseObj"""))), ERef(RefId(Id("""__x10__"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), ILet(Id("""deleteStatus"""), ERef(RefId(Id("""__x11__""")))), ILet(Id("""__x12__"""), EBOp(OEq, ERef(RefId(Id("""deleteStatus"""))), EBool(false))), IIf(ERef(RefId(Id("""__x12__"""))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""ref"""))))), IAssign(RefId(Id("""__x12__""")), EBOp(OEq, ERef(RefId(Id("""__x13__"""))), EBool(true))))), ISeq(List())), IIf(ERef(RefId(Id("""__x12__"""))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""deleteStatus"""))))), IReturn(ERef(RefId(Id("""__x15__""")))))), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""ref"""))))), ILet(Id("""bindings"""), ERef(RefId(Id("""__x16__""")))), IApp(Id("""__x17__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""ref"""))))), IApp(Id("""__x18__"""), ERef(RefProp(RefId(Id("""bindings""")), EStr("""DeleteBinding"""))), List(ERef(RefId(Id("""bindings"""))), ERef(RefId(Id("""__x17__"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x18__"""))))), ISeq(List())), IApp(Id("""__x19__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x18__"""))))), IReturn(ERef(RefId(Id("""__x19__"""))))))))))
  /* Beautified form:
  "UnaryExpression1Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let ref = __x0__
    if (= (typeof ref) "Completion") if (= ref["Type"] CONST_normal) ref = ref["Value"] else return ref else {}
    ref
    app __x1__ = (Type ref)
    if (! (= __x1__ Reference)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (IsUnresolvableReference ref)
    if (= __x3__ true) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    app __x5__ = (IsPropertyReference ref)
    if (= __x5__ true) {
      app __x6__ = (IsSuperReference ref)
      if (= __x6__ true) {
        app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x7__
      } else {}
      app __x8__ = (GetBase ref)
      app __x9__ = (ToObject __x8__)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let baseObj = __x9__
      app __x10__ = (GetReferencedName ref)
      app __x11__ = (baseObj["Delete"] baseObj __x10__)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let deleteStatus = __x11__
      let __x12__ = (= deleteStatus false)
      if __x12__ {
        app __x13__ = (IsStrictReference ref)
        __x12__ = (= __x13__ true)
      } else {}
      if __x12__ {
        app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x14__
      } else {}
      app __x15__ = (WrapCompletion deleteStatus)
      return __x15__
    } else {
      app __x16__ = (GetBase ref)
      let bindings = __x16__
      app __x17__ = (GetReferencedName ref)
      app __x18__ = (bindings["DeleteBinding"] bindings __x17__)
      if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
      app __x19__ = (WrapCompletion __x18__)
      return __x19__
    }
  }
  */
}
