package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ProxyExoticObjectDOTConstruct extends Algorithm {
  val name: String = "ProxyExoticObjectDOTConstruct"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ProxyExoticObject.Construct" (O, argumentsList, newTarget) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (Type handler)
    assert (= __x1__ Object)
    let target = O["ProxyTarget"]
    app __x2__ = (IsConstructor target)
    assert (= __x2__ true)
    app __x3__ = (GetMethod handler "construct")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let trap = __x3__
    if (= trap undefined) {
      app __x4__ = (Construct target argumentsList newTarget)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (CreateArrayFromList argumentsList)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let argArray = __x6__
    app __x7__ = (Call trap handler (new [target, argArray, newTarget]))
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let newObj = __x7__
    app __x8__ = (Type newObj)
    if (! (= __x8__ Object)) {
      app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x9__
    } else {}
    app __x10__ = (WrapCompletion newObj)
    return __x10__
  }"""), this)
}
