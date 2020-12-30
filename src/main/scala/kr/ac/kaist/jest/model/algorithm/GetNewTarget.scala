package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetNewTarget extends Algorithm {
  val name: String = "GetNewTarget"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetNewTarget" () => {
    app __x0__ = (GetThisEnvironment )
    let envRec = __x0__
    assert (! (= envRec["NewTarget"] absent))
    app __x1__ = (WrapCompletion envRec["NewTarget"])
    return __x1__
  }"""), this)
}
