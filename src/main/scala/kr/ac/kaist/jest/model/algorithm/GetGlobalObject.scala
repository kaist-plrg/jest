package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetGlobalObject extends Algorithm {
  val name: String = "GetGlobalObject"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetGlobalObject" () => {
    let currentRealm = REALM
    app __x0__ = (WrapCompletion currentRealm["GlobalObject"])
    return __x0__
  }"""), this)
}
