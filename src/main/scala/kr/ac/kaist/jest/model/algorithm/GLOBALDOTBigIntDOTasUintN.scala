package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTBigIntDOTasUintN extends Algorithm {
  val name: String = "GLOBALDOTBigIntDOTasUintN"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.BigInt.asUintN" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let bits = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let bigint = __x1__
    app __x2__ = (ToIndex bits)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let bits = __x2__
    app __x3__ = (ToBigInt bigint)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let bigint = __x3__
    return (%% (convert bigint num2bigint ) (** 2n (convert bits num2bigint )))
  }"""), this)
}
