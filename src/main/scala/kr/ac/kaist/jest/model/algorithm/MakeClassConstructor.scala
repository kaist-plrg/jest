package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MakeClassConstructor extends Algorithm {
  val name: String = "MakeClassConstructor"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MakeClassConstructor" (F) => {
    assert (= F["IsClassConstructor"] false)
    F["IsClassConstructor"] = true
    app __x0__ = (NormalCompletion undefined)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
