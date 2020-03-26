package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyExoticObjectDOTHasProperty {
  val length: Int = 1
  val func: Func = Func("""ProxyExoticObject.HasProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPropertyKey"""))), List(ERef(RefId(Id("""P"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""handler"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""has"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""trap"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""HasProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x6__"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), ILet(Id("""booleanTrapResult"""), ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""booleanTrapResult"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""targetDesc"""), ERef(RefId(Id("""__x8__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""targetDesc"""))), EUndef)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x10__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(false)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x11__""")))))), ISeq(List())))), ISeq(List())))), ISeq(List())), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""booleanTrapResult"""))))), IReturn(ERef(RefId(Id("""__x12__""")))))))
  /* Beautified form:
  "ProxyExoticObject.HasProperty" (O, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (Type handler)
    assert (= __x2__ Object)
    let target = O["ProxyTarget"]
    app __x3__ = (GetMethod handler "has")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let trap = __x3__
    if (= trap undefined) {
      app __x4__ = (target["HasProperty"] target P)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (Call trap handler (new [target, P]))
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (ToBoolean __x6__)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let booleanTrapResult = __x7__
    if (= booleanTrapResult false) {
      app __x8__ = (target["GetOwnProperty"] target P)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let targetDesc = __x8__
      if (! (= targetDesc undefined)) {
        if (= targetDesc["Configurable"] false) {
          app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x9__
        } else {}
        app __x10__ = (IsExtensible target)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let extensibleTarget = __x10__
        if (= extensibleTarget false) {
          app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x11__
        } else {}
      } else {}
    } else {}
    app __x12__ = (WrapCompletion booleanTrapResult)
    return __x12__
  }
  */
}
