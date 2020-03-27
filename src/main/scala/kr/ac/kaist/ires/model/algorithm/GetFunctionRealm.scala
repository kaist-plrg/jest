package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetFunctionRealm {
  val length: Int = 1
  val func: Func = Func("""GetFunctionRealm""", List(Id("""obj""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""obj"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Realm"""))), EAbsent)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""obj""")), EStr("""Realm"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""obj""")))), EStr("""BoundFunctionExoticObject""")), ISeq(List(ILet(Id("""target"""), ERef(RefProp(RefId(Id("""obj""")), EStr("""BoundTargetFunction""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetFunctionRealm"""))), List(ERef(RefId(Id("""target"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))), ISeq(List())), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""obj""")))), EStr("""ProxyExoticObject""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""ProxyHandler"""))), ENull), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), ILet(Id("""proxyTarget"""), ERef(RefProp(RefId(Id("""obj""")), EStr("""ProxyTarget""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetFunctionRealm"""))), List(ERef(RefId(Id("""proxyTarget"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""REALM"""))))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "GetFunctionRealm" (obj) => {
    app __x0__ = (IsCallable obj)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    assert (= __x0__ true)
    if (! (= obj["Realm"] absent)) {
      app __x1__ = (WrapCompletion obj["Realm"])
      return __x1__
    } else {}
    if (= (typeof obj) "BoundFunctionExoticObject") {
      let target = obj["BoundTargetFunction"]
      app __x2__ = (GetFunctionRealm target)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    if (= (typeof obj) "ProxyExoticObject") {
      if (= obj["ProxyHandler"] null) {
        app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x4__
      } else {}
      let proxyTarget = obj["ProxyTarget"]
      app __x5__ = (GetFunctionRealm proxyTarget)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    app __x7__ = (WrapCompletion REALM)
    return __x7__
  }
  */
}
