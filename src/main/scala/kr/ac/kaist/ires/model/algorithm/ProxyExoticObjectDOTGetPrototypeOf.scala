package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyExoticObjectDOTGetPrototypeOf {
  val length: Int = 0
  val func: Func = Func("""ProxyExoticObject.GetPrototypeOf""", List(Id("""O""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""handler"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""getPrototypeOf"""))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""trap"""), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""handlerProto"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""handlerProto"""))))), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Object""")))), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Null""")))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x8__"""))))), ISeq(List())), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x8__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""handlerProto"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IApp(Id("""__x10__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""target"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x10__"""))))), ISeq(List())), ILet(Id("""targetProto"""), ERef(RefId(Id("""__x10__""")))), IApp(Id("""__x11__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""handlerProto"""))), ERef(RefId(Id("""targetProto"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x11__"""))), EBool(false)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""handlerProto"""))))), IReturn(ERef(RefId(Id("""__x13__""")))))))
  /* Beautified form:
  "ProxyExoticObject.GetPrototypeOf" (O) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (Type handler)
    assert (= __x1__ Object)
    let target = O["ProxyTarget"]
    app __x2__ = (GetMethod handler "getPrototypeOf")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let trap = __x2__
    if (= trap undefined) {
      app __x3__ = (target["GetPrototypeOf"] target)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (Call trap handler (new [target]))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let handlerProto = __x5__
    app __x6__ = (Type handlerProto)
    if (! (|| (= __x6__ Object) (= __x6__ Null))) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    app __x8__ = (IsExtensible target)
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let extensibleTarget = __x8__
    if (= extensibleTarget true) {
      app __x9__ = (WrapCompletion handlerProto)
      return __x9__
    } else {}
    app __x10__ = (target["GetPrototypeOf"] target)
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    let targetProto = __x10__
    app __x11__ = (SameValue handlerProto targetProto)
    if (= __x11__ false) {
      app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x12__
    } else {}
    app __x13__ = (WrapCompletion handlerProto)
    return __x13__
  }
  */
}
