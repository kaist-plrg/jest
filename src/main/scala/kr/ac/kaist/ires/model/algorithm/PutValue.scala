package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PutValue {
  val length: Int = 2
  val func: Func = Func("""PutValue""", List(Id("""V"""), Id("""W""")), None, ISeq(List(IIf(EIsCompletion(ERef(RefId(Id("""V""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""V""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""V"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""V""")))), IIf(EIsCompletion(ERef(RefId(Id("""W""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""W""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""W""")), ERef(RefProp(RefId(Id("""W""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""W"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""W""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""V"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Reference"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""V"""))))), ILet(Id("""base"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsUnresolvableReference"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetGlobalObject"""))), List()), ILet(Id("""globalObj"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""globalObj"""))), ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""W"""))), EBool(false))), IIf(EIsCompletion(ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(true)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""HasPrimitiveBase"""))), List(ERef(RefId(Id("""V"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x11__"""))), EBool(true)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""base"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x12__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x12__"""))))), ISeq(List())), IAssign(RefId(Id("""base""")), ERef(RefId(Id("""__x12__""")))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x14__"""), ERef(RefId(Id("""GetThisValue"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x15__"""), ERef(RefProp(RefId(Id("""base""")), EStr("""Set"""))), List(ERef(RefId(Id("""base"""))), ERef(RefId(Id("""__x13__"""))), ERef(RefId(Id("""W"""))), ERef(RefId(Id("""__x14__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x15__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x15__"""))))), ISeq(List())), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x15__""")))), ILet(Id("""__x16__"""), EBOp(OEq, ERef(RefId(Id("""succeeded"""))), EBool(false))), IIf(ERef(RefId(Id("""__x16__"""))), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""V"""))))), IAssign(RefId(Id("""__x16__""")), EBOp(OEq, ERef(RefId(Id("""__x17__"""))), EBool(true))))), ISeq(List())), IIf(ERef(RefId(Id("""__x16__"""))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x18__""")))))), ISeq(List())), IApp(Id("""__x19__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x19__""")))))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x21__"""), ERef(RefId(Id("""IsStrictReference"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x22__"""), ERef(RefProp(RefId(Id("""base""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""base"""))), ERef(RefId(Id("""__x20__"""))), ERef(RefId(Id("""W"""))), ERef(RefId(Id("""__x21__"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x22__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x22__""")), ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x22__"""))))), ISeq(List())), IApp(Id("""__x23__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x22__"""))))), IReturn(ERef(RefId(Id("""__x23__""")))))))))))))
  /* Beautified form:
  "PutValue" (V, W) => {
    if (is-completion V) if (= V["Type"] CONST_normal) V = V["Value"] else return V else {}
    V
    if (is-completion W) if (= W["Type"] CONST_normal) W = W["Value"] else return W else {}
    W
    app __x0__ = (Type V)
    if (! (= __x0__ Reference)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (GetBase V)
    let base = __x2__
    app __x3__ = (IsUnresolvableReference V)
    if (= __x3__ true) {
      app __x4__ = (IsStrictReference V)
      if (= __x4__ true) {
        app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x5__
      } else {}
      app __x6__ = (GetGlobalObject )
      let globalObj = __x6__
      app __x7__ = (GetReferencedName V)
      app __x8__ = (Set globalObj __x7__ W false)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {
      app __x10__ = (IsPropertyReference V)
      if (= __x10__ true) {
        app __x11__ = (HasPrimitiveBase V)
        if (= __x11__ true) {
          app __x12__ = (ToObject base)
          if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
          base = __x12__
        } else {}
        app __x13__ = (GetReferencedName V)
        app __x14__ = (GetThisValue V)
        app __x15__ = (base["Set"] base __x13__ W __x14__)
        if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        let succeeded = __x15__
        let __x16__ = (= succeeded false)
        if __x16__ {
          app __x17__ = (IsStrictReference V)
          __x16__ = (= __x17__ true)
        } else {}
        if __x16__ {
          app __x18__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x18__
        } else {}
        app __x19__ = (NormalCompletion undefined)
        return __x19__
      } else {
        app __x20__ = (GetReferencedName V)
        app __x21__ = (IsStrictReference V)
        app __x22__ = (base["SetMutableBinding"] base __x20__ W __x21__)
        if (is-completion __x22__) if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
        app __x23__ = (WrapCompletion __x22__)
        return __x23__
      }
    }
  }
  */
}
