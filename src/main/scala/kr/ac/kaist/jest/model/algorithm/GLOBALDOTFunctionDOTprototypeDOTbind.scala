package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTFunctionDOTprototypeDOTbind extends Algorithm {
  val name: String = "GLOBALDOTFunctionDOTprototypeDOTbind"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Function.prototype.bind" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let thisArg = __x0__
    let Target = this
    app __x1__ = (IsCallable Target)
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    if (< 0i argumentsList["length"]) (pop argumentsList 0i) else {}
    let args = argumentsList
    app __x3__ = (BoundFunctionCreate Target thisArg args)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let F = __x3__
    app __x4__ = (HasOwnProperty Target "length")
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let targetHasLength = __x4__
    if (= targetHasLength true) {
      app __x5__ = (Get Target "length")
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let targetLen = __x5__
      app __x6__ = (Type targetLen)
      if (! (= __x6__ Number)) let L = 0i else {
        app __x7__ = (ToInteger targetLen)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        targetLen = __x7__
        if (< 0i (- targetLen args["length"])) let __x8__ = (- targetLen args["length"]) else let __x8__ = 0i
        let L = __x8__
      }
    } else let L = 0i
    app __x9__ = (SetFunctionLength F L)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    __x9__
    app __x10__ = (Get Target "name")
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    let targetName = __x10__
    app __x11__ = (Type targetName)
    if (! (= __x11__ String)) targetName = "" else {}
    app __x12__ = (SetFunctionName F targetName "bound")
    __x12__
    app __x13__ = (WrapCompletion F)
    return __x13__
  }"""), this)
}
