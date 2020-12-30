package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MakeMethod extends Algorithm {
  val name: String = "MakeMethod"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MakeMethod" (F, homeObject) => {
    app __x0__ = (Type homeObject)
    assert (= __x0__ Object)
    F["HomeObject"] = homeObject
    app __x1__ = (NormalCompletion undefined)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
