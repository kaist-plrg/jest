package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetFunctionRealm extends Algorithm {
  val name: String = "GetFunctionRealm"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetFunctionRealm" (obj) => {
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
  }"""), this)
}
