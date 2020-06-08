package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryOwnPropertyKeys extends Algorithm {
  val name: String = "OrdinaryOwnPropertyKeys"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryOwnPropertyKeys" (O) => {
    let keys = (new [])
    !!! "For each own property key id:{P} of id:{O} such that id:{P} is an array index , in ascending numeric index order , do step-list:{...}"
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion keys)
    return __x0__
  }"""), this)
}
