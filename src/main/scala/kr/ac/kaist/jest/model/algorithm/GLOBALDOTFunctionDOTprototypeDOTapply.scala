package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTFunctionDOTprototypeDOTapply extends Algorithm {
  val name: String = "GLOBALDOTFunctionDOTprototypeDOTapply"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Function.prototype.apply" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let thisArg = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let argArray = __x1__
    let func = this
    app __x2__ = (IsCallable func)
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    if (|| (= argArray undefined) (= argArray null)) {
      app __x4__ = (PrepareForTailCall )
      __x4__
      app __x5__ = (Call func thisArg)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    app __x7__ = (CreateListFromArrayLike argArray)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let argList = __x7__
    app __x8__ = (PrepareForTailCall )
    __x8__
    app __x9__ = (Call func thisArg argList)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }"""), this)
}
