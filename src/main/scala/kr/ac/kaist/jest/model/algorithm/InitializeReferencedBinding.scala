package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object InitializeReferencedBinding extends Algorithm {
  val name: String = "InitializeReferencedBinding"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""InitializeReferencedBinding" (V, W) => {
    if (is-completion V) if (= V["Type"] CONST_normal) V = V["Value"] else return V else {}
    V
    if (is-completion W) if (= W["Type"] CONST_normal) W = W["Value"] else return W else {}
    W
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    app __x1__ = (IsUnresolvableReference V)
    assert (= __x1__ false)
    app __x2__ = (GetBase V)
    let base = __x2__
    app __x3__ = (GetReferencedName V)
    app __x4__ = (base["InitializeBinding"] base __x3__ W)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
