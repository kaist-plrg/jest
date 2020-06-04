package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetNewTarget extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetNewTarget" () => {
    app __x0__ = (GetThisEnvironment )
    let envRec = __x0__
    assert (! (= envRec["NewTarget"] absent))
    app __x1__ = (WrapCompletion envRec["NewTarget"])
    return __x1__
  }"""))
}
