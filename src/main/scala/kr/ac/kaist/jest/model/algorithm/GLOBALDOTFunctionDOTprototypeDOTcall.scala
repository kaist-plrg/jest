package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTFunctionDOTprototypeDOTcall extends Algorithm {
  val name: String = "GLOBALDOTFunctionDOTprototypeDOTcall"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Function.prototype.call" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let thisArg = __x0__
    let func = this
    app __x1__ = (IsCallable func)
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let argList = (new [])
    if (< 0i argumentsList["length"]) (pop argumentsList 0i) else {}
    argList = argumentsList
    app __x3__ = (PrepareForTailCall )
    __x3__
    app __x4__ = (Call func thisArg argList)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
