package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTObjectDOTprototypeDOTisPrototypeOf extends Algorithm {
  val name: String = "GLOBALDOTObjectDOTprototypeDOTisPrototypeOf"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Object.prototype.isPrototypeOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let V = __x0__
    app __x1__ = (Type V)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (ToObject this)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    while true {
      app __x4__ = (V["GetPrototypeOf"] V)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      V = __x4__
      if (= V null) {
        app __x5__ = (WrapCompletion false)
        return __x5__
      } else {}
      app __x6__ = (SameValue O V)
      if (= __x6__ true) {
        app __x7__ = (WrapCompletion true)
        return __x7__
      } else {}
    }
  }"""), this)
}
