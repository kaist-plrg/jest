package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression1Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")), ILet(Id("""ref"""), ERef(RefId(Id("""__x0__""")))), IIf(EIsCompletion(ERef(RefId(Id("""ref""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""ref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""ref""")), ERef(RefProp(RefId(Id("""ref""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""ref"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""ref""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Reference"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsUnresolvableReference"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""ref"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""IsSuperReference"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IApp(Id("""__x9__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""ref"""))))), IApp(Id("""__x10__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""__x9__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), ILet(Id("""baseObj"""), ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""ref"""))))), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""baseObj""")), EStr("""Delete"""))), List(ERef(RefId(Id("""baseObj"""))), ERef(RefId(Id("""__x11__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x12__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), ILet(Id("""deleteStatus"""), ERef(RefId(Id("""__x12__""")))), ILet(Id("""__x13__"""), EBOp(OEq, ERef(RefId(Id("""deleteStatus"""))), EBool(false))), IIf(ERef(RefId(Id("""__x13__"""))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""ref"""))))), IAssign(RefId(Id("""__x13__""")), EBOp(OEq, ERef(RefId(Id("""__x14__"""))), EBool(true))))), ISeq(List())), IIf(ERef(RefId(Id("""__x13__"""))), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x15__""")))))), ISeq(List())), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""deleteStatus"""))))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""ref"""))))), ILet(Id("""bindings"""), ERef(RefId(Id("""__x17__""")))), IApp(Id("""__x18__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""ref"""))))), IApp(Id("""__x19__"""), ERef(RefProp(RefId(Id("""bindings""")), EStr("""DeleteBinding"""))), List(ERef(RefId(Id("""bindings"""))), ERef(RefId(Id("""__x18__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x19__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x19__"""))))), ISeq(List())), IApp(Id("""__x20__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x19__"""))))), IReturn(ERef(RefId(Id("""__x20__"""))))))))))
  /* Beautified form:
  "UnaryExpression1Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let ref = __x0__
    if (is-completion ref) if (= ref["Type"] CONST_normal) ref = ref["Value"] else return ref else {}
    ref
    app __x1__ = (Type ref)
    if (! (= __x1__ Reference)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (IsUnresolvableReference ref)
    if (= __x3__ true) {
      app __x4__ = (IsStrictReference ref)
      assert (= __x4__ false)
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    app __x6__ = (IsPropertyReference ref)
    if (= __x6__ true) {
      app __x7__ = (IsSuperReference ref)
      if (= __x7__ true) {
        app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x8__
      } else {}
      app __x9__ = (GetBase ref)
      app __x10__ = (ToObject __x9__)
      if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let baseObj = __x10__
      app __x11__ = (GetReferencedName ref)
      app __x12__ = (baseObj["Delete"] baseObj __x11__)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let deleteStatus = __x12__
      let __x13__ = (= deleteStatus false)
      if __x13__ {
        app __x14__ = (IsStrictReference ref)
        __x13__ = (= __x14__ true)
      } else {}
      if __x13__ {
        app __x15__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x15__
      } else {}
      app __x16__ = (WrapCompletion deleteStatus)
      return __x16__
    } else {
      app __x17__ = (GetBase ref)
      let bindings = __x17__
      app __x18__ = (GetReferencedName ref)
      app __x19__ = (bindings["DeleteBinding"] bindings __x18__)
      if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      app __x20__ = (WrapCompletion __x19__)
      return __x20__
    }
  }
  */
}
